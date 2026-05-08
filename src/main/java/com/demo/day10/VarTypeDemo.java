package com.demo.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class VarTypeDemo {

	public static void main(String[] args) throws IOException {
		// local variable for main method
		var list = new ArrayList<>();
		// The type of the variables are inferred from the context:

		var list1 = new ArrayList<String>(); // infers ArrayList<String>
		var stream = list.stream(); // infers Stream<String>
		var fileName = "";
		var path = Paths.get(fileName); // infers Path
		var bytes = Files.readAllBytes(path); // infers bytes[]
		for (var i = 0; i < 5; i++) {
			System.out.println(i);
		}
		int[] arr = { 10, 20, 30, 40, 50 };
		for (var i : arr) {
			System.out.println(i);

		}

	}

}
