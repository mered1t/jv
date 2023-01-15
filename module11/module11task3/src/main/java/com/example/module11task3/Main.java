package com.example.module11task3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,0},{4,5}};
		ElementsConcatenate elementsConcatenator = new ElementsConcatenate();

		String result = elementsConcatenator.concatIntoStream(arr);

		System.out.println("Array: " + Arrays.deepToString(arr));
		System.out.println("Changed array: " + result);
	}
}
