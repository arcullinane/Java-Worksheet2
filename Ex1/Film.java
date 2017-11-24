/**
 * Program to store film title, the year of release, and film length
 * @author andrew cullinane
 */

public class Film {
	
	// declare variables
	private String title;
	private int year;
	private int length;

	// make object
	/**
	 * @param title - title of the film as String
	 * @param year - year of release as int
	 * @param length - length of film in minutes as int
	 */
	public Film(String title, int year, int length) {
		this.title = title;
		this.year = year;
		this.length = length;
	}

	// get title
	/**
	 * @return title of film
	 */
	public String getTitle() {
		return title;
	}

	// get year
	/**
	 * @return year of release
	 */
	public int getYear() {
		return year;
	}

	// get length
	/**
	 * @return length of film in minutes
	 */
	public int getLength() {
		return length;
	}

	// set length
	/**
	 * @param newLength - give new length of film in minutes as int
	 */
	public void setLength(int newLength) {
		this.length = newLength;
	}

	// output string
	/**
	 * @return gives string output Title, Year, Length
	 */
	public String toString() {
		return "Title: " + title + "\nYear: " + year + "\nLength: " + length + " minutes";
	}
}
