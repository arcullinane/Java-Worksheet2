import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for exercise 4 - Employee
 * @author andrew cullinane
 */

public class EmployeeTest {

	// tests getName
	@Test
	public void testGetName() {
		Employee test = new Employee("John", 10, 40);
		String name = test.getName();
		assertEquals("John", name);
	}

	// tests getHourlySalary
	@Test
	public void testGetHourlySalary() {
		Employee test = new Employee("John", 10, 40);
		double hourlySalary = test.getHourlySalary();
		assertEquals(10, hourlySalary, 0.01);
	}

	// tests getNumberOfHours
	@Test
	public void testGetNumberOfHours() {
		Employee test = new Employee("John", 10, 40);
		double numberOfHours = test.getNumberOfHours();
		assertEquals(40, numberOfHours, 0.01);
	}

	// tests setName
	@Test
	public void testSetName() {
		Employee test = new Employee("John", 10, 40);
		test.setName("Paul");
		String name = test.getName();
		assertEquals("Paul", name);
	}

	// tests setHourlySalary
	@Test
	public void testSetHourlySalary() {
		Employee test = new Employee("John", 10, 40);
		test.setHourlySalary(15);
		double hourlySalary = test.getHourlySalary();
		assertEquals(15, hourlySalary, 0.01);
	}

	// tests setNumberOfHours
	@Test
	public void testSetNumberOfHours() {
		Employee test = new Employee("John", 10, 40);
		test.setNumberOfHours(50);
		double numberOfHours = test.getNumberOfHours();
		assertEquals(50, numberOfHours, 0.01);
	}

	// tests toString
	@Test
	public void testToString() {
		Employee test = new Employee("John", 10, 40);
		String testString = test.toString();
		assertEquals("John has an hourly salary of 10.0 \u00a3 and has worked last month for 40 hours.", testString);
	}

	// tests monthlySalary
	@Test
	public void testMonthlySalary() {
		Employee test = new Employee("John", 10, 40);
		double testMonthlySalary = test.monthlySalary(20);
		assertEquals(320.0, testMonthlySalary, 0.01);
	}

	// tests increaseSalary
	@Test
	public void testIncreaseSalary() {
		Employee test = new Employee("John", 10, 40);
		test.increaseSalary(1);
		double hourlySalary = test.getHourlySalary();
		assertEquals(10.1, hourlySalary, 0.01);
	}

	//test "decrease" salary
	@Test
	public void testDecreaseSalary() {
		Employee test = new Employee("John", 10, 40);
		test.increaseSalary(-1);
		double hourlySalary = test.getHourlySalary();
		assertEquals(9.9, hourlySalary, 0.01);
	}
	
}
