import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for exercise 4 - DistanceTest
 * @author andrewcullinane
 */
public class DistanceTest {
	
	// tests getMiles
	@Test
	public void testGetMiles() {
		Distance test = new Distance(50);
		double miles = test.getMiles();
		assertEquals(31.068636832490338, miles, 0.01);
	}

	// tests getKilometres
	@Test
	public void testGetKilometres() {
		Distance test = new Distance(50);
		double km = test.getKilometres();
		assertEquals(50.0, km, 0.01);
	}

	// tests getMetres
	@Test
	public void testGetMetres() {
		Distance test = new Distance(50);
		double metres = test.getMetres();
		assertEquals(50000.0, metres, 0.01);
	}

	// tests getYards
	@Test
	public void testGetYards() {
		Distance test = new Distance(50);
		double yards = test.getYards();
		assertEquals(54680.800825182996, yards, 0.01);
	}

}