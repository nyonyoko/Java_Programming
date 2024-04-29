// import the Scanner class
import java.util.Scanner;
public class Exercise3 {
    // main method
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        // create an array of 10 doubles
        double[] arr = new double[10];
        // prompt the user to enter 10 doubles
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a double: ");
            arr[i] = sc.nextDouble();
        }
        // display the average value
        System.out.println("The average value is " + average(arr));
        // close the scanner object
        sc.close();

    }

    // method that takes an array of integers as a parameter
    // and returns the average value of an array of integers
    public static int average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    // method that takes an array of doubles as a parameter
    // and returns the average value of an array of doubles
    public static double average (double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
