import java.util.Scanner;
public class Exercise3 {
    public static void main (String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter desired grade: ");
        Character desGrade = sc1.next().charAt(0);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter minimum average required: ");
        double minAvgReq = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter current average in course: ");
        double curAvg = sc3.nextDouble();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the final percentage on course grade: ");
        double finPerc = sc3.nextInt();

        double scoreNeeded = (minAvgReq-(curAvg*(1-finPerc/100)))/(finPerc/100);
        String formattedScore = String.format("%.2f", scoreNeeded);

        System.out.println("You need a score of " + formattedScore + " on the final to get " + desGrade);

        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();
    }
}