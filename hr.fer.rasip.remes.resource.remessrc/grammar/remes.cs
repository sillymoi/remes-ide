SYNTAXDEF remessrc
FOR <http://www.mdh.se/progresside/remes/1.2.0/remes.ecore> <platform:/resource/se.mdh.progresside.remes/model/remes.genmodel>
START RemesDiagram

IMPORTS{
//	hr.fer.rasip.remes.grammars.expressions.ast:<http://www.rasip.fer.hr/remes/1.1.0/expressions/ast.ecore>
}

OPTIONS {
basePackage = "hr.fer.rasip.remes.resource.remessrc" ;
resourcePluginID = "hr.fer.rasip.remes.resource.remessrc" ; 
}

TOKENS{
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}

TOKENSTYLES{
	"RemesDiagram" COLOR #7F0055, BOLD;
	"modes" COLOR #7F0055, BOLD;
	"CompositeMode" COLOR #7F0055, BOLD;
	"entryPoint" COLOR #7F0055, BOLD;
	"exitPoint" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"initialization" COLOR #7F0055, BOLD;
	"variables" COLOR #7F0055, BOLD;
	"resources" COLOR #7F0055, BOLD;
	"constants" COLOR #7F0055, BOLD;
	"subModes" COLOR #7F0055, BOLD;
	"conditionalConnectors" COLOR #7F0055, BOLD;
	"initPoint" COLOR #7F0055, BOLD;
	"compositeEntryPoint" COLOR #7F0055, BOLD;
	"compositeExitPoint" COLOR #7F0055, BOLD;
	"SubMode" COLOR #7F0055, BOLD;
	"invariant" COLOR #7F0055, BOLD;
	"parent" COLOR #7F0055, BOLD;
	"parsedInvariant" COLOR #7F0055, BOLD;
	"ConditionalConnector" COLOR #7F0055, BOLD;
	"InitPoint" COLOR #7F0055, BOLD;
	"initEdge" COLOR #7F0055, BOLD;
	"container" COLOR #7F0055, BOLD;
	"EntryPoint" COLOR #7F0055, BOLD;
	"entryEdges" COLOR #7F0055, BOLD;
	"ExitPoint" COLOR #7F0055, BOLD;
	"exitEdges" COLOR #7F0055, BOLD;
	"CompositeEntryPoint" COLOR #7F0055, BOLD;
	"composite" COLOR #7F0055, BOLD;
	"CompositeExitPoint" COLOR #7F0055, BOLD;
	"Edge" COLOR #7F0055, BOLD;
	"actionGuard" COLOR #7F0055, BOLD;
	"actionBody" COLOR #7F0055, BOLD;
	"parsedActionGuard" COLOR #7F0055, BOLD;
	"connectFrom" COLOR #7F0055, BOLD;
	"connectTo" COLOR #7F0055, BOLD;
	"parsedActionBody" COLOR #7F0055, BOLD;
	"InitEdge" COLOR #7F0055, BOLD;
	"parsedInitialization" COLOR #7F0055, BOLD;
	"Variable" COLOR #7F0055, BOLD;
	"value" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"vectorSize" COLOR #7F0055, BOLD;
	"scope" COLOR #7F0055, BOLD;
	"Resource" COLOR #7F0055, BOLD;
	"expression" COLOR #7F0055, BOLD;
	"parsedExpression" COLOR #7F0055, BOLD;
	"Constant" COLOR #7F0055, BOLD;
	"ActionRoot" COLOR #7F0055, BOLD;
	"referencedVariables" COLOR #7F0055, BOLD;
	"expressions" COLOR #7F0055, BOLD;
	"LogicalRoot" COLOR #7F0055, BOLD;
	"ResourceRoot" COLOR #7F0055, BOLD;
	"TernaryExpression" COLOR #7F0055, BOLD;
	"param1" COLOR #7F0055, BOLD;
	"param2" COLOR #7F0055, BOLD;
	"param3" COLOR #7F0055, BOLD;
	"BinaryExpression" COLOR #7F0055, BOLD;
	"UnaryExpression" COLOR #7F0055, BOLD;
	"VariableReference" COLOR #7F0055, BOLD;
	"arrayIndex" COLOR #7F0055, BOLD;
	"resolved" COLOR #7F0055, BOLD;
	"text" COLOR #7F0055, BOLD;
	"Literal" COLOR #7F0055, BOLD;
}

RULES{
	
	RemesDiagram::= "remes"  "{" modes* "}"  ;
	
	CompositeMode::= "composite" name['"','"'] "{" ( variables | resources | constants | subModes | conditionalConnectors | initPoint | compositeEntryPoint )* "}"  ;
	
	SubMode::= "atomic" isUrgent[]? name['"','"'] "{" ( variables | resources | constants )* ( "invariant" invariant['"','"'] )? exitPoint "}"  ;
	
	ConditionalConnector::= "conditional"  name['"','"'] "{" exitPoint "}" ;
	
	InitPoint::= "init" initEdge  ;
	
//	EntryPoint::= "Entry"  "{" ( entryEdges[] )* "}"  ;
	
	ExitPoint::= "edges"  "{" ( exitEdges )* "}"  ;
	
	CompositeEntryPoint::= "entry"  exitEdges  ;
		
	Edge::= "edge" ( "(" actionGuard['"','"'] ")" )? ( "{" actionBody['"','"'] "}" )? "to" connectTo[] ;
	
	InitEdge::= "edge" ( "{" initialization['"','"'] "}" )? "to" connectTo[]  ;
	
	Variable::= "var" ( global[] )? ( readable[] )? ( writable[] )? type[] ( "[" vectorSize[] "]" )? name['"','"']  ( "=" value['"','"'] )?   ;
	
	Resource::= "resource" type[] name['"','"'] ( ":" expression['"','"'] )?  ;
	
	Constant::= "const" global[]? type[] name['"','"'] ("="  value['"','"'])?  ;
	
}