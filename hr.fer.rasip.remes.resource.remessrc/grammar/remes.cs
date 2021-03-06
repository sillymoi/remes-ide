SYNTAXDEF remessrc
FOR <http://www.mdh.se/progresside/remes/1.2.0/remes.ecore> <platform:/resource/se.mdh.progresside.remes/model/remes.genmodel>
START RemesDiagram

IMPORTS{
//	hr.fer.rasip.remes.grammars.expressions.ast:<http://www.rasip.fer.hr/remes/1.1.0/expressions/ast.ecore>
}

OPTIONS {
basePackage = "hr.fer.rasip.remes.resource.remessrc" ;
resourcePluginID = "hr.fer.rasip.remes.resource.remessrc" ; 
usePredefinedTokens = "false";
}

TOKENS{
	DEFINE SL_COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	
	DEFINE T_GLOBAL$'global'$;
	DEFINE T_READABLE$'readable'$;
	DEFINE T_WRITEABLE$'writeable'$;
	DEFINE T_URGENT$'urgent'$;
	
	DEFINE TYPE$('integer'|'natural'|'boolean'|'clock'|'float')$;
	
	DEFINE ID$('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*$;
	
	DEFINE ARRAY_SIZE$('[')(' ' | '\t' | '\f')*('1'..'9')('0'..'9')*(' ' | '\t' | '\f')*(']')$;
	DEFINE IN_BRACES$('[')(~(']'))*(']')$;
	DEFINE IN_PARENS$('\(')(~('\)'))*('\)')$;
	
	DEFINE WHITESPACE$(' ' | '\t' | '\f')$;
	DEFINE LINEBREAK$('\r\n' | '\r' | '\n')$;	
}

TOKENSTYLES{
	"SL_COMMENT" COLOR #3F7F5F, ITALIC;
	"T_GLOBAL" COLOR #7F0055, BOLD;
	"T_READABLE" COLOR #7F0055, BOLD;
	"T_WRITEABLE" COLOR #7F0055, BOLD;
	"T_URGENT" COLOR #7F0055, BOLD;
	"TYPE" COLOR #7F0055, BOLD;
	"ARRAY_SIZE" COLOR #2A00FF;
	"IN_BRACES" COLOR #2A00FF;
	"IN_PARENS" COLOR #2A00FF;
		
	"RemesDiagram" COLOR #7F0055, BOLD;
	"CompositeMode" COLOR #7F0055, BOLD;
	"SubMode" COLOR #7F0055, BOLD;
	"Variable" COLOR #7F0055, BOLD;
	"ConditionalConnector" COLOR #7F0055, BOLD;
	"InitPoint" COLOR #7F0055, BOLD;
	"ExitPoint" COLOR #7F0055, BOLD;
	"Resource" COLOR #7F0055, BOLD;
	"Constant" COLOR #7F0055, BOLD;
	"Edge" COLOR #7F0055, BOLD;
	"InitEdge" COLOR #7F0055, BOLD;
	"CompositeEntryPoint" COLOR #7F0055, BOLD;

//	"type" COLOR #7F0055, BOLD;
//	"PrimitiveTypes" COLOR #7F0055, BOLD;
//	"modes" COLOR #7F0055, BOLD;
//	"entryPoint" COLOR #7F0055, BOLD;
//	"exitPoint" COLOR #7F0055, BOLD;
//	"name" COLOR #7F0055, BOLD;
//	"initialization" COLOR #7F0055, BOLD;
//	"variables" COLOR #7F0055, BOLD;
//	"resources" COLOR #7F0055, BOLD;
//	"constants" COLOR #7F0055, BOLD;
//	"subModes" COLOR #7F0055, BOLD;
//	"conditionalConnectors" COLOR #7F0055, BOLD;
//	"initPoint" COLOR #7F0055, BOLD;
//	"compositeEntryPoint" COLOR #7F0055, BOLD;
//	"compositeExitPoint" COLOR #7F0055, BOLD;
//	"invariant" COLOR #7F0055, BOLD;
//	"parent" COLOR #7F0055, BOLD;
//	"parsedInvariant" COLOR #7F0055, BOLD;
//	"initEdge" COLOR #7F0055, BOLD;
//	"container" COLOR #7F0055, BOLD;
//	"EntryPoint" COLOR #7F0055, BOLD;
//	"entryEdges" COLOR #7F0055, BOLD;
//	"ExitPoint" COLOR #7F0055, BOLD;
//	"exitEdges" COLOR #7F0055, BOLD;
//	"CompositeEntryPoint" COLOR #7F0055, BOLD;
//	"composite" COLOR #7F0055, BOLD;
//	"CompositeExitPoint" COLOR #7F0055, BOLD;
//	"actionGuard" COLOR #7F0055, BOLD;
//	"actionBody" COLOR #7F0055, BOLD;
//	"parsedActionGuard" COLOR #7F0055, BOLD;
//	"connectFrom" COLOR #7F0055, BOLD;
//	"connectTo" COLOR #7F0055, BOLD;
//	"parsedActionBody" COLOR #7F0055, BOLD;
//	"parsedInitialization" COLOR #7F0055, BOLD;
//	"value" COLOR #7F0055, BOLD;
//	"type" COLOR #7F0055, BOLD;
//	"vectorSize" COLOR #7F0055, BOLD;
//	"scope" COLOR #7F0055, BOLD;
//	"expression" COLOR #7F0055, BOLD;
//	"parsedExpression" COLOR #7F0055, BOLD;
//	"ActionRoot" COLOR #7F0055, BOLD;
//	"referencedVariables" COLOR #7F0055, BOLD;
//	"expressions" COLOR #7F0055, BOLD;
//	"LogicalRoot" COLOR #7F0055, BOLD;
//	"ResourceRoot" COLOR #7F0055, BOLD;
//	"TernaryExpression" COLOR #7F0055, BOLD;
//	"param1" COLOR #7F0055, BOLD;
//	"param2" COLOR #7F0055, BOLD;
//	"param3" COLOR #7F0055, BOLD;
//	"BinaryExpression" COLOR #7F0055, BOLD;
//	"UnaryExpression" COLOR #7F0055, BOLD;
//	"VariableReference" COLOR #7F0055, BOLD;
//	"arrayIndex" COLOR #7F0055, BOLD;
//	"resolved" COLOR #7F0055, BOLD;
//	"text" COLOR #7F0055, BOLD;
//	"Literal" COLOR #7F0055, BOLD;
}

RULES {
	
	RemesDiagram::= "remes" "{" !1 modes* !1"}"  ;
	
	CompositeMode::= "composite" name[ID] "{" !1 ( variables | resources | constants )* ( subModes | conditionalConnectors | initPoint | compositeEntryPoint )* !1"}"  ;
	
	SubMode::= "atomic" (isUrgent[T_URGENT])? name[ID] "{" !1 ( variables | resources | constants )* ( "invariant" invariant[IN_PARENS] )? (exitPoint)? !1"}"  ;
	
	ConditionalConnector::= "conditional"  name[ID] "{" !1 exitPoint !1"}" ;
	
	InitPoint::= "init" initEdge  ;
	
	ExitPoint::= "edges"  "{" !1 ( exitEdges )* !1"}"  ;
	
	CompositeEntryPoint::= "entry"  exitEdges  ;
		
	Edge::= "edge" ( actionGuard[IN_PARENS] )? ( actionBody[IN_BRACES] )? "to" connectTo[ID] ;
	
	InitEdge::= "edge" ( initialization[IN_BRACES] )? "to" connectTo[ID] ;
	
	Variable::= "var" (global[T_GLOBAL])? (readable[T_READABLE])? (writable[T_WRITEABLE])? type[TYPE] ( vectorSize[ARRAY_SIZE] )? name[ID] ( "=" value[INTEGER] )? ;
	
	Resource::= "resource" type[TYPE] name[ID] ( ":" expression[IN_PARENS] )?  ;
	
	Constant::= "const" (global[T_GLOBAL])? type[TYPE] name[ID] ("="  value[INTEGER])?  ;
	
}