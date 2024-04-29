import java.util.Scanner;
import java.lang.Math;
public class Exercise3 {
    // the static main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // ask the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        // calculate the area of the circle
        double area = area(radius);
        // display the result
        System.out.println("The area of the circle is " + area);
        sc.close();
    }

    // calculate the area of the circle
    // the parameter is the radius of the circle
    // return the area of the circle as a double
    public static double area(double radius){
        return Math.PI * radius * radius;
    }
}
