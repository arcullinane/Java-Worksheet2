import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for exercise 1 - Film
 * @author andrewcullinane
 */

public class FilmTest {

	// Test getTitle
	@Test
	public void testGetTitle() {
		Film test = new Film("Top Gun", 1986, 110);
		String filmTitle = test.getTitle();
		assertEquals("Top Gun", filmTitle);
	}

	// Test getYear
	@Test
	public void testGetYear() {
		Film test = new Film("Top Gun", 1986, 110);
		int filmYear = test.getYear();
		assertEquals(1986, filmYear);
	}

	// Test getLength
	@Test
	public void testGetLength() {
		Film test = new Film("Top Gun", 1986, 110);
		int filmLength = test.getLength();
		assertEquals(110, filmLength);
	}

	// Test setLength
	@Test
	public void testSetLength() {
		Film test = new Film("Top Gun", 1986, 110);
		test.setLength(0);
		int filmLength = test.getLength();
		assertEquals(0, filmLength);
	}

	// Test toString
	@Test
	public void testToString() {
		Film test = new Film("Top Gun", 1986, 110);
		String filmString = test.toString();
		assertEquals("Title: Top Gun\nYear: 1986\nLength: 110 minutes", filmString);
	}
}
