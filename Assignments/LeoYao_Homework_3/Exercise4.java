import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the second string: ");
        String second = sc2.nextLine();
        // counter for index
        int i = 0;
        // string to store common prefix
        String prefix = "";
        // test if the character is the same one by one
        while (i < first.length() && i < second.length()) {
            if (first.charAt(i)==second.charAt(i)){
                prefix += first.charAt(i);
                i += 1;
            } else {
                break;
            }
        }
        // no common prefix
        if (i == 0) {
            System.out.println(first + " and " + second + " have no common prefix");
        } else {
            // print the common prefix
            System.out.println("The common prefix is " + prefix);
        }
        sc1.close();
        sc2.close();
    }
}
