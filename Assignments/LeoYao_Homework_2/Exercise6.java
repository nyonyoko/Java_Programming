import java.util.Scanner;
import java.lang.Math;

public class Exercise6 {
    public static void main (String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = sc1.nextDouble();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a second number: ");
        double num2 = sc2.nextDouble();

        System.out.println("The maximum of the two numbers is: " + Math.max(num1,num2));

        sc1.close();
        sc2.close();
    }
}