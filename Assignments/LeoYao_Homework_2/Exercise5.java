import java.util.Scanner;
public class Exercise5 {
    public static void main (String[] args) {
        String check = "NYU1256";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String input = sc.nextLine();
        if (check.equals(input)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
        sc.close();
    }
}