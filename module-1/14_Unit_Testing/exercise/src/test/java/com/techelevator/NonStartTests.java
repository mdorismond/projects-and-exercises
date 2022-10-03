package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {

    @Test
    public void FullStrings_ExpectNormalConcatenation(){

        NonStart = exercises = new NonStart();

        Assert.assertEquals("ellohere", exercises.getPartialString( "Hello", "There"));
    }


@Test

public void  PartialString_ExpectPartialConcat() {

        NonStart exercises = new NonStart();

    Assert.assertEquals("here", exercises.getPartialString("", "There"));
    Assert.assertEquals("i", exercises.getPartialString("Hi", ""));

    }
}
