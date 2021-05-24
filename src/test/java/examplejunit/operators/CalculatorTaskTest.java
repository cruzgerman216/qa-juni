package examplejunit.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.qa.examplejunit.operators.CalculatorTask;

public class CalculatorTaskTest {

	@Test
	public void addTest() {
		double result = CalculatorTask.add(12, 3);

		// Assertions - a way to see what succeeded and failed
		// fail();
		// assertTrue | assertFalse
		// assertEquals | assetEquals
		// assertNull | assertNotNull
		// assertSame | assertNotSame

		// Expectation, actual

		assertNotNull(result);
//		assertTrue(result instanceof Double);
		assertEquals(15, result);
	}

	@Test
	public void subtractTest() {
		double result = CalculatorTask.subtraction(12, 3);
		assertEquals(9, result);

	}

	@Test
	public void multiplicationTest() {
		double result = CalculatorTask.multiplication(12, 3);
		assertEquals(36, result);

	}

	@Test
	public void division() {
		double result = CalculatorTask.division(12, 3);
		assertEquals(4, result);

	}

	@Test
	public void mod() {
		double result = CalculatorTask.mod(12, 3);
		assertEquals(0, result);

	}
}
