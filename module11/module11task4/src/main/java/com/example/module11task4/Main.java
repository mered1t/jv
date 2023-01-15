package com.example.module11task4;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		InfiniteStreamGenerator ISG = new InfiniteStreamGenerator();

		Stream<Long> result = ISG.generateRandomStream(5L, 3L, 7L);
		result.forEach(System.out::println);
	}
}
