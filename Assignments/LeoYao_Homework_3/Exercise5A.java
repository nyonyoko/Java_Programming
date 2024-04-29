import java.lang.Math;
import java.util.Scanner;

public class Exercise5A {
    public static void main(String[] args) {
        // ask the user for the number
        Scanner input = new Scanner(System.in);
        System.out.print("What number do you want to convert? ");
        int numb = input.nextInt();
        // print the binary number
        System.out.println(numb + " in binary is " + Integer.toBinaryString(numb));
        input.close();
    }
}
