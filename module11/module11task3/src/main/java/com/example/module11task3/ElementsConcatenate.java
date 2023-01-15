package com.example.module11task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ElementsConcatenate {

    public String concatIntoStream(int[][] arr){

        IntStream stream = IntStream.concat(Arrays.stream(arr[0]), Arrays.stream(arr[1])).sorted();

        int[] concatenated = stream.toArray();
        String result = Arrays.toString(concatenated);

        return result.substring(1, result.indexOf(']'));
    }
}
