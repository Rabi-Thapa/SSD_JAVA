package lab7;

import java.util.HashSet;
import java.util.Set;

public class EmailStore {
	/*
	 * Set to store the unique email address.
	 */
	Set<String> emailAddress = new HashSet<>();

	/*
	 *  To store the given email to the Set and it returns true if email is added
	 *  @param email The email address to be added
	 */
	public boolean addEmail(String email) {
		if (emailAddress.contains(email)) {
			return false;
		} else {
			emailAddress.add(email);
			return true;
		}
	}
	
	/*
	 * Checks whether the given parameter represents an email address already stored
	 * @param email The email address to be checked
	 */
	public boolean hasEmail(String email) {
		if(emailAddress.contains(email)) {
			return true;
		}
		return false;
	}

	/*
	 * Displays each stored email address
	 */
	public void displayEmails() {
		System.out.println("\n\nEmails are:");
		
		for(String str: emailAddress) {
			System.out.println(str);
		}
	}
}
