package lab4;

public class Driver {
	public static void main(String [] args) {
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getArrayLength(new String[] {"one", "two", "three"});
		System.out.println("Array length is"+len);
		
		
		Menu m= new Menu();
		try {
			m.displayMenuOption(3);
			m.displayMenuOption(5);
		
		}catch (InvalidOptionException e) {
            System.out.println(e.getMessage());
        }
	}

	
	/*
	 * Performance - Catching exceptions is relatively slow compared to other flow control like (loops and conditional)
	 * Code readability- Exception based flow control make code less readable and harder to understand
	 * Debugging: Debugging code that uses exceptions for control flow can be more challenging because it's not immediately clear where an exception will be thrown and caught during execution. 
	 * Maintainability: Code that relies on exceptions for control flow can be harder to maintain
	 *
	 **/
}