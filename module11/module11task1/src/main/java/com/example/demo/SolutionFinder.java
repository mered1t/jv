package com.example.demo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionFinder {

    public void eraseEven(List<String> list){
        Stream<String> listStream = list.stream().filter(word -> Integer.parseInt(word.substring(0,
                word.indexOf('.'))) % 2 != 0);
        list.retainAll(listStream.collect(Collectors.toList()));
    }
}
