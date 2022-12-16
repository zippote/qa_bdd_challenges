package com.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VowelCounterTest {
    @Test
    void inputWordsWithVowelsAndConsonants(){
        VowelCounter counter = new VowelCounter();
        String expected = "[CountResult{word='cases', vowelCount=2, consonantCount=3}, " +
                "CountResult{word='testing', vowelCount=2, consonantCount=5}]";
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(new String[]{"cases", "testing"})).toString());
    }
    @Test
    void inputWordWithZeroVowels(){
        VowelCounter counter = new VowelCounter();
        String expected = "[CountResult{word='bmw', vowelCount=0, consonantCount=3}]";
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(new String[]{"bmw"})).toString());
    }

    //    the following is a failing test
    @Test
    void inputWordWithUppercaseVowels(){
        VowelCounter counter = new VowelCounter();
        String expected = "[CountResult{word='Alvaro', vowelCount=3, consonantCount=3}]";
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(new String[]{"Alvaro"})).toString());
    }

    @Test
    void inputWordWithUppercaseConsonants(){
        VowelCounter counter = new VowelCounter();
        String expected = "[CountResult{word='Dublin', vowelCount=2, consonantCount=4}]";
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(new String[]{"Dublin"})).toString());
    }

    @Test
    void inputWordWithZeroConsonants(){
        VowelCounter counter = new VowelCounter();
        String expected = "[CountResult{word='ie', vowelCount=2, consonantCount=0}]";
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(new String[]{"ie"})).toString());
    }

    @Test
    void inputListWithNonLatinAlphabetWords(){
        VowelCounter counter = new VowelCounter();
        String expected = "[CountResult{word='дом', vowelCount=0, consonantCount=0}]";
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(new String[]{"дом"})).toString());
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