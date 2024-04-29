// import the Scanner class
import java.util.Scanner;
public class Exercise1 {
    // main method
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        // create an array of 10 integers
        int[] arr = new int[10];
        // prompt the user to enter 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = sc.nextInt();
        }
        // display the integers in the reversed order
        System.out.print("Reversed order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        // close the scanner object
        sc.close();
    }    
}
