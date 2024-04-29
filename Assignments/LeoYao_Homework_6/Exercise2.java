// import the scanner
import java.util.Scanner;
public class Exercise2 {
    // Sum of the major diagonal in a matrix
    public static void main(String[] args) {
        // create a Scanner
        Scanner sc = new Scanner(System.in);
        // create an empty 4-4 matrix
        double[][] matrix = new double[4][4];
        // prompt the user to enter a 4 by 4 matrix
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        // put the user's input into the matrix one by one
        // the first for loop is for the rows
        // the second for loop is for the columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        // display the sum of the major diagonal
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
        sc.close();
    }
    
    // method that returns the sum of the major diagonal in a matrix
    public static double sumMajorDiagonal(double [][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
