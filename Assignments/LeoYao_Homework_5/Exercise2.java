// import the Scanner class
import java.util.Scanner;
public class Exercise2 {
    // main method
    public static void main(String[] args){
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        // create an array that contains 1 to 100 as its elements as integers
        int[] arr = new int[100];
        while (true) {
            // prompt the user to enter integers between 1 and 100
            System.out.print("Enter an integer between 1 and 100: ");
            int num = sc.nextInt();
            // if the user enters 0, exit the loop
            if (num == 0) {
                break;
            }
            // count the occurrences of each integer and store it in the array
            arr[num - 1]++;
        }
        // display the occurrences of each integer entered
        for (int i = 0; i < 100; i++) {
            // if the element is not 0, display the number and its occurrences
            if (arr[i] != 0) {
                int n = i + 1;
                String result = Integer.toString(n)+" occurs "+Integer.toString(arr[i])+" time";
                String s = "s";
                if (arr[i] > 1) {
                    result += s;
                }
                // display the result
                System.out.println(result);
            }
        }
        // close the scanner object
        sc.close();
    }
}
