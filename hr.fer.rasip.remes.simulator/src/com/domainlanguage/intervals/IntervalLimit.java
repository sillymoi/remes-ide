/**
 * Based on source code by Domain Language, Inc.
 * Modifications by Marin Orlic <marin.orlic@gmail.com>
 */

/**
 * Copyright (c) 2005 Domain Language, Inc. (http://domainlanguage.com) This
 * free software is distributed under the "MIT" licence. See file licence.txt.
 * For more information, see http://timeandmoney.sourceforge.net.
 */
package com.domainlanguage.intervals;

class IntervalLimit implements Comparable {
    private boolean closed;
    private Integer value;
    private boolean lower;
    
    static IntervalLimit upper(boolean closed, Integer value) {
        return new IntervalLimit(closed, false, value);
    }
    static IntervalLimit lower(boolean closed, Integer value) {
        return new IntervalLimit(closed, true, value);
    }
    IntervalLimit(boolean closed, boolean lower, Integer value) {
        super();
        this.closed = closed;
        this.lower = lower;
        this.value = value;
    }
    
    boolean isLower() {
        return lower;
    }
    boolean isUpper() {
        return !lower;
    }
    boolean isClosed() {
        return closed;
    }
    boolean isOpen() {
        return !closed;
    }
    Integer getValue() {
        return value;
    }
    
    public int compareTo(Object another) {
        IntervalLimit other=((IntervalLimit)another);
        Integer otherValue=other.value;
        if (otherValue == value) return 0;
        if (value == null) {
            return lower ? -1 : 1;
        }
        if (otherValue == null) {
            return other.lower ? 1 : -1;
        }
        return value.compareTo(otherValue);
    }
}
