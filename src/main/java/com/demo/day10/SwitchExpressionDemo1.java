package com.demo.day10;

public class SwitchExpressionDemo1 {

	public static void main(String[] args) {
		int numLetters = 0;
		Day day = Day.WEDNESDAY;
		// Normal switch case
		switch (day) {
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			numLetters = 6;
			break;
		case TUESDAY:
			numLetters = 7;
			break;
		case THURSDAY:
		case SATURDAY:
			numLetters = 8;
			break;
		case WEDNESDAY:
			numLetters = 9;
			break;
		default:
			throw new IllegalStateException("Invalid day: " + day);
		}
		System.out.println(numLetters);
		System.out.println("-------------");
		System.out.println("Switch Expression - case with multiple values and case  label");
		day = Day.WEDNESDAY;
		numLetters = 0;
		numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> throw new IllegalStateException("Invalid day: " + day);
		};

		System.out.println(numLetters);
		System.out.println(switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> 6;
		case TUESDAY -> 7;
		case THURSDAY, SATURDAY -> 8;
		case WEDNESDAY -> 9;
		default -> throw new IllegalStateException("Invalid day: " + day);
		});

		System.out.println("------------");
		// A "case L ->" label along with its code to its right is called a switch
		// labeled rule.

		numLetters = 0;
		day = Day.SATURDAY;
		switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
		case TUESDAY -> numLetters = 7;
		case THURSDAY, SATURDAY -> numLetters = 8;
		case WEDNESDAY -> numLetters = 9;
		default -> throw new IllegalStateException("Invalid day: " + day);
		}
		;
		System.out.println(numLetters);

		System.out.println("---------------------");

		day = Day.WEDNESDAY;
		numLetters = switch (day) {
		case MONDAY:
		case FRIDAY:
		case SUNDAY:
			System.out.println(6);
			yield 6;
		case TUESDAY:
			System.out.println(7);
			yield 7;
		case THURSDAY:
		case SATURDAY:
			System.out.println(8);
			yield 8;
		case WEDNESDAY:
			System.out.println(9);
			yield 9;
		default:
			throw new IllegalStateException("Invalid day: " + day);
		};
		System.out.println(numLetters);

		System.out.println("-------------------------");
		numLetters = switch (day) {
		case MONDAY, FRIDAY, SUNDAY -> {
			System.out.println(6);
			yield 6;
		}
		case TUESDAY -> {
			System.out.println(7);
			yield 7;
		}
		case THURSDAY, SATURDAY -> {
			System.out.println(8);
			yield 8;
		}
		case WEDNESDAY -> {
			System.out.println(9);
			yield 9;
		}
		default -> {
			throw new IllegalStateException("Invalid day: " + day);
		}
		};

	}

}

// case label_1, label_2, ..., label_n -> expression;|throw-statement;|block 
