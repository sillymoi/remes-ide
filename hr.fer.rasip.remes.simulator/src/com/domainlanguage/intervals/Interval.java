/**
 * Based on source code by Domain Language, Inc.
 * Modifications by Marin Orlic <marin.orlic@gmail.com>
 */

/**
 * Copyright (c) 2004 Domain Language, Inc. (http://domainlanguage.com)
 * This free software is distributed under the "MIT" licence. See file licence.txt. 
 * For more information, see http://timeandmoney.sourceforge.net.
 */

package com.domainlanguage.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * The rules of this class are consistent with the common mathematical
 * definition of "interval". For a simple explanation, see
 * http://en.wikipedia.org/wiki/Interval_(mathematics)
 * 
 * Interval (and its "ConcreteInterval" subclass) can be used for any objects
 * that have a natural ordering reflected by implementing the Comparable
 * interface. For example, Integer implements Comparable, so if you want to
 * check if an Integer is within a range, make an Interval. Any class of yours
 * which implements Comparable can have intervals defined this way.
 */
public class Interval implements Comparable {
    private IntervalLimit lowerLimitObject;
    private IntervalLimit upperLimitObject;

	public static Interval duplicate(Interval right) {
		return new Interval(right.lowerLimit(), right.includesLowerLimit(), right.upperLimit(), right.includesUpperLimit());
	}    

    public static Interval closed(Integer lower, Integer upper) {
        return new Interval(lower, true, upper, true);
    }

    public static Interval open(Integer lower, Integer upper) {
        return new Interval(lower, false, upper, false);
    }

    public static Interval over(Integer lower, boolean lowerIncluded, Integer upper, boolean upperIncluded) {
        return new Interval(lower, lowerIncluded, upper, upperIncluded);
    }

    public static Interval single(Integer elem) {
    	return new Interval(elem, true, elem, true);
    }
    
    Interval(IntervalLimit lower, IntervalLimit upper) {
        assert lower.isLower();
        assert upper.isUpper();
        assert lower.compareTo(upper) <= 0;
        this.lowerLimitObject=lower;
        this.upperLimitObject=upper;
    }
    
    protected Interval(Integer lower, boolean isLowerClosed, Integer upper, boolean isUpperClosed) {
        this(IntervalLimit.lower(isLowerClosed, lower), IntervalLimit.upper(isUpperClosed, upper));
    }
    
    //Warning: This method should generally be used for display
    //purposes and interactions with closely coupled classes.
    //Look for (or add) other methods to do computations.
    public Integer upperLimit() {
        return upperLimitObject.getValue();
    }

    //Warning: This method should generally be used for display
    //purposes and interactions with closely coupled classes.
    //Look for (or add) other methods to do computations.

    public boolean includesUpperLimit() {
        return upperLimitObject.isClosed();
    }

   //Warning: This method should generally be used for display
   //purposes and interactions with closely coupled classes.
   //Look for (or add) other methods to do computations.
    
    public boolean hasUpperLimit() {
        return upperLimit() != null;
    }
      
    //Warning: This method should generally be used for display
    //purposes and interactions with closely coupled classes.
    //Look for (or add) other methods to do computations.
    public Integer lowerLimit() {
        return lowerLimitObject.getValue();
    }
    
    //Warning: This method should generally be used for display
    //purposes and interactions with closely coupled classes.
    //Look for (or add) other methods to do computations.
    public boolean includesLowerLimit() {
        return lowerLimitObject.isClosed();
    }
    
    //Warning: This method should generally be used for display
    //purposes and interactions with closely coupled classes.
    //Look for (or add) other methods to do computations.
    public boolean hasLowerLimit() {
        return lowerLimit() != null;
    }
    
    public Interval newOfSameType(Integer lower, boolean isLowerClosed, Integer upper, boolean isUpperClosed) {
        return new Interval(lower,isLowerClosed,upper,isUpperClosed);
    }

    public Interval emptyOfSameType() {
        return newOfSameType(lowerLimit(), false, lowerLimit(), false);
    }

    public boolean includes(Integer value) {
        return !this.isBelow(value) && !this.isAbove(value);
    }

    public boolean covers(Interval other) {
        int lowerComparison = lowerLimit().compareTo(other.lowerLimit());
        boolean lowerPass = this.includes(other.lowerLimit()) || (lowerComparison == 0 && !other.includesLowerLimit());
        int upperComparison = upperLimit().compareTo(other.upperLimit());
        boolean upperPass = this.includes(other.upperLimit()) || (upperComparison == 0 && !other.includesUpperLimit());
        return lowerPass && upperPass;
    }

    public boolean isOpen() {
        return !includesLowerLimit() && !includesUpperLimit();
    }

    public boolean isClosed() {
        return includesLowerLimit() && includesUpperLimit();
    }

    public boolean isEmpty() {
        //TODO: Consider explicit empty interval
        //A 'degenerate' interval is an empty set, {}.
    	if(!hasLowerLimit() || !hasUpperLimit()) 
    		return false;
        return isOpen() && upperLimit().equals(lowerLimit());
    }

    public boolean isSingleElement() {
        //An interval containing a single element, {a}.
    	if(hasUpperLimit() && hasLowerLimit())
    		return upperLimit().equals(lowerLimit()) && !isEmpty();
    	else
    		return false;
    }

    public boolean isBelow(Integer value) {
        if (!hasUpperLimit()) return false;
        if (value == null) return true; // infinity
        int comparison = upperLimit().compareTo(value);
        return comparison < 0 || (comparison == 0 && !includesUpperLimit());
    }

    public boolean isAbove(Integer value) {
        if (!hasLowerLimit()) return false;
        if (value == null) return false; // -infinity
        int comparison = lowerLimit().compareTo(value);
        return comparison > 0 || (comparison == 0 && !includesLowerLimit());
    }

    /** Compares according to earliest occurrence in time */
    public int compareTo(Object arg) {
        Interval other = (Interval) arg;
        if(!hasLowerLimit() && other.hasLowerLimit())
        	return -1;
        if(hasLowerLimit() && !other.hasLowerLimit())
        	return 1;
        if(!hasLowerLimit() && !other.hasLowerLimit()) {
        	if(!hasUpperLimit() && other.hasUpperLimit())
        		return 1;
        	if(hasUpperLimit() && !other.hasUpperLimit())
        		return -1;
        	if(!hasUpperLimit() && !other.hasUpperLimit())
        		return 0;
	        if (!upperLimit().equals(other.upperLimit()))
	        	return upperLimit().compareTo(other.upperLimit());
	        if (includesUpperLimit() && !other.includesUpperLimit())
	        	return 1;
	        if (!includesUpperLimit() && other.includesUpperLimit())
	        	return -1;
	        return 0;
        }
        if (lowerLimit().equals(other.lowerLimit())) {
	        if (includesLowerLimit() && !other.includesLowerLimit())
	            return -1;
	        if (!includesLowerLimit() && other.includesLowerLimit())
	            return 1;
	    }
        return lowerLimit().compareTo(other.lowerLimit());
    }

    public String toString() {
        if (isEmpty())
            return "{}";
        if (isSingleElement())
            return "{" + ((lowerLimit() != null)? lowerLimit().toString() : "null") + "}";
        StringBuffer buffer = new StringBuffer();
        buffer.append(includesLowerLimit() ? "[" : "(");
        buffer.append((lowerLimit() != null) ? lowerLimit().toString() : "null");
        buffer.append(", ");
        buffer.append((upperLimit() != null) ? upperLimit().toString() : "null");
        buffer.append(includesUpperLimit() ? "]" : ")");
        return buffer.toString();
    }

    private Integer lesserOfLowerLimits(Interval other) {
        if (lowerLimit() == null || other.lowerLimit() == null) {
            return null;
        }
        int lowerComparison = lowerLimit().compareTo(other.lowerLimit());
        if (lowerComparison <= 0)
            return this.lowerLimit();
        return other.lowerLimit();
    }

    Integer greaterOfLowerLimits(Interval other) {
        if (lowerLimit() == null) {
            return other.lowerLimit();
        }
        if(other.lowerLimit() == null) {
        	return this.lowerLimit();
        }
        int lowerComparison = lowerLimit().compareTo(other.lowerLimit());
        if (lowerComparison >= 0)
            return this.lowerLimit();
        return other.lowerLimit();
    }

    Integer lesserOfUpperLimits(Interval other) {
        if (upperLimit() == null) {
            return other.upperLimit();
        }
        if(other.upperLimit() == null) {
        	return this.upperLimit();
        }
        int upperComparison = upperLimit().compareTo(other.upperLimit());
        if (upperComparison <= 0)
            return this.upperLimit();
        return other.upperLimit();
    }

    private Integer greaterOfUpperLimits(Interval other) {
        if (upperLimit() == null || other.upperLimit() == null) {
            return null;
        }
        int upperComparison = upperLimit().compareTo(other.upperLimit());
        if (upperComparison >= 0)
            return this.upperLimit();
        return other.upperLimit();
    }

    private boolean greaterOfLowerIncludedInIntersection(Interval other) {
    	Integer limit = greaterOfLowerLimits(other);
        return this.includes(limit) && other.includes(limit);
    }

    private boolean lesserOfUpperIncludedInIntersection(Interval other) {
    	Integer limit = lesserOfUpperLimits(other);
        return this.includes(limit) && other.includes(limit);
    }

    private boolean greaterOfLowerIncludedInUnion(Interval other) {
    	Integer limit = greaterOfLowerLimits(other);
        return this.includes(limit) || other.includes(limit);
    }

    private boolean lesserOfUpperIncludedInUnion(Interval other) {
    	Integer limit = lesserOfUpperLimits(other);
        return this.includes(limit) || other.includes(limit);
    }

    public boolean equals(Object other) {
        try {
        	if(other instanceof Interval)
        		return equals((Interval)other);
        	else if(other instanceof Integer)
        		return this.isSingleElement() && this.lowerLimitObject.getValue().equals(other);
        	else
        		return false;
        } catch(ClassCastException ex) {
            return false;
        }
    }
    public boolean equals(Interval other) {
        if (other == null) return false;
        
        boolean thisEmpty = this.isEmpty();
        boolean otherEmpty = other.isEmpty();
        if (thisEmpty & otherEmpty)
            return true;
        if (thisEmpty ^ otherEmpty)
            return false;

        boolean thisSingle = this.isSingleElement();
        boolean otherSingle = other.isSingleElement();
        if (thisSingle & otherSingle)
            return this.lowerLimit().equals(other.lowerLimit());
        if (thisSingle ^ otherSingle)
            return false;

        return compareTo(other) == 0;
    }

    public int hashCode() {
    	int result = 0;
    	
    	if(lowerLimit() != null)
    		result = lowerLimit().hashCode();
    	
    	if(upperLimit() != null)
    		result ^= upperLimit().hashCode();
    	
    	return result;
    }

    public boolean intersects(Interval other) {
        int comparison = greaterOfLowerLimits(other).compareTo(lesserOfUpperLimits(other));
        if (comparison < 0)
            return true;
        if (comparison > 0)
            return false;
        return greaterOfLowerIncludedInIntersection(other) && lesserOfUpperIncludedInIntersection(other);
    }

    public Interval intersect(Interval other) {
    	Integer intersectLowerBound = greaterOfLowerLimits(other);
    	Integer intersectUpperBound = lesserOfUpperLimits(other);
        if (intersectLowerBound != null
        	&& intersectUpperBound != null
        	&& intersectLowerBound.compareTo(intersectUpperBound) > 0)
            return emptyOfSameType();
        return newOfSameType(intersectLowerBound, greaterOfLowerIncludedInIntersection(other), intersectUpperBound, lesserOfUpperIncludedInIntersection(other));
    }

    public Interval gap(Interval other) {
        if (this.intersects(other))
            return this.emptyOfSameType();

        return newOfSameType(lesserOfUpperLimits(other), !lesserOfUpperIncludedInUnion(other), greaterOfLowerLimits(other), !greaterOfLowerIncludedInUnion(other));
    }

    /**
     * Offsets the Interval by a given integer.
     * @param offset
     * @return offset Interval
     */
    public Interval offset(Integer offset, boolean positive) {
    	int off = (positive) ? offset : -offset;
    	Integer lowerBound = (hasLowerLimit()) ? lowerLimit() + off : null;
    	Integer upperBound = (hasUpperLimit()) ? upperLimit() + off : null;
    	
		return newOfSameType(lowerBound, includesLowerLimit(),
							 upperBound, includesUpperLimit());	
	}

    /**
     * Offsets the Interval by a given integer.
     * @param offset
     * @return offset Interval
     */
    public Interval offset(Interval offset, boolean positive) {
    	Integer lower = null;
    	Integer upper = null;
    	boolean closedLower = false;
    	boolean closedUpper = false;
    	
    	if(this.hasLowerLimit() && offset.hasLowerLimit()) {
    		if(positive) {
    			lower = this.lowerLimit() + offset.lowerLimit();
        		closedLower = (this.includesLowerLimit() && offset.includesLowerLimit());
    		} else {
    			lower = this.lowerLimit() - offset.lowerLimit();
        		closedLower = (this.includesLowerLimit() == offset.includesLowerLimit()); //FIXME: bug
    		}
    	}
    		
    	if(this.hasUpperLimit() && offset.hasUpperLimit()) {
    		if(positive) {
    			upper = this.upperLimit() + offset.upperLimit();
    			closedUpper = (this.includesUpperLimit() && offset.includesUpperLimit());
    		} else {
    			upper = this.upperLimit() - offset.upperLimit();
    			closedUpper = (this.includesUpperLimit() == offset.includesUpperLimit());
    		}
    	}
    	
//    	if(upper >= lower)
    		return newOfSameType(lower, closedLower, upper, closedUpper);
//    	else
//    		return newOfSameType(upper, closedUpper, lower, closedLower);
	}
    
    /**
     * Offsets the Interval by a given Number (integer part taken).
     * @param right
     * @return Interval with lower = lower * right, upper = upper * right
     */
    public Interval mul(Number right) {
    	Integer lower = null;
    	Integer upper = null;
    	
    	if(this.hasLowerLimit()) {
			lower = this.lowerLimit() * right.intValue();
    	}
    		
    	if(this.hasUpperLimit()) {
			upper = this.upperLimit() * right.intValue();
    	}
    	
    	// If multiplying by a negative number, switch bounds
    	if(right.intValue() >= 0)
    		return newOfSameType(lower, this.includesLowerLimit(), upper, this.includesUpperLimit());
    	else
    		return newOfSameType(upper, this.includesUpperLimit(), lower, this.includesLowerLimit());    		
	}
    
    /**
     * Returns the time interval that can be added to other interval to get to this time interval.
     * Example:
     * 
     *   [20, 40].relate([10, 35]) = [5, 30]
     *   [l2, u2]        [l1, u1]
     *   
     *   result = order of ( min(l2-l1, u2-u1), u2-l1 )
     * 
     * @param value
     * @return
     */
    public Interval relate(Interval value) {
    	Integer lower = null;
    	Integer upper = null;
    	boolean includesLower = false;
    	boolean includesUpper = false;
    	
    	if(hasLowerLimit() && value.hasLowerLimit()) {
    		if(hasUpperLimit() && value.hasUpperLimit()) {
	    		int l2l1 = lowerLimit() - value.lowerLimit();
	    		int u2u1 = upperLimit() - value.upperLimit();
	    		
	   			includesLower = (l2l1 < u2u1) ? includesLowerLimit() : includesUpperLimit(); 
	    		lower = Math.min(l2l1, u2u1);
    		} else {
    			lower = lowerLimit() - value.lowerLimit();
    		}
    	}
    	
    	if(hasUpperLimit() && value.hasUpperLimit()){
    		upper = upperLimit() - value.upperLimit();
    		includesUpper = includesUpperLimit();
    	}
    		
    	return newOfSameType(lower,includesLower, upper,includesUpper);	
   	}
    
    /** see: http://en.wikipedia.org/wiki/Set_theoretic_complement */
    public List complementRelativeTo(Interval other) {
        List intervalSequence = new ArrayList();
        if (!this.intersects(other)) {
            intervalSequence.add(other);
            return intervalSequence;
        }
        Interval left = leftComplementRelativeTo(other);
        if (left != null)
            intervalSequence.add(left);
        Interval right = rightComplementRelativeTo(other);
        if (right != null)
            intervalSequence.add(right);
        return intervalSequence;
    }

	private Interval leftComplementRelativeTo(Interval other) {
        if (this.includes(lesserOfLowerLimits(other)))
            return null;
        if (lowerLimit().equals(other.lowerLimit()) && !other.includesLowerLimit())
            return null;
        return newOfSameType(other.lowerLimit(), other.includesLowerLimit(), this.lowerLimit(), !this.includesLowerLimit());
    }

    private Interval rightComplementRelativeTo(Interval other) {
        if (this.includes(greaterOfUpperLimits(other)))
            return null;
        if (upperLimit().equals(other.upperLimit()) && !other.includesUpperLimit())
            return null;
        return newOfSameType(this.upperLimit(), !this.includesUpperLimit(), other.upperLimit(), other.includesUpperLimit());
    }
}