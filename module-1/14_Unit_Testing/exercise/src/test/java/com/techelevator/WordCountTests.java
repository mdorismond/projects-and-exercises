package com.techelevator;

import org.junit.Test;

import java.util.HashMap;

public class WordCountTests {

    @Test
    public void UniqueTest_Expect1Each() {

        WordCount exercises = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("ba",2);
        expected.put("black",1);
        expected.put("sheep",1);

    }
}



