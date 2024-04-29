import java.util.Scanner;
public class Exercise2 {
    // the static main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        // ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        // calculate the last digit of the sum of the two numbers
        int answer = lastDigit(sum(num1, num2));
        // display the result
        System.out.println("The last digit of the sum is " + answer);
        sc.close();
    }

    // calculate the sum of the two numbers
    // the parameters are the two numbers
    // return the sum as an integer
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // calculate the last digit of the number
    // the parameter is the number
    // return the last digit as an integer
    public static int lastDigit(int num) {
        return num % 10;
    }
}
