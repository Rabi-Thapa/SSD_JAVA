package lab4;

import java.util.Scanner;

public class Menu {
	void displayMenuOption(int opt) throws InvalidOptionException{
		if(opt>=1 && opt<=3) {
			System.out.println("Menu options "+opt+" accepted.");
		} else {
			 throw new InvalidOptionException("Invalid option: " + opt);
		}
		
	}
}
