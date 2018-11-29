package com.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareStringTest {

    @Test
    public void compareIgnoreCase_ReturnsFalse_WhenStringsNotEqual() {
        CompareString compareString = new CompareString();
        assertEquals(false, compareString.compareIgnoreCase("helo", "hello"));
    }

    @Test(expected = NullPointerException.class)
    public void compareIgnoreCase_RaisesException_WhenStringsAreNull() {
        CompareString compareString = new CompareString();
        compareString.compareIgnoreCase(null, null);
    }

}
