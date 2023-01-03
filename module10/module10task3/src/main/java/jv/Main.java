package jv;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String[] args) {
		SolutionFinder solutionFinder = new SolutionFinder();
		HashMap<String, Integer> result = new LinkedHashMap();
		solutionFinder.processMethods(result);
	}
}
