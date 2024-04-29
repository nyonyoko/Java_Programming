import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask the user for the word
        System.out.print("Enter the word: ");
        String input = sc.nextLine();
        // remove the spaces
        String word = input.replaceAll("\\s", "");
        // decide if the word is a palindrome
        boolean answer = isPalindrome(word);
        // display the result
        if (answer) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        sc.close();
    }

    // accepts the user's input
    // and validate if it is a palindrome
    // the parameter is the user's input
    // return true if it is a palindrome
    // return false if it is not a palindrome
    public static boolean isPalindrome(String str) {
        // reverse the string
        String reverse = "";
        for (int i = 1; i <= str.length() ; i++){
            reverse += str.charAt(str.length()-i);
        }
        // compare the string and the reverse
        // ignore case
        return str.equalsIgnoreCase(reverse);
    }
}
