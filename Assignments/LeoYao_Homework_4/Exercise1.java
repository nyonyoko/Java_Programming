import java.util.Scanner;
public class Exercise1 {
    // declare the static variables
    static double balance = 0.00;
    static boolean exit = false;
    static Scanner sc = new Scanner(System.in);
    
    // the static main method
    public static void main(String[] args){
        // keep displaying the menu until the user chooses to exit
        do {
            int choice = displayMenu();
            execution(choice);
            System.out.println();
        } while (exit == false);
        sc.close();
    }

    // display the menu and ask the user for input
    // return the user's choice as an integer
    public static int displayMenu() {
        System.out.println("1. View Your Balance");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Withdraw Cash");
        System.out.println("4. Exit");
        System.out.println();
        // ask the user for input
        System.out.print("Enter your selection: ");
        return sc.nextInt();
    }

    // execute the user's choice
    // the parameter is the user's choice
    public static void execution(int choice) {
        switch (choice) {
            case 1:
                viewBalance(balance);
                break;
            case 2:
                balance = deposit();
                break;
            case 3:
                balance = withdraw();
                break;
            case 4:
                exit = true;
                System.out.println();
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    // display the balance with 2 decimal places
    // the parameter is the balance
    public static void viewBalance(double balance) {
        System.out.println();
        String formattedBalance = String.format("%.2f", balance);
        System.out.println("Your current balance is " + formattedBalance);
    }

    // deposit the amount
    // returns the new balance as a double
    public static double deposit() {
        System.out.println();
        System.out.print("Enter the amount you want to deposit: ");
        double amount = sc.nextDouble();
        // check if the amount is negative
        if (amount < 0) {
            System.out.print("You cannot deposit a negative amount.");
        
        } else {
            // if the amount is positive, add it to the balance
            balance += amount;
        }
        return balance;
    }

    // withdraw the amount
    // returns the new balance as a double
    public static double withdraw() {
        System.out.println();
        System.out.print("Enter the amount you want to withdraw: ");
        double amount = sc.nextDouble();
        // check if the amount the user wants to withdraw
        // is larger than the balance
        if (amount > balance) {
            System.out.println("Sorry you don't have enough balance!");
        } else {
            // if the amount is smaller than the balance,
            // subtract it from the balance
            balance -= amount;
        }
        return balance;
    }
}