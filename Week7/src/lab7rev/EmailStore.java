package lab7rev;

import java.util.HashSet;
import java.util.Set;

public class EmailStore {
	Set<String> emailAddress = new HashSet<String>();
	
	boolean addEmail(String email) {
		if(emailAddress.contains(email)) {
			return false;
		}
		else {
			emailAddress.add(email);
			return true;
		}
	}
	
	boolean hasEmail(String email) {
		if(emailAddress.contains(email)) {
			return true;
		}
		else
			return false;
	}
	
	public void displayEmails() {
		for(String itr: emailAddress) {
			System.out.println(itr);
		}
	}
}
