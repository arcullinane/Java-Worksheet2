/**
 * Program to store the details of members of a club
 * @author andrew cullinane
 */

public class ClubMember {

	// declare variables
	private String name;
	private String dateOfBirth;
	private String registrationNumber;
	private String membershipType;

	// make object
	/**
	 * @param name - club member name as String
	 * @param dateOfBirth - club member date of birth as String
	 * @param registrationNumber - club member registration number as String
	 * @param membershipType - club member membership type as String
	 */
	public ClubMember(String name, String dateOfBirth, String registrationNumber, String membershipType) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.registrationNumber = registrationNumber;
		this.membershipType = membershipType;
	}

	// get name
	/**
	 * @return name of club member
	 */
	public String getName() {
		return name;
	}

	// get date of birth
	/**
	 * @return date of birth of club member
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	// get registration number
	/**
	 * @return registration number of club member
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	// get membership type
	/**
	 * @return membership type of club member
	 */
	public String getMembershipType() {
		return membershipType;
	}

	// output string
	/**
	 * @return gives a string output Name, Date of Birth, Registration Number, and Membership type
	 */
	public String toString() {
		return "[" + name + ", " + dateOfBirth + ", ID: " + registrationNumber + ", " + membershipType + "]";
	}
}
