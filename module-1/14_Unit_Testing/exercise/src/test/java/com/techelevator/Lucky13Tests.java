package com.techelevator;

import org.junit.Test;

import java.util.HashMap;

public class Lucky13Tests {
    @Test
    public void Test_Expect1(){
        WordCount exercises = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Josh", 1);
        expected.put("David", 1);
        expected.put("Casey", 1);
        expected.put("Craig", 1);

        assertEquals(expected, exercises.getCount(new String[] { "Josh", "David", "Casey", "Craig"}));

    }
}



