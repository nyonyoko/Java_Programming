import java.util.Scanner;

public class Detention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create 3 Students 
		Student lazy = new LazyBoy("Sleepy Gary",3.0);
		Student me = new GoodProgrammer("Chris", 4.0);
		Student jackie = new TroubleMaker("Jackie Daytona", 1.0);
		boolean running = true; 
		
		((LazyBoy)lazy).setBFF(jackie);
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Exception Detention!");
		do {
			System.out.println("Psst! What's your message?");
			String message = sc.nextLine();
			((GoodProgrammer)me).passNote(message, lazy);
			
		} while (running);
		sc.close();
	}

}
