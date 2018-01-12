package se.mdh.progresside.uppaal.launch.verifyer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Decompiled from original UPPAAL, limitation - queries on multiple lines are
 * not stored correctly - fix this.
 * 
 */
public class QueryParser {

	private static final String NO_QUERY = "//NO_QUERY";
	private static final String ENCODING_ISO_8859_1 = "ISO-8859-1";

	public static List<Query> loadQueries(File queriesFile)
			throws UnsupportedEncodingException, IOException {

		List<Query> result = new ArrayList<Query>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(queriesFile), ENCODING_ISO_8859_1));
		try {
			while (reader.ready()) {
				String line;
				if (((line = reader.readLine()).length() > 0)
						&& (!((String) line).startsWith("//"))) {
					String comment = "";
					if (((String) line).equals("/*")) {
						if (!(line = reader.readLine()).equals("*/")) {
							comment = (String) comment + (String) line;
							for (line = reader.readLine(); !((String) line)
									.equals("*/"); line = reader.readLine())
								comment = (String) comment + '\n'
										+ (String) line;
							comment = doSomething(comment = (comment = ((String) comment)
									.replaceAll("([^\\\\]?)\\\\/", "$1/"))
									.replaceAll("\\\\\\\\", "\\\\"));
						}
						line = reader.readLine();
					}
					StringBuffer query = new StringBuffer();
					if (!((String) line).equals(NO_QUERY)) {
						while (((String) line).endsWith("\\")) {
							query.append(
									((String) line).substring(0,
											((String) line).length() - 1))
									.append('\n');
							line = reader.readLine();
						}
						query.append((String) line);
					}
					result.add(new Query(query.toString(), comment));
				}
			}
		} finally {
			reader.close();
		}
		return result;
	}

	public static void saveQueries(List<Query> queries, File queriesFile)
			throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(queriesFile), ENCODING_ISO_8859_1));
		try {
			for (Query q : queries) {
				writer.write("/*\n");
				writer.write(q.getComment() + "\n");
				writer.write("*/\n");

				if (q.getQuery().isEmpty()) {
					writer.write(NO_QUERY + "\n");
				} else {
					writer.write(q.getQuery() + "\n");
				}
				writer.write("\n");

			}
		} finally {
			writer.close();
		}
	}

	private static String doSomething(String paramString) {
		int i = 0;
		StringBuffer localStringBuffer = new StringBuffer(paramString);
		while ((i = localStringBuffer.indexOf("\\u", i)) >= 0) {
			if (i + 6 > localStringBuffer.length())
				return localStringBuffer.toString();
			char[] arrayOfChar = new char[4];
			localStringBuffer.getChars(i + 2, i + 6, arrayOfChar, 0);
			int j = 0;
			for (j = 0; j < 4; j++)
				if (((arrayOfChar[j] < '0') || (arrayOfChar[j] > '9'))
						&& ((arrayOfChar[j] < 'a') || (arrayOfChar[j] > 'f')))
					return localStringBuffer.toString();
			j = (char) (doSomethingElse(arrayOfChar[0]) << 12
					| doSomethingElse(arrayOfChar[1]) << 8
					| doSomethingElse(arrayOfChar[2]) << 4 | doSomethingElse(arrayOfChar[3]));
			localStringBuffer.delete(i, i + 6);
			localStringBuffer.insert(i, paramString);
		}
		return localStringBuffer.toString();
	}

	private static int doSomethingElse(char paramChar) {
		if (paramChar >= 'a')
			return paramChar + '\n' - 97;
		return paramChar - '0';
	}

}
