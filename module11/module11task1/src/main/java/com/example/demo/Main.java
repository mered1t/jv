package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		SolutionFinder solFind = new SolutionFinder();
		ListFiller filler = new ListFiller();
		List<String> list = new ArrayList<>();

		filler.fillList(list);
		System.out.println("\nGenerated array:\n" + Arrays.toString(list.toArray()));
		solFind.eraseEven(list);
		System.out.print("\nFiltered array:\n" + Arrays.toString(list.toArray()));
	}
}
