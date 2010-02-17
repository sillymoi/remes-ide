/**so
 * 
 */
package hr.fer.rasip.remes.builder.helpers;

import hr.fer.rasip.remes.grammars.expressions.ast.ResolvedType;

/**
 * @author Marin
 *
 */
public class TypeTable {
	private static final ResolvedType _int = ResolvedType.INTEGER;
	private static final ResolvedType _bool = ResolvedType.BOOLEAN;
	private static final ResolvedType _nat = ResolvedType.NATURAL;
	private static final ResolvedType _clock = ResolvedType.CLOCK;
	private static final ResolvedType _float = ResolvedType.FLOAT;
	private static final ResolvedType _rsrc = ResolvedType.RESOURCE;
	
	// Ordering as in Remes.PrimitiveTypes
	private static final ResolvedType[] indexToType = new ResolvedType[] {
	//     0,     1,    2,      3,      4,     5
		_int, _bool, _nat, _clock, _float, _rsrc
	};
	
	private static final ResolvedType[][] arithmeticResultType = new ResolvedType[][] {
		/*            int,	boolean,natural,clock,	float,	resource */
		/*integer*/	{_int,	null,	_int,	null,	_float,	null},
		/*boolean*/	{null,  null,   null,  	null,	null,	null},
		/*natural*/	{_int,  null, 	_nat,  	null,	_float,	null},
		/*clock*/	{null, 	null,  	null,   _clock,	null,	null},
		/*float*/	{_float,null,	_float,	null,	_float,	null},
		/*resource*/{null,	null,	null,	null,	null,	null},		
	};
	
	private static final ResolvedType[][] comparisonResultType = new ResolvedType[][] {
        /*            int,	boolean,natural,clock,	float,	resource */
        /*integer*/ {_bool,	null,	_bool,	_bool,	_bool,	null},
        /*boolean*/	{null,  null,   null,  	null,	null,	null},
        /*natural*/	{_bool, null, 	_bool, 	_bool,	_bool,	null},
        /*clock*/	{_bool,	null,  	_bool,  _bool,	null,	null},
        /*float*/	{_bool,	null,	_bool,	null,	_bool,	null},
		/*resource*/{null,	null,	null,	null,	null,	null},		        
	};

	private static final ResolvedType[][] equalityResultType = new ResolvedType[][] {
        /*            int,	boolean,natural,clock,	float,	resource */
        /*integer*/	{_bool,	null,	_bool,	_bool,	_bool,	null},
        /*boolean*/	{null,  _bool,   null,  null,	null,	null},
        /*natural*/	{_bool, null, 	_bool,  _bool,	_bool,	null},
        /*clock*/	{_bool,	null,  	_bool,  _bool,	null,	null},
        /*float*/	{_bool,	null,	_bool,	null,	_bool,	null},      
		/*resource*/{null,	null,	null,	null,	null,	null},		        
	};

	private static final ResolvedType[][] assignmentResultType = new ResolvedType[][] {
        /*            int,	boolean,natural,clock,	float,	resource */
        /*integer*/ {_int,	null,	_int,	null,	_float,	null},
        /*boolean*/	{null,  _bool,  null,  	null,	null,	null},
        /*natural*/	{_int,  null, 	_nat,  	null,	_float,	null},
        /*clock*/	{null, 	null,  	null,   _clock,	null,	null},
        /*float*/	{_float,null,	_float,	null,	_float,	null},      
		/*resource*/{null,	null,	null,	null,	null,	null},		        
	};

	private static final ResolvedType[][] assignmentArithmeticResultType = new ResolvedType[][] {
        /*            int,	boolean,natural,clock,	float,	resource */
        /*integer*/ {_int,	null,	_int,	null,	_float,	_rsrc},
        /*boolean*/	{null,  _bool,  null,  	null,	null,	null},
        /*natural*/	{_int,  null, 	_nat,  	null,	_float,	_rsrc},
        /*clock*/	{null, 	null,  	null,   _clock,	null,	null},
        /*float*/	{_float,null,	_float,	null,	_float,	null},      
		/*resource*/{_rsrc,	null,	_rsrc,	null,	null,	null},		        
	};

/*	private static final ResolvedType[][] promoteTypeFromTo = new ResolvedType[][] {
                    int,	boolean,natural,clock,	float,	resource 
        integer {_int,	null,	_int,	null,	_float,	null},
        boolean	{null,  null,  	null,  	null,	null,	null},
        natural	{_int,  null, 	null,  	null,	_float,	null},
        clock	{null, 	null,  	null,   null,	null,	null},
        float	{_float,null,	_float,	null,	null,	null},      
		resource{null,	null,	null,	null,	null,	null},		        		
	};
*/	
	public static ResolvedType getType(int value) {
		if(value >= 0 && value < indexToType.length)
			return indexToType[value];
		return null;
	}
	
	private static ResolvedType getResultType(ResolvedType[][] typeTable, ResolvedType a, ResolvedType b) {
        // Get type indices
		int ta = a.getValue(); 
        int tb = b.getValue(); 
        
        // Sanity check
        if(ta < 0 || ta >= typeTable.length || tb < 0 || tb >= typeTable[0].length)
        	return null;
           
        ResolvedType result = typeTable[ta][tb];    // operation result type
        
        // Need type promotion? Promote left to right or right to left?
//        a.promoteToType = promoteFromTo[ta][result.getTypeIndex()];
//        b.promoteToType = promoteFromTo[tb][result.getTypeIndex()];
        return result;
    }

	public static ResolvedType getArithmeticResultType(ResolvedType left, ResolvedType right) {
		return getResultType(arithmeticResultType, left, right);
	}

	public static ResolvedType getEqualityResultType(ResolvedType left, ResolvedType right) {
		return getResultType(equalityResultType, left, right);
	}

	public static ResolvedType getComparisonResultType(ResolvedType left, ResolvedType right) {
		return getResultType(comparisonResultType, left, right);
	}

	public static ResolvedType getAssignmentResultType(ResolvedType left, ResolvedType right) {
		return getResultType(assignmentResultType, left, right);
	}

	public static ResolvedType getAssignmentArithmeticResultType(ResolvedType left, ResolvedType right) {
		return getResultType(assignmentArithmeticResultType, left, right);
	}
}
