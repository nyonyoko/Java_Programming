// import the scanner
import java.util.Scanner;
// Sum elements column by column
public class Exercise1 {
    // test program that reads a 3 by 4 matrix and displays the sum of each column
    public static void main(String[] args) {
        // create a Scanner
        Scanner sc = new Scanner(System.in);
        // create an empty 3-4 matrix
        double[][] matrix = new double[3][4];
        // prompt the user to enter a 3 by 4 matrix
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        // put the user's input into the matrix one by one
        // the first for loop is for the rows
        // the second for loop is for the columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        // display the sum of each column
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at Column " + i + " is " + sumColumn(matrix, i));
        }
        sc.close();
    }
    // method that returns the sum of all the elements in a specified column in a matrix
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
