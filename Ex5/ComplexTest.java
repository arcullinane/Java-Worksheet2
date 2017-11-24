import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for exercise 5 - Complex
 * @author andrew cullinane
 */
public class ComplexTest {

	// tests getRealPArt

	@Test
	public void testGetRealPart() {
		Complex test = new Complex(1,1);
		double real = test.getRealPart();
		assertEquals(1.0, real, 0.01);
	}

	// tests getImaginaryPart
	@Test
	public void testGetImaginaryPart() {
		Complex test = new Complex(1,1);
		double imaginary = test.getImaginaryPart();
		assertEquals(1.0, imaginary, 0.01);
	}

	// tests toString
	@Test
	public void testToString() {
		Complex test = new Complex(1,1);
		String outputString = test.toString();
		assertEquals("1.0 + 1.0i", outputString);
	}

	// tests addition calculation
	@Test
	public void testComplexAdd() {
		Complex test1 = new Complex(3,7);
		Complex test2 = new Complex(1,1);
		Complex testAdd = test1.add(test2);
		String output = testAdd.toString();
		assertEquals("4.0 + 8.0i", output);
	}

	// multiplication calculation
	@Test
	public void testComplexMultiply() {
		Complex test1 = new Complex(3,7);
		Complex test2 = new Complex(1,1);
		Complex testMultiply = test1.multiply(test2);
		String output = testMultiply.toString();
		assertEquals("-4.0 + 10.0i", output);
	}
}
