
public class LazyBoy extends Student {
	Student bestFriend; 
	String storedNote; 
	
	public LazyBoy() {
		super("Sleepy Gary", 3.0);
		this.bestFriend = null;
		this.storedNote = "";
	}
	
	public LazyBoy(String name, double gpa) {
		super(name, gpa);
		this.bestFriend = null; 
		this.storedNote = " ";
	}
	
	public void getMessage(String message) {
		this.storedNote = message; 
	}
	
	/**
	 * passes the storedNote string to a TroubleMaker 
	 * @throws Exception does not handle any Exceptions, passes it back up to GoodProgrammer
	 */
	public void quickPass() throws Exception{
		
		// Need to call a method that is going to throw an exception.
		if (this.bestFriend instanceof TroubleMaker) {
			((TroubleMaker)this.bestFriend).makeDistraction(this.storedNote);
		}
		
	}
	
	public void setBFF(Student input) {
		this.bestFriend = input; 
	}

	@Override
	public String toString() {
		String output = "My Name is " +this.getName() + "and my GPA is " +this.getGpa();
		return output; 
	}
}
