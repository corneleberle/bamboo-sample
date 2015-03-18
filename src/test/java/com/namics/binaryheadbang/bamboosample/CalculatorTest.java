package com.namics.binaryheadbang.bamboosample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ceberle on 18/03/15.
 */
public class CalculatorTest {

    private DefaultCalculator defaultCalculator;

    @Before
    public void setUp() {
        defaultCalculator = new DefaultCalculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(9, defaultCalculator.add(4, 5));
    }

    @Test
    public void testAddNegative() {
        Assert.assertEquals(5, defaultCalculator.add(9, -4));
    }

}
