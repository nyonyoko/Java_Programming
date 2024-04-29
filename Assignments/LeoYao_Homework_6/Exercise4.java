// import the scanner
import java.util.Scanner;
//  Stack Data Structure implemented as an Array
public class Exercise4 {
    // declare a variable for counting how many elements are in the stack
    // and a variable for the user's choice
    static int count, choice;
    // declare a scanner object
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // prompt the user to enter the size of the stack
        System.out.println("Enter the size of the stack:");
        int size = sc.nextInt();
        // declare a stack of characters of the size entered by the user
        Character[] stack = new Character[size];
        // prompt the user the menu for a choice
        while (choice != 4) {
            menu();
            switch (choice) {
                // push an element to the stack
                case 1:
                    push(stack, size);
                    break;
                // pop an element from the stack
                case 2:
                    pop(stack);
                    break;
                // display the elements in the stack
                case 3:
                    display(stack);
                    break;
                // exit the menu
                case 4:
                    System.out.println("Goodbye!");
                    break;
                // if the user enters an invalid choice, prompt them to try again
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }

    // method for displaying the menu
    public static void menu() {
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
    }

    // method for pushing an element to the stack
    public static void push(Character[] stack, int size) {
        if (count == size) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Enter the character to be pushed: ");
            char x = sc.next().charAt(0);
            stack[count] = x;
            count++;
        }
    }

    // method for popping an element from the stack
    public static void pop(Character[] stack) {
        if (count == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped character is: " + stack[count-1]);
            stack[count-1] = null;
            count--;
        }
    }

    // method for displaying the elements in the stack
    public static void display(Character[] stack) {
        if (count == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements in the stack are: ");
            for (int i = 0; i < count; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
