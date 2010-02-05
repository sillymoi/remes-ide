package hr.fer.rasip.remes.grammars.expressions.parser;

import hr.fer.rasip.remes.grammars.expressions.ast.ActionRoot;

import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class RemesActionParserTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RemesLexer lex;
			lex = new RemesLexer(new ANTLRStringStream(
					//"x[24]>2 ? true : x[11] < 3"));
					"x := x [2] + 2"));

			// Run lexer
			CommonTokenStream tokens = new CommonTokenStream(lex);
			// Run parser
			RemesActionParser g = new RemesActionParser(tokens);
			// Create AST
			CommonTree tree = (CommonTree) g.action_expression().getTree();
			if(g.getNumberOfSyntaxErrors()!=0) { 
				System.out.println(g.getNumberOfSyntaxErrors());
				return;
			}
				
			System.out.println(tree.toStringTree());
			// Walk AST, create EMF
							
/*			RemesGuardTree treeParser = new RemesGuardTree(new CommonTreeNodeStream(tree));
			Expression ex = treeParser.invariant_expression();
			System.out.println(ex);
*/			
			
			// Save the file
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("logics", new XMIResourceFactoryImpl());
				
			// Create file in workspace
/*			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			IProject project = root.getProject();
			IFolder folder = project.getFolder("/test");
			IFile file = folder.getFile("guards.tree");
*/			
			
			// At this point, no resources have been created
/*			if (!project.exists())
				project.create(null);
			if (!project.isOpen())
				project.open(null);
*/			try {
//				if (!folder.exists())
//					folder.create(IResource.NONE, true, null);
				
				//URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				URI uri = URI.createURI("test/guards.logics");
				Resource resource = resourceSet.createResource(uri);
						
				ActionRoot root = getExpression(tree);
				resource.getContents().add(root);
				resource.save(null);
			}
			catch (IOException ioe)
			{
				ioe.printStackTrace();
			}
		} catch (RecognitionException re) {
			re.printStackTrace();
		}
	}

	private static ActionRoot getExpression(Tree tree) 
	{
		TreeWalker walker = new TreeWalker(tree);
		
		return walker.getActionExpression();
	}

	
}