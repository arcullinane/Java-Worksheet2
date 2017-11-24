/**
 * Program to calculate the addition and multiplication of real and imaginary numbers 
 * in the format z = a + bi
 * @author andrewcullinane
 */
public class Complex {

	// declare variables
	private double a;
	private double b;

	// make object
	/**
	 * z = a + bi
	 * @param a is real part as double
	 * @param b is imaginary part as double
	 */
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// get real part a
	/**
	 * @return real part a
	 */
	public double getRealPart() {
		return a;
	}

	// get imaginary part b
	/**
	 * @return imaginary part b
	 */
	public double getImaginaryPart() {
		return b;
	}

	// set format of output string
	/**
	 * @return outputs string in the form a + bi
	 */
	public String toString() {
		return a + " + " + b + "i";
	}

	// addition calculation
	/**
	 * Calculates the addition of two complex numbers
	 * @param summand - second complex number
	 * @return new Complex called addResult
	 */
	public Complex add(Complex summand) {
		//obtain complex 1 variables
		double a1 = this.a;
		double b1 = this.b;
		//obtain complex 2 variables
		double a2 = summand.a;
		double b2 = summand.b;
		//calculate new a and b values
		double a3 = a1 + a2;
		double b3 = b1 + b2;
		//make new complex of result
		Complex addResult = new Complex(a3, b3);
		return addResult;
	}

	// multiplication calculation
	/**
	 * Calculates the multiplication of two complex numbers
	 * @param factor - second complex number
	 * @return new Complex called multiplyResult
	 */
	public Complex multiply(Complex factor) {
		//obtain complex 1 variables
		double a1 = this.a;
		double b1 = this.b;
		//obtain complex 1 variables
		double a2 = factor.a;
		double b2 = factor.b;
		//calculate new a and b values
		double a3 = (a1 * a2) - (b1 * b2);
		double b3 = (a1 * b2) + (a2 * b1);
		//make new complex of result
		Complex multiplyResult = new Complex(a3, b3);
		return multiplyResult;
	}

}
