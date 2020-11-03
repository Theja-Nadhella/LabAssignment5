package validatingAge;
public class AgeException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public AgeException() { //constructor class
		super("Invalid - Entered Age is below 15 years.");
	}
}
