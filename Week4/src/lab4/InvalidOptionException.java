package lab4;

public class InvalidOptionException extends Exception {
	public InvalidOptionException(String msg){
		super("Invalid menu option"+ msg);

	}
}
