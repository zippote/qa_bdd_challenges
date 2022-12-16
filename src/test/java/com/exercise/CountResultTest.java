package com.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountResultTest {
    @Test
    void testGetAndSetVowelCount() {
        int a = 10;
        CountResult countResult = new CountResult("testing", 5, 6);
        countResult.setVowelCount(10);
        int value = countResult.getVowelCount();
        System.out.println(value);
        Assertions.assertEquals(value, a);
    }

    @Test
    void testGetAndSetConsonantsCount() {
        int a = 10;
        CountResult countResult = new CountResult("testing", 5, 6);
        countResult.setConsonantCount(10);
        int value = countResult.getConsonantCount();
        System.out.println(value);
        Assertions.assertEquals(value, a);
    }
    @Test
    void testGetAndSetWord() {
        String word = "Orange";
        CountResult countResult = new CountResult("testing", 5, 6);
        countResult.setWord("Orange");
        String value = countResult.getWord();
        System.out.println(value);
        Assertions.assertEquals(value, word);
    }
}