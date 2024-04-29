
public abstract class Student {
	// Mix of normal methods, and abstract methods
	private String name; 
	private double gpa; 
	
	public Student() {
		this.name = "";
		this.gpa = 0.0;
	}
	
	public Student(String name, double gpa ) {
		this.name = name;
		this.gpa = gpa; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/**
	 * returns a String representation of your object. 
	 */
	public abstract String toString();
	
}
