package se.mdh.progresside.uppaal.launch.verifyer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Control;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class OptionsHelper {

	public static Option[] readFromXml(String xml)
			throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		documentBuilderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = documentBuilderFactory
				.newDocumentBuilder();
		Document document = documentBuilder.parse(new ByteArrayInputStream(xml
				.getBytes()));

		NodeList optionsElement = document.getElementsByTagName("option");

		Option[] options = new Option[optionsElement.getLength()];

		for (int i = 0; i < optionsElement.getLength(); i++) {
			Element optionElement = (Element) optionsElement.item(i);
			String name = optionElement.getAttribute("name");
			String type = optionElement.getAttribute("type");
			String def = optionElement.getAttribute("default");
			String display = optionElement.getAttribute("display");

			if ("choice".equals(type)) {
				NodeList choicesElement = optionElement
						.getElementsByTagName("choice");

				Choice[] choices = new Choice[choicesElement.getLength()];
				for (int j = 0; j < choicesElement.getLength(); j++) {
					Element choiceElement = (Element) choicesElement.item(j);
					String choiceName = choiceElement.getAttribute("name");
					String choiceDisplay = choiceElement
							.getAttribute("display");
					choices[j] = new Choice(choiceName, choiceDisplay);
				}
				options[i] = new ChoiceOption(name, type, def, display, choices);
			} else {
				options[i] = new Option(name, type, def, display);
			}
		}

		return options;
	}

	public static String getOptionsAttribute(Control[] controls) {
		StringBuffer sb = new StringBuffer();
		for (Control c : controls) {
			Option option = (Option) c
					.getData(UppaalVerifierLaunchConfigurationOptionsTab.UPPAAL_OPTION_DATA_KEY);
			sb.append(option.getName() + " ");
			if (c instanceof Combo) {
				Combo combo = (Combo) c;
				int selectionIndex = combo.getSelectionIndex();
				if (selectionIndex > -1) {
					String selectedInCombo = combo.getItems()[selectionIndex];
					String choiceName = ((ChoiceOption) option)
							.getNameForDisplayName(selectedInCombo);
					sb.append(choiceName);
				} else {
					sb.append(option.getDef());
				}
			} else if (c instanceof Button) {
				String value = ((Button) c).getSelection() ? "1" : "0";
				sb.append(value);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void initControlsFromOptions(String optionsString,
			Control[] controls) {

		StringTokenizer tokenizer = new StringTokenizer(optionsString, "\n");
		Map<String, String> optionNameValueMap = new HashMap<String, String>();

		while (tokenizer.hasMoreTokens()) {
			String nextToken = tokenizer.nextToken();
			String[] s = nextToken.split(" ");
			optionNameValueMap.put(s[0], s[1]);
		}

		for (Control c : controls) {
			Option option = (Option) c
					.getData(UppaalVerifierLaunchConfigurationOptionsTab.UPPAAL_OPTION_DATA_KEY);
			String optionValue = optionNameValueMap.get(option.getName());
			if (optionValue == null || optionValue.isEmpty()) {
				optionValue = option.getDef();
			}
			if (c instanceof Combo) {
				Combo combo = (Combo) c;
				String choice = ((ChoiceOption) option)
						.getDisplayForName(optionValue);
				int selectionIndex = combo.indexOf(choice);
				if (selectionIndex > -1) {
					combo.select(selectionIndex);
				}
			} else if (c instanceof Button) {
				((Button) c).setSelection(optionValue.equals("1"));
			}

		}
	}
}
