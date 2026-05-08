package com.demo.day10;

public class TextBlockDemo1 {

	public static void main(String[] args) {
		String s1 = "This is first line \nThis is second line \nThis is third line ";
		System.out.println(s1);
		System.out.println("-----------------");
		// text block
		String s2 = """
				This is first line
				This is second line
				This is third line
				""";
		System.out.println(s2);
		// ERROR
//		String name = """red
//		                 green
//		                 blue
//		                 """;

		// OK
		String name = """
				red
				green
				blue
				""";

	}

}
