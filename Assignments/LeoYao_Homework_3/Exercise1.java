import java.util.Scanner;
public class Exercise1 {
    // to prevent closing Scanner and input source
    static Scanner menu, deposit, withdraw;
    public static void main(String[] args) {
        // declaring variables
        double amount, balance = 0.00;
        boolean exit = false;
        int choice;
        String formattedBalance;

        // main menu
        do {
            // display the menu
            System.out.println("1. View Your Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");
            menu = new Scanner(System.in);
            System.out.println();
            // ask the user for input
            System.out.print("Enter your selection: ");
            choice = menu.nextInt();
            System.out.println();
            // execute the corresponding option
            switch (choice) {
                // view balance
                case 1:
                    // format to keeep two decimals
                    formattedBalance = String.format("%.2f", balance);
                    System.out.println("Your current balance is " + formattedBalance);
                    break;
                // deposit
                case 2:
                    // ask the user for deposit amount
                    deposit = new Scanner(System.in);
                    System.out.print("Enter the amount you want to deposit: ");
                    amount = deposit.nextDouble();
                    if (amount < 0) {
                        System.out.print("You cannot deposit a negative amount.");
                    } else {
                        balance += amount;
                    }
                    break;
                // withdraw
                case 3:
                    // ask the user for withdraw amount
                    withdraw = new Scanner(System.in);
                    System.out.print("Enter the amount you want to withdraw: ");
                    amount = withdraw.nextDouble();
                    if (amount > balance) {
                        System.out.println("Sorry you don't have enough balance!");
                    } else {
                        balance -= amount;
                    }
                    break;
                // exit
                case 4:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                // invalid input
                default:
                    System.out.println("Invalid choice. Enter again.");
            }
            System.out.println();
        } while (exit == false);
    }
}
