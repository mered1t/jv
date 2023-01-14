package com.example.module11task2;

import java.util.*;

public class ListFiller {

    public void fillList(List<String> list){
        int numberOfWords = askForWordsAmount();
        list.addAll(List.of(generateRandomWords(numberOfWords)));
    }

    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        for(int i = 0; i < numberOfWords; i++)
        {
            String word = generateSingleWord(i + 1);
            randomStrings[i] = word;
        }
        return randomStrings;
    }

    private static String generateSingleWord(int n){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(n + ". ");
        for(int i = 0; i < r.nextInt(8)+3; i++) {
            char tmp = (char) ('a' + r.nextInt('y' - 'a'));
            sb.append(tmp);
        }
        return sb.toString();
    }

    private int askForWordsAmount(){
        int wordsNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        wordsNumber = scanner.nextInt();

        return wordsNumber;
    }
}