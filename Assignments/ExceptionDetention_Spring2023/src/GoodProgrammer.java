import java.io.IOException;
import java.net.URI;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class GoodProgrammer extends Student {
	private String secretMessage; 
	
	
	public GoodProgrammer() {
		super("YOU", 4.0);
	}
	
	public GoodProgrammer(String name, double gpa) {
		super(name, gpa);
		this.secretMessage = "";
	}
	
	public String getSecretMessage() {
		return secretMessage;
	}

	public void setSecretMessage(String secretMessage) {
		this.secretMessage = secretMessage;
	}
	
	/**
	 * passes a message from GoodProgrammer to a Student 
	 * @param message String message to be passed to the back of Detention 
	 * @param target Student immediately next to you. 
	 */
	public void passNote(String message, Student target) {
		if (target instanceof LazyBoy) {
			((LazyBoy)target).getMessage(message);
			try {				
				((LazyBoy)target).quickPass();				
			} catch (ArithmeticException e) {
				System.out.println(e);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			} catch (IOException e) {
				System.err.println(e.getLocalizedMessage());
			} catch (MandalorianException e) {	
				this.easterEgg(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println(e.getMessage());
			} catch (NoSuchElementException e) {
				System.err.println(e.getMessage());
			} catch (IllegalStateException e) {
				System.err.println(e.getMessage());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			} 
		}
	}
	
	/**
	 * returns a string representation of this object. 
	 */
	@Override
	public String toString() {
		String output = "I am a Good Programmer! My name is " +this.getName() + " with a GPA of " +this.getGpa();
		return output;
	}
	
		
	/**
	 * unlocks the CS101 Final Exam Answer Key 
	 * Figure out how to properly call this method and its rewards are yours. 
	 * @param yolk  exam key password. 
	 */
	private void easterEgg(String yolk) {
		System.out.println("Easter Egg mode activated.");
		try {
			URI uri = new URI(yolk);
			java.awt.Desktop.getDesktop().browse(uri); 
		} catch(Exception easterEgg) {
			System.err.println("Hidden error dectected.");
			System.exit(1);
		}
	}
}
