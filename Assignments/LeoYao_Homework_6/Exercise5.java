// import the Date class
import java.util.Date;
public class Exercise5 {
    // test program that creates an Account object with an account ID of 1122, a balance of $20,000
    // and an annual interest of 4.5%
    public static void main(String[] args) {
        // create an Account object
        Account account = new Account(1122, 20000);
        // set the annual interest rate to 4.5%
        account.setAnnualInterestRate(0.045);
        // withdraw $2,500
        account.withdraw(2500);
        // deposit $3,000
        account.deposit(3000);
        // print the balance, the monthly interest, and the date
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly interest: $" + account.getMonthlyInterest());
        System.out.println("Date: " + account.getDateCreated());
    }
}

// create a class named Account
class Account {
    // private data fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    // default constructor
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    // constructor that creates an account with the specified id and initial balance
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    // accessor and mutator methods for id, balance, and annualInterestRate
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    // accessor method for dateCreated
    public Date getDateCreated() {
        return this.dateCreated;
    }
    // method that returns the monthly interest
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 12);
    }
    // method that withdraws a specified amount from the account
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    // method that deposits a specified amount to the account
    public void deposit(double amount) {
        this.balance += amount;
    }
}