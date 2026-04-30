package com.demo.day1;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		String name="Tom";
		System.out.println(name);
		Scanner  sc = new Scanner(System.in);
		//it accepts only one word  . delimiter  is blank space
		System.out.println("Enter Player Name");
//		String  playerName =sc.next();
		//delimiter - enter key , so it accepts entire line - more than one word
		String playerName = sc.nextLine();
		System.out.println(playerName);
		
		
 
	}

}
