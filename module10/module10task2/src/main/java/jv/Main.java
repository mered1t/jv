package jv;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		SolutionFinder solutionFinder= new SolutionFinder();
		List<User> list = new ArrayList<>();

		String textFileName = "file.txt";
		String jsonFileName = "user.json";

		solutionFinder.createFile(textFileName);
		solutionFinder.readFile(list, textFileName);
		solutionFinder.toJsonList(list, jsonFileName);
	}
}
