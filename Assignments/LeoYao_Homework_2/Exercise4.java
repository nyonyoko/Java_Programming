import java.util.Scanner;
public class Exercise4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the temperature in Fahrenheit? ");
        double tempF = sc.nextDouble();
        double tempC = 5.0/9.0 * (tempF - 32);
        String formattedTemp = String.format("%.1f", tempC);
        System.out.println("The temperature is " + formattedTemp + " degree celsius.");
        sc.close();
    }
}