/**
 * Program to convert kilometres to metres, miles, and yards
 * @author andrewcullinane
 */
public class Distance {

	// declare variables
	private double km;

	// make object
	/**
	 * @param km as double
	 */
	public Distance(double km) {
		this.km = km;
	}

	// get miles
	/**
	 * @return miles given kilometres
	 */
	public double getMiles() {
		return (km / 1.60934);
	}

	// get kilometres
	/**
	 * @return kilometres given kilometres
	 */
	public double getKilometres() {
		return km;
	}

	// get metres
	/**
	 * @return metres given kilometres
	 */
	public double getMetres() {
		return km * 1000;
	}

	// get yards
	/**
	 * @return yards given kilometres
	 */
	public double getYards() {
		return (km / 1.60934) * 1760;
	}

}