/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hr.fer.rasip.remes.resource.remessrc.mopp;

public class RemessrcGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public abstract static class SyntaxElement {
	}
	
	public static class Keyword extends SyntaxElement {
		
		private final String value;
		
		public Keyword(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
	
	public static class Placeholder extends SyntaxElement {
		
		private final org.eclipse.emf.ecore.EStructuralFeature feature;
		
		public Placeholder(org.eclipse.emf.ecore.EStructuralFeature feature) {
			this.feature = feature;
		}
		
		public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
			return feature;
		}
	}
	
	public static class Sequence extends SyntaxElement {
		
		private final SyntaxElement[] elements;
		
		public Sequence(SyntaxElement... elements) {
			this.elements = elements;
		}
		
		public SyntaxElement[] getElements() {
			return elements;
		}
	}
	
	public static class Choice extends SyntaxElement {
		
		private final SyntaxElement[] choices;
		
		public Choice(SyntaxElement... choices) {
			this.choices = choices;
		}
		
		public SyntaxElement[] getChoices() {
			return choices;
		}
	}
	
	public static class LineBreak extends SyntaxElement {
		
		private final int tabs;
		
		public LineBreak(int tabs) {
			this.tabs = tabs;
		}
		
		public int getTabs() {
			return tabs;
		}
	}
	
	public static class WhiteSpaces extends SyntaxElement {
		
		private final int amount;
		
		public WhiteSpaces(int amount) {
			this.amount = amount;
		}
		
		public int getAmount() {
			return amount;
		}
	}
	
	public static class Containment extends SyntaxElement {
		
		private final org.eclipse.emf.ecore.EStructuralFeature feature;
		
		public Containment(org.eclipse.emf.ecore.EStructuralFeature feature) {
			this.feature = feature;
		}
		
		public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
			return feature;
		}
	}
	
	public static class Compound extends SyntaxElement {
		
		private final Choice choice;
		
		public Compound(Choice choice) {
			this.choice = choice;
		}
		
		public Choice getDefinition() {
			return choice;
		}
	}
	
	public static class Rule extends SyntaxElement {
		
		private final org.eclipse.emf.ecore.EClass metaclass;
		private final Choice choice;
		
		public Rule(org.eclipse.emf.ecore.EClass metaclass, Choice choice) {
			this.metaclass = metaclass;
			this.choice = choice;
		}
		
		public org.eclipse.emf.ecore.EClass getMetaclass() {
			return metaclass;
		}
		
		public Choice getDefinition() {
			return choice;
		}
	}
	
	public final static Keyword ELEMENT_0 = new Keyword("remes");
	public final static Keyword ELEMENT_1 = new Keyword("{");
	public final static LineBreak ELEMENT_2 = new LineBreak(1);
	public final static Containment ELEMENT_3 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.REMES_DIAGRAM__MODES));
	public final static LineBreak ELEMENT_4 = new LineBreak(1);
	public final static Keyword ELEMENT_5 = new Keyword("}");
	public final static Sequence ELEMENT_6 = new Sequence(ELEMENT_0, ELEMENT_1, ELEMENT_2, ELEMENT_3, ELEMENT_4, ELEMENT_5);
	public final static Choice ELEMENT_7 = new Choice(ELEMENT_6);
	public final static Rule ELEMENT_8 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getRemesDiagram(), ELEMENT_7);
	public final static Keyword ELEMENT_9 = new Keyword("composite");
	public final static Placeholder ELEMENT_10 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__NAME));
	public final static Keyword ELEMENT_11 = new Keyword("{");
	public final static LineBreak ELEMENT_12 = new LineBreak(1);
	public final static Containment ELEMENT_13 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__VARIABLES));
	public final static Sequence ELEMENT_14 = new Sequence(ELEMENT_13);
	public final static Containment ELEMENT_15 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__RESOURCES));
	public final static Sequence ELEMENT_16 = new Sequence(ELEMENT_15);
	public final static Containment ELEMENT_17 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONSTANTS));
	public final static Sequence ELEMENT_18 = new Sequence(ELEMENT_17);
	public final static Choice ELEMENT_19 = new Choice(ELEMENT_14, ELEMENT_16, ELEMENT_18);
	public final static Compound ELEMENT_20 = new Compound(ELEMENT_19);
	public final static Containment ELEMENT_21 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__SUB_MODES));
	public final static Sequence ELEMENT_22 = new Sequence(ELEMENT_21);
	public final static Containment ELEMENT_23 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__CONDITIONAL_CONNECTORS));
	public final static Sequence ELEMENT_24 = new Sequence(ELEMENT_23);
	public final static Containment ELEMENT_25 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__INIT_POINT));
	public final static Sequence ELEMENT_26 = new Sequence(ELEMENT_25);
	public final static Containment ELEMENT_27 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_MODE__COMPOSITE_ENTRY_POINT));
	public final static Sequence ELEMENT_28 = new Sequence(ELEMENT_27);
	public final static Choice ELEMENT_29 = new Choice(ELEMENT_22, ELEMENT_24, ELEMENT_26, ELEMENT_28);
	public final static Compound ELEMENT_30 = new Compound(ELEMENT_29);
	public final static LineBreak ELEMENT_31 = new LineBreak(1);
	public final static Keyword ELEMENT_32 = new Keyword("}");
	public final static Sequence ELEMENT_33 = new Sequence(ELEMENT_9, ELEMENT_10, ELEMENT_11, ELEMENT_12, ELEMENT_20, ELEMENT_30, ELEMENT_31, ELEMENT_32);
	public final static Choice ELEMENT_34 = new Choice(ELEMENT_33);
	public final static Rule ELEMENT_35 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeMode(), ELEMENT_34);
	public final static Keyword ELEMENT_36 = new Keyword("atomic");
	public final static Placeholder ELEMENT_37 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__IS_URGENT));
	public final static Sequence ELEMENT_38 = new Sequence(ELEMENT_37);
	public final static Choice ELEMENT_39 = new Choice(ELEMENT_38);
	public final static Compound ELEMENT_40 = new Compound(ELEMENT_39);
	public final static Placeholder ELEMENT_41 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__NAME));
	public final static Keyword ELEMENT_42 = new Keyword("{");
	public final static LineBreak ELEMENT_43 = new LineBreak(1);
	public final static Containment ELEMENT_44 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__VARIABLES));
	public final static Sequence ELEMENT_45 = new Sequence(ELEMENT_44);
	public final static Containment ELEMENT_46 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__RESOURCES));
	public final static Sequence ELEMENT_47 = new Sequence(ELEMENT_46);
	public final static Containment ELEMENT_48 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__CONSTANTS));
	public final static Sequence ELEMENT_49 = new Sequence(ELEMENT_48);
	public final static Choice ELEMENT_50 = new Choice(ELEMENT_45, ELEMENT_47, ELEMENT_49);
	public final static Compound ELEMENT_51 = new Compound(ELEMENT_50);
	public final static Keyword ELEMENT_52 = new Keyword("invariant");
	public final static Placeholder ELEMENT_53 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__INVARIANT));
	public final static Sequence ELEMENT_54 = new Sequence(ELEMENT_52, ELEMENT_53);
	public final static Choice ELEMENT_55 = new Choice(ELEMENT_54);
	public final static Compound ELEMENT_56 = new Compound(ELEMENT_55);
	public final static Containment ELEMENT_57 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.SUB_MODE__EXIT_POINT));
	public final static Sequence ELEMENT_58 = new Sequence(ELEMENT_57);
	public final static Choice ELEMENT_59 = new Choice(ELEMENT_58);
	public final static Compound ELEMENT_60 = new Compound(ELEMENT_59);
	public final static LineBreak ELEMENT_61 = new LineBreak(1);
	public final static Keyword ELEMENT_62 = new Keyword("}");
	public final static Sequence ELEMENT_63 = new Sequence(ELEMENT_36, ELEMENT_40, ELEMENT_41, ELEMENT_42, ELEMENT_43, ELEMENT_51, ELEMENT_56, ELEMENT_60, ELEMENT_61, ELEMENT_62);
	public final static Choice ELEMENT_64 = new Choice(ELEMENT_63);
	public final static Rule ELEMENT_65 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getSubMode(), ELEMENT_64);
	public final static Keyword ELEMENT_66 = new Keyword("conditional");
	public final static Placeholder ELEMENT_67 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__NAME));
	public final static Keyword ELEMENT_68 = new Keyword("{");
	public final static LineBreak ELEMENT_69 = new LineBreak(1);
	public final static Containment ELEMENT_70 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONDITIONAL_CONNECTOR__EXIT_POINT));
	public final static LineBreak ELEMENT_71 = new LineBreak(1);
	public final static Keyword ELEMENT_72 = new Keyword("}");
	public final static Sequence ELEMENT_73 = new Sequence(ELEMENT_66, ELEMENT_67, ELEMENT_68, ELEMENT_69, ELEMENT_70, ELEMENT_71, ELEMENT_72);
	public final static Choice ELEMENT_74 = new Choice(ELEMENT_73);
	public final static Rule ELEMENT_75 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConditionalConnector(), ELEMENT_74);
	public final static Keyword ELEMENT_76 = new Keyword("init");
	public final static Containment ELEMENT_77 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitPoint().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_POINT__INIT_EDGE));
	public final static Sequence ELEMENT_78 = new Sequence(ELEMENT_76, ELEMENT_77);
	public final static Choice ELEMENT_79 = new Choice(ELEMENT_78);
	public final static Rule ELEMENT_80 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitPoint(), ELEMENT_79);
	public final static Keyword ELEMENT_81 = new Keyword("edges");
	public final static Keyword ELEMENT_82 = new Keyword("{");
	public final static LineBreak ELEMENT_83 = new LineBreak(1);
	public final static Containment ELEMENT_84 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EXIT_POINT__EXIT_EDGES));
	public final static Sequence ELEMENT_85 = new Sequence(ELEMENT_84);
	public final static Choice ELEMENT_86 = new Choice(ELEMENT_85);
	public final static Compound ELEMENT_87 = new Compound(ELEMENT_86);
	public final static LineBreak ELEMENT_88 = new LineBreak(1);
	public final static Keyword ELEMENT_89 = new Keyword("}");
	public final static Sequence ELEMENT_90 = new Sequence(ELEMENT_81, ELEMENT_82, ELEMENT_83, ELEMENT_87, ELEMENT_88, ELEMENT_89);
	public final static Choice ELEMENT_91 = new Choice(ELEMENT_90);
	public final static Rule ELEMENT_92 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getExitPoint(), ELEMENT_91);
	public final static Keyword ELEMENT_93 = new Keyword("entry");
	public final static Containment ELEMENT_94 = new Containment(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeEntryPoint().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.COMPOSITE_ENTRY_POINT__EXIT_EDGES));
	public final static Sequence ELEMENT_95 = new Sequence(ELEMENT_93, ELEMENT_94);
	public final static Choice ELEMENT_96 = new Choice(ELEMENT_95);
	public final static Rule ELEMENT_97 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getCompositeEntryPoint(), ELEMENT_96);
	public final static Keyword ELEMENT_98 = new Keyword("edge");
	public final static Placeholder ELEMENT_99 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_GUARD));
	public final static Sequence ELEMENT_100 = new Sequence(ELEMENT_99);
	public final static Choice ELEMENT_101 = new Choice(ELEMENT_100);
	public final static Compound ELEMENT_102 = new Compound(ELEMENT_101);
	public final static Placeholder ELEMENT_103 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__ACTION_BODY));
	public final static Sequence ELEMENT_104 = new Sequence(ELEMENT_103);
	public final static Choice ELEMENT_105 = new Choice(ELEMENT_104);
	public final static Compound ELEMENT_106 = new Compound(ELEMENT_105);
	public final static Keyword ELEMENT_107 = new Keyword("to");
	public final static Placeholder ELEMENT_108 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.EDGE__CONNECT_TO));
	public final static Sequence ELEMENT_109 = new Sequence(ELEMENT_98, ELEMENT_102, ELEMENT_106, ELEMENT_107, ELEMENT_108);
	public final static Choice ELEMENT_110 = new Choice(ELEMENT_109);
	public final static Rule ELEMENT_111 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getEdge(), ELEMENT_110);
	public final static Keyword ELEMENT_112 = new Keyword("edge");
	public final static Placeholder ELEMENT_113 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__INITIALIZATION));
	public final static Sequence ELEMENT_114 = new Sequence(ELEMENT_113);
	public final static Choice ELEMENT_115 = new Choice(ELEMENT_114);
	public final static Compound ELEMENT_116 = new Compound(ELEMENT_115);
	public final static Keyword ELEMENT_117 = new Keyword("to");
	public final static Placeholder ELEMENT_118 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.INIT_EDGE__CONNECT_TO));
	public final static Sequence ELEMENT_119 = new Sequence(ELEMENT_112, ELEMENT_116, ELEMENT_117, ELEMENT_118);
	public final static Choice ELEMENT_120 = new Choice(ELEMENT_119);
	public final static Rule ELEMENT_121 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getInitEdge(), ELEMENT_120);
	public final static Keyword ELEMENT_122 = new Keyword("var");
	public final static Placeholder ELEMENT_123 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__GLOBAL));
	public final static Sequence ELEMENT_124 = new Sequence(ELEMENT_123);
	public final static Choice ELEMENT_125 = new Choice(ELEMENT_124);
	public final static Compound ELEMENT_126 = new Compound(ELEMENT_125);
	public final static Placeholder ELEMENT_127 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__READABLE));
	public final static Sequence ELEMENT_128 = new Sequence(ELEMENT_127);
	public final static Choice ELEMENT_129 = new Choice(ELEMENT_128);
	public final static Compound ELEMENT_130 = new Compound(ELEMENT_129);
	public final static Placeholder ELEMENT_131 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__WRITABLE));
	public final static Sequence ELEMENT_132 = new Sequence(ELEMENT_131);
	public final static Choice ELEMENT_133 = new Choice(ELEMENT_132);
	public final static Compound ELEMENT_134 = new Compound(ELEMENT_133);
	public final static Placeholder ELEMENT_135 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__TYPE));
	public final static Placeholder ELEMENT_136 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VECTOR_SIZE));
	public final static Sequence ELEMENT_137 = new Sequence(ELEMENT_136);
	public final static Choice ELEMENT_138 = new Choice(ELEMENT_137);
	public final static Compound ELEMENT_139 = new Compound(ELEMENT_138);
	public final static Placeholder ELEMENT_140 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__NAME));
	public final static Keyword ELEMENT_141 = new Keyword("=");
	public final static Placeholder ELEMENT_142 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.VARIABLE__VALUE));
	public final static Sequence ELEMENT_143 = new Sequence(ELEMENT_141, ELEMENT_142);
	public final static Choice ELEMENT_144 = new Choice(ELEMENT_143);
	public final static Compound ELEMENT_145 = new Compound(ELEMENT_144);
	public final static Sequence ELEMENT_146 = new Sequence(ELEMENT_122, ELEMENT_126, ELEMENT_130, ELEMENT_134, ELEMENT_135, ELEMENT_139, ELEMENT_140, ELEMENT_145);
	public final static Choice ELEMENT_147 = new Choice(ELEMENT_146);
	public final static Rule ELEMENT_148 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getVariable(), ELEMENT_147);
	public final static Keyword ELEMENT_149 = new Keyword("resource");
	public final static Placeholder ELEMENT_150 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__TYPE));
	public final static Placeholder ELEMENT_151 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__NAME));
	public final static Keyword ELEMENT_152 = new Keyword(":");
	public final static Placeholder ELEMENT_153 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.RESOURCE__EXPRESSION));
	public final static Sequence ELEMENT_154 = new Sequence(ELEMENT_152, ELEMENT_153);
	public final static Choice ELEMENT_155 = new Choice(ELEMENT_154);
	public final static Compound ELEMENT_156 = new Compound(ELEMENT_155);
	public final static Sequence ELEMENT_157 = new Sequence(ELEMENT_149, ELEMENT_150, ELEMENT_151, ELEMENT_156);
	public final static Choice ELEMENT_158 = new Choice(ELEMENT_157);
	public final static Rule ELEMENT_159 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getResource(), ELEMENT_158);
	public final static Keyword ELEMENT_160 = new Keyword("const");
	public final static Placeholder ELEMENT_161 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__GLOBAL));
	public final static Sequence ELEMENT_162 = new Sequence(ELEMENT_161);
	public final static Choice ELEMENT_163 = new Choice(ELEMENT_162);
	public final static Compound ELEMENT_164 = new Compound(ELEMENT_163);
	public final static Placeholder ELEMENT_165 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__TYPE));
	public final static Placeholder ELEMENT_166 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__NAME));
	public final static Keyword ELEMENT_167 = new Keyword("=");
	public final static Placeholder ELEMENT_168 = new Placeholder(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant().getEStructuralFeature(se.mdh.progresside.remes.RemesPackage.CONSTANT__VALUE));
	public final static Sequence ELEMENT_169 = new Sequence(ELEMENT_167, ELEMENT_168);
	public final static Choice ELEMENT_170 = new Choice(ELEMENT_169);
	public final static Compound ELEMENT_171 = new Compound(ELEMENT_170);
	public final static Sequence ELEMENT_172 = new Sequence(ELEMENT_160, ELEMENT_164, ELEMENT_165, ELEMENT_166, ELEMENT_171);
	public final static Choice ELEMENT_173 = new Choice(ELEMENT_172);
	public final static Rule ELEMENT_174 = new Rule(se.mdh.progresside.remes.RemesPackage.eINSTANCE.getConstant(), ELEMENT_173);
}
