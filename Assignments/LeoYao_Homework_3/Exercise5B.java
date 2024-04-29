import java.util.Scanner;
public class Exercise5B {
    public static void main(String[] args) {
        // ask the user for the number
        Scanner input = new Scanner(System.in);
        System.out.print("What number do you want to convert? ");
        int numb = input.nextInt();
        int numb1 = numb;
        int remainder;
        // create a string to store the binary number
        String binary = "";
        // generating the binary number
        do{
            remainder = numb % 2;
            numb /= 2;
            binary = String.valueOf(remainder) + binary;
            
        } while (numb != 1);
        binary = String.valueOf(numb) + binary;
        // print the binary number
        System.out.println(numb1 + " in binary is " + binary);
        input.close();
    }
}
