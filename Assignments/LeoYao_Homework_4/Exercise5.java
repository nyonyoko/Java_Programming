import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        // ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        // decide if the second number is a multiple of the first number
        boolean answer = isMultiple(num1, num2);
        // display the result
        System.out.println("The result is " + answer);
        sc.close();
    }

    // decide if the second number is a multiple of the first number
    // the parameters are the first number and the second number
    // return true if it is a multiple
    // return false if it is not a multiple
    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0;
    }
}