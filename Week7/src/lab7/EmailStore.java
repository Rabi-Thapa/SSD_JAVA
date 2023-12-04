package lab7;

import java.util.HashSet;
import java.util.Set;

public class EmailStore {
	Set<String> emailAddress = new HashSet<>();

	public boolean addEmail(String email) {
		if (emailAddress.contains(email)) {
			return false;
		} else {
			emailAddress.add(email);
			return true;
		}
	}
	
	public boolean hasEmail(String email) {
		if(emailAddress.contains(email)) {
			return true;
		}
		return false;
	}

	public void displayEmails() {
		System.out.println("\n\nEmails are:");
		
		for(String str: emailAddress) {
			System.out.println(str);
		}
	}
}
