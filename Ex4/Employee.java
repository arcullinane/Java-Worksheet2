/**
 * Program to store data on employees.
 * @author andrew cullinane
 */

public class Employee {

	// declare variables
	private String name;
	private double hourlySalary;
	private int numberOfHours;

	// make object
	/**
	 * @param name - employee name as String
	 * @param hourlySalary - employee's hourly salary as double
	 * @param numberOfHours - employee's number of hours as int
	 */
	public Employee(String name, double hourlySalary, int numberOfHours) {
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.numberOfHours = numberOfHours;
	}

	// get name
	/**
	 * @return employee's name
	 */
	public String getName() {
		return name;
	}

	// get hourly salary
	/**
	 * @return employee's hourly salary
	 */
	public double getHourlySalary() {
		return hourlySalary;
	}

	// get number of hours
	/**
	 * @return employee's number of hours
	 */
	public int getNumberOfHours() {
		return numberOfHours;
	}

	// set name
	/**
	 * @param newName - changes name to newName value as String
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	// set hourly salary
	/**
	 * @param newHourlySalary - changes employee's hourly salary to newHourlySalary value as double 
	 */
	public void setHourlySalary(double newHourlySalary) {
		this.hourlySalary = newHourlySalary;
	}

	// set number of hours
	/**
	 * @param newNumberOfHours - changes employee's number of hours to newNumberOfHours value as int
	 */
	public void setNumberOfHours(int newNumberOfHours) {
		this.numberOfHours = newNumberOfHours;
	}

	// output string
	/**
	 * @return gives a string output Name, hourly salary, and number of hours worked
	 */
	public String toString() {
		return name + " has an hourly salary of " + hourlySalary + " \u00a3 and has worked last month for " + numberOfHours
				+ " hours.";
	}
	
	// calculates monthly salary minus tax rate
	/**
	 * @param taxRate percentage as double
	 * @return monthly salary minus tax rate
	 */
	public double monthlySalary(double taxRate) {
		return (hourlySalary * numberOfHours) - ((taxRate / 100.0) * (hourlySalary * numberOfHours));
	}

	// sets new hourly salary rate given a %
	/**
	 * @param percentage increase in hourly salary as double
	 * sets new value for hourly salary
	 */
	public void increaseSalary(double percentage) {
		double salaryTotalInPence = hourlySalary * 100;
		this.setHourlySalary((salaryTotalInPence + ((percentage / 100.0) * salaryTotalInPence)) / 100);
	}

}
