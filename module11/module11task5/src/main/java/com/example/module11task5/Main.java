package com.example.module11task5;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		StreamZipper streamZipper = new StreamZipper();

		Stream<Integer> first = Stream.of(1,2,3,4);
		Stream<Integer> second = Stream.of(7,8,9,10,11,13);

		Stream result = streamZipper.zip(first, second);
		result.forEach(System.out::println);
	}
}
