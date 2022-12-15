package com.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class VowelCounterTest {
    @Test
    void inputWordsWithVowels(){
        VowelCounter vowelCounter = new VowelCounter();
        List<String> expectedList = Arrays.asList("CountResult{word='casa', vowelCount=2}", "CountResult{word='amarillo', vowelCount=4}");
        Assertions.assertEquals(expectedList.toString(), (vowelCounter.getVowelListWithCount(new String[]{"casa", "amarillo"})).toString());
    }
    @Test
    void inputWordWithZeroVowels(){
        VowelCounter vowelCounter = new VowelCounter();
        List<String> expectedList = Arrays.asList("CountResult{word='bmw', vowelCount=0}");
        Assertions.assertEquals(expectedList.toString(), (vowelCounter.getVowelListWithCount(new String[]{"bmw"})).toString());
    }

    @Test
    void inputMoreThanFourWords(){
        VowelCounter vowelCounter = new VowelCounter();
        Assertions.assertNull(vowelCounter.getVowelListWithCount(new String[]{"house", "bird", "shoe", "testing", "qa" }));
    }

    @Test
    void inputEmptyList(){
        VowelCounter vowelCounter = new VowelCounter();
        Assertions.assertEquals("[]", (vowelCounter.getVowelListWithCount(new String[]{})).toString());
    }

}