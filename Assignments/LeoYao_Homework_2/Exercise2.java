import java.util.Scanner;
public class Exercise2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the number of kilometers? ");
        double km = sc.nextDouble();
        double mi = 0.6214 * km;
        System.out.println("The number of miles is: " + mi);
        sc.close();
    }
}