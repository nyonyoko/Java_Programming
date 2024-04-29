import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args){
        // ask the user for the integer and the power
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("What power do you want " + num + " to be raised to? ");
        int power = sc2.nextInt();
        String line = String.valueOf(num);
        int answer = 1;
        for (int i = 0; i < power; i++) {
            // create the string variable that displays the equation
            if (i < power-1) {
                line += " x ";
                line += String.valueOf(num);
            }
            // calculate the power
            answer *= num;
        }
        // print the result
        System.out.println(line + " = " + answer);
        sc1.close();
        sc2.close();
    }
}