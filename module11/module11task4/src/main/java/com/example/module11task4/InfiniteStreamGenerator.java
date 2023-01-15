package com.example.module11task4;

import java.util.Scanner;
import java.util.stream.Stream;

public class InfiniteStreamGenerator implements LinearCongruenceGenerator {

    @Override
    public Stream<Long> generateRandomStream(long a, long c, long m) {
        long seed = askForSeed();

        return Stream.iterate(seed, x -> ((a * x + c) % m));
    }

    public Long askForSeed(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seed: ");
        String seed = scanner.nextLine();

        while(!isNumber(seed)){
            System.out.print("Enter correct value: ");
            seed = scanner.nextLine();
        }

        return (long) Integer.parseInt(seed);
    }

    private boolean isNumber(String number){

        int i = number.charAt(0) == '-' ? 1 : 0;
        for (; i < number.length(); i++) {
            if(!Character.isDigit(number.charAt(i))){
                return false;
            }
        }

        return true;
    }
}
