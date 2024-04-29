// import the Scanner class
import java.util.Scanner;
public class Exercise4 {
    // main method
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter the size of the array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        // create an array of integers
        int[] arr = new int[size];
        // prompt the user to enter the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = sc.nextInt();
        }
        // display whether the array is sorted or not
        if (isSorted(arr)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
        // close the scanner object
        sc.close();
    }

    // method that takes an array of integers as a parameter
    // and returns true if the array is sorted in increasing order
    // and returns false if the array is not sorted in increasing order
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
