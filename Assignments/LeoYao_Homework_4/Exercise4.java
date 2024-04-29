import java.util.Scanner;
public class Exercise4 {
    // the static main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ask the user for the number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int answer = evenOrOdd(num);
        System.out.println("The result is " + answer);
        sc.close();
    }

    // decide if the number is even or odd
    // the parameter is the number
    // if it's even, return 1 as an integer
    // if it's odd, return 0 as an integer
    public static int evenOrOdd(int num) {
        return (num + 1) % 2 ;
    }
}
