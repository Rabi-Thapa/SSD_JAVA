package lab2;

import java.util.Scanner;

public class Driver {
	static Scanner scan= new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("enter some text: ");
		String text= scan.nextLine();
		WordProcessor wp= new WordProcessor();
		
		System.out.println("Total Words: "+ wp.countWords(text));
		System.out.println("Total letters: "+ wp.countLetters(text));
		System.out.println("Length: "+ wp.getLength(text));
		
//		text= null;
//		System.out.println("Total Words: "+ wp.countWords(text));
//		System.out.println("Total letters: "+ wp.countLetters(text));
//		System.out.println("Length: "+ wp.getLength(text));
	}
}
