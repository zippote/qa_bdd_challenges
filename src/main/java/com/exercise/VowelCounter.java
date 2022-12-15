package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {

//    some minor naming changes needed here for variables and methods
    public List<CountResult> getVowelListWithCount(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> listCount = new ArrayList<>();
            argumentList.forEach(argument -> listCount.add(new CountResult(argument, getVowelCount(argument), getConsonantCount(argument))));
            return listCount;
        }
    }

    private Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

    private Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[bcdfghjklmnpqrstvwxyz]")).count();
    }
}
