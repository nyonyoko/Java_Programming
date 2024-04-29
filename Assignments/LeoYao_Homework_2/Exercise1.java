import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a second number: ");
        int second  = sc2.nextInt();
        int sum = first + second;
        int subtraction = first - second;
        double division = first / second;
        int multiplication = first * second;
        int remainder = first % second;
        System.out.println("Sum of the two numbers is: " + sum);
        System.out.println("Subtraction of the two numbers is: " + subtraction);
        System.out.println("Division of the two numbers is: " + division);
        System.out.println("Multiplication of the two numbers is: " + multiplication);
        System.out.println("Remainder of the two numbers is: " + remainder);
        sc1.close();
        sc2.close();
    }
}