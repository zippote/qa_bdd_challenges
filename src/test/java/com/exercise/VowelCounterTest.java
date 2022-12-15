package com.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class VowelCounterTest {
    @Test
    void inputWordsWithVowelsAndConsonants(){
        VowelCounter counter = new VowelCounter();
        List<String> expectedList = Arrays.asList("CountResult{word='cases', vowelCount=2, consonantCount=3}", "CountResult{word='testing', vowelCount=2, consonantCount=5}");
        Assertions.assertEquals(expectedList.toString(), (counter.getVowelListWithCount(new String[]{"cases", "testing"})).toString());
    }
    @Test
    void inputWordWithZeroVowels(){
        VowelCounter counter = new VowelCounter();
        List<String> expectedList = Arrays.asList("CountResult{word='bmw', vowelCount=0, consonantCount=3}");
        Assertions.assertEquals(expectedList.toString(), (counter.getVowelListWithCount(new String[]{"bmw"})).toString());
    }
    @Test
    void inputWordWithZeroConsonants(){
        VowelCounter counter = new VowelCounter();
        List<String> expectedList = Arrays.asList("CountResult{word='ie', vowelCount=2, consonantCount=0}");
        Assertions.assertEquals(expectedList.toString(), (counter.getVowelListWithCount(new String[]{"ie"})).toString());
    }

    @Test
    void inputMoreThanFourWords(){
        VowelCounter counter = new VowelCounter();
        Assertions.assertNull(counter.getVowelListWithCount(new String[]{"house", "bird", "shoe", "testing", "qa" }));
    }

    @Test
    void inputEmptyList(){
        VowelCounter counter = new VowelCounter();
        Assertions.assertEquals("[]", (counter.getVowelListWithCount(new String[]{})).toString());
    }

}