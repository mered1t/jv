package com.example.module11task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		SolutionFinder solFind = new SolutionFinder();
		ListFiller filler = new ListFiller();
		List<String> list = new ArrayList<>();
		List<String> result;

		filler.fillList(list);
		System.out.println("\nGenerated array:\n" + Arrays.toString(list.toArray()));
		result = solFind.textToUpperCase(list);
		System.out.print("\nChanged array:\n" + Arrays.toString(result.toArray()));
	}
}
