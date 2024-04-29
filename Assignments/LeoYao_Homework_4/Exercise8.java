import java.util.Scanner;
public class Exercise8 {
    // the static main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ask the user for the number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // reverse the number
        String reverse = reverseNum(num);
        System.out.println("The reverse of the number is " + reverse);
        sc.close();
    }

    // reverse the number
    // the parameter is the number
    // return the reverse of the number as a string
    public static String reverseNum(int num){
        String str = Integer.toString(num);
        String reverse = "";
        // reverse the string by adding the last character to the front
        for (int i = 1; i <= str.length() ; i++){
            reverse += str.charAt(str.length()-i);
        }
        return reverse;
    }
}
