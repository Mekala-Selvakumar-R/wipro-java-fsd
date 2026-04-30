package com.demo.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(" BeforeAll - It will be get executed only once - Before the execution of all test cases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll- It will be get executed only once - after all test cases get executed");
	}

	private Calculator calc;

	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator(20, 30);
		System.out.println("BeforeEach - will be get executed before each and every test case");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach - will be get executed after each and every test case");
		calc = null;
	}

	@Test
	void testAdd() {
		int expected = 50;
		int actual = calc.add();
		assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		int expected = 600;
		int actual = calc.multiply();
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplyNegative() {
		calc.setOperand1(-100);
		int expected = -1;
		int actual = calc.multiply();
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplyNegative1() {
		calc.setOperand2(-100);
		int expected = -1;
		int actual = calc.multiply();
		assertEquals(expected, actual);

	}

	@Test
	void testMultiplyBothNegative1() {
		calc.setOperand2(-100);
		calc.setOperand1(-20);
		int expected = -1;
		int actual = calc.multiply();
		assertEquals(expected, actual);

	}

	@Test
	void testIsEvenPositive() {
		boolean result = calc.isOperand1Even();
		assertTrue(result);
	}

	@Test
	void testDividePositive() throws InvalidOperandException {
		calc = new Calculator(15, 4);
		int result = calc.divide();
		assertEquals(3, result);
	}

	@Test
	void testDivideOperand1Zero() {
		calc = new Calculator(0, 4);
		assertThrows(InvalidOperandException.class, () -> calc.divide());
	}

	@Test
	void testDivideOperand2Zero() {
		calc = new Calculator(15, 0);
		InvalidOperandException ex = assertThrows(InvalidOperandException.class, () -> calc.divide());
		assertEquals("Operand should be  greater than 0", ex.getMessage());
	}
	
	@Test
	void testDivideBothZero() {
		calc = new Calculator(0, 0);
		InvalidOperandException ex = assertThrows(InvalidOperandException.class, () -> calc.divide());
		assertEquals("Operand should be  greater than 0", ex.getMessage());
	}


}
