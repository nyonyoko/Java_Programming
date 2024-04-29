import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class TroubleMaker extends Student{

	public TroubleMaker() {
		super("Jackie Daytona", 1.0);
	
	}
	
	public TroubleMaker(String name, double gpa) {
		super(name,gpa);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String output = "TroubleMaker: " +this.getName() + " GPA: " +this.getGpa();
		return output;
	}
	
	/**
	 * takes in a String message and generates a corresponding Exception 
	 * @param message String to be processed 
	 * @throws Exception object thrown depending on the message received. 
	 */
	public void makeDistraction(String message) throws Exception{

		if (message.equalsIgnoreCase("Alpha")) {
			throw new ArithmeticException("Discrete Math is math, but more secretive");
		}
		if (message.equalsIgnoreCase("This is the way.")) {
			throw new MandalorianException("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
		}
		if (message.equalsIgnoreCase("wait, what?")) {
			throw new NoSuchElementException("We need more Unobtanium!");
		}
		if (message.equalsIgnoreCase("I think, therefore I am.")) {
			throw new InputMismatchException("What do you mean?");
		}
		if (message.equalsIgnoreCase("I love you.")) {
			throw new IllegalStateException("Invalid call!");
		}
		if (message.equalsIgnoreCase("quit")) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
