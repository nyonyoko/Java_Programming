import java.util.Scanner;
public class Exercise7 {
    public static void main (String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your first exam score: ");
        int score1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your second exam score: ");
        int score2 = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter your third exam score: ");
        int score3 = sc3.nextInt();

        double mean = (score1 + score2 + score3)/3.0;
        String formattedMean = String.format("%.2f", mean);
        System.out.println("The arithmetic mean of your grades for the first three exams is: " + formattedMean);
        
        sc1.close();
        sc2.close();
        sc3.close();
    }
}
