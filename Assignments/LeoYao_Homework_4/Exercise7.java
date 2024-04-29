import java.lang.Math;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ask the user for the minimum value
        System.out.print("Enter the minimum value: ");
        double min = sc.nextDouble();
        // ask the user for the maximum value
        System.out.print("Enter the maximum value: ");
        double max = sc.nextDouble();
        // generate a random number within the range
        double random = randomWithinRange(min, max);
        // display the result
        System.out.println("The random number is " + random);
        sc.close();
    }

    // generate a random number within a range
    // the parameters are the minimum and maximum values
    // return the random number as a double
    public static double randomWithinRange(double min, double max) {
        return Math.random() * (max - min) + min;
    }
}
