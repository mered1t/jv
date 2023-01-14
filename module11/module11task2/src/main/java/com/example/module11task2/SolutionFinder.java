package com.example.module11task2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.CharSequence.compare;

public class SolutionFinder {

    public List<String> textToUpperCase(List<String> list){

        Stream<String> listStream = list.stream()
                .map(word -> word.toUpperCase())
                .sorted((s1, s2) -> compare(s2.substring(s2.indexOf(' ')), s1.substring(s1.indexOf(' '))));
        return listStream.collect(Collectors.toList());
    }
}
