package main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import main.java.Calculator;

public class CalcTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		assertEquals(404, calc.add(402, 2));
		assertEquals(404, calc.sub(406, 2));
		assertEquals(404, calc.multiply(202, 2));
		assertEquals(404, calc.divide(808, 2));
	}

	@Test
	public void testAdd_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		Calculator calc = new Calculator();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);
	}


	@Test
	public void testAdd_BothNumbersAreNegative_ShouldReturnNegativeNumber() {
		// Arrange
		int a = -10;
		int b = -20;
		Calculator calc = new Calculator();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result < 0);
	}
}
