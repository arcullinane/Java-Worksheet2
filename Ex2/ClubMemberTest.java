import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for exercise 2 - ClubMember
 * @author andrew cullinane
 */

public class ClubMemberTest {

	// Test getName
	@Test
	public void testGetName() {
		ClubMember test = new ClubMember("John Smith", "5 October 1993", "C212121", "Gold");
		String name = test.getName();
		assertEquals("John Smith", name);
	}

	// Test getDateOfBirth
	@Test
	public void testGetDateOfBirth() {
		ClubMember test = new ClubMember("John Smith", "5 October 1993", "C212121", "Gold");
		String dateOfBirth = test.getDateOfBirth();
		assertEquals("5 October 1993", dateOfBirth);
	}

	// Test getRegistrationNumber
	@Test
	public void testGetRegistrationNumber() {
		ClubMember test = new ClubMember("John Smith", "5 October 1993", "C212121", "Gold");
		String registrationNumber = test.getRegistrationNumber();
		assertEquals("C212121", registrationNumber);
	}

	// getMembershipType
	@Test
	public void testGetMembershipType() {
		ClubMember test = new ClubMember("John Smith", "5 October 1993", "C212121", "Gold");
		String membershipType = test.getMembershipType();
		assertEquals("Gold", membershipType);
	}

	// toString
	@Test
	public void testToString() {
		ClubMember test = new ClubMember("John Smith", "5 October 1993", "C212121", "Gold");
		String clubMemberString = test.toString();
		assertEquals("[John Smith, 5 October 1993, ID: C212121, Gold]", clubMemberString);
	}
}
