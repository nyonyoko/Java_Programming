import java.io.*;
import java.util.*;
public class PhoneBookApplication {
    public static void main(String[] args) {
        // Create objects for PhoneBookAdmin and NormalUser
        PhoneBookAdmin admin = readAdminFromFile("admin.txt");
        NormalUser user = readUserFromFile("user.txt");

        // prompts the user to login
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Check if user is an admin or a normal user
        if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            // Display admin menu
            displayAdminMenu(admin);
        } else if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            // Display user menu
            displayUserMenu(user);
        } else {
            System.out.println("Wrong username or password.");
        }
        sc.close();
    }

    private static PhoneBookAdmin readAdminFromFile(String filename) {
        // read the file and create a PhoneBookAdmin object (separate by comma)
        try {
            Scanner scanner = new Scanner(new File(filename));
            String line = scanner.nextLine();
            StringTokenizer s = new StringTokenizer(line, ",");
            String username = s.nextToken();
            String password = s.nextToken();
            String email = s.nextToken();
            return new PhoneBookAdmin(username, password, email, new PhoneBookDirectory());
        // report the file not found error and terminate the program
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(1);
            return null;
        }
    }

    private static NormalUser readUserFromFile(String filename) {
        // read the file and create a NormalUser object (separate by comma)
        try {
            Scanner scanner = new Scanner(new File(filename));
            String line = scanner.nextLine();
            StringTokenizer s = new StringTokenizer(line, ",");
            int id = Integer.parseInt(s.nextToken());
            String username = s.nextToken();
            String password = s.nextToken();
            return new NormalUser(id, username, password, new PhoneBookDirectory());
        // report the file not found error and terminate the program
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(1);
            return null;
        }
    }

    private static void displayAdminMenu(PhoneBookAdmin admin) {
        System.out.println("1. Add a phone entry");
        System.out.println("2. Edit a phone entry by name");
        System.out.println("3. Delete a phone entry by name");
        System.out.println("4. Sort the PhoneBookDirectory");
        System.out.println("5. Linear Search");
        System.out.println("6. Binary Search");
        System.out.println("7. Print Admin's info");
        System.out.println("8. Change Password");
        System.out.println("9. Change Username");
    }

    private static void displayUserMenu(NormalUser user) {
        System.out.println("1. Add a phone entry");
        System.out.println("2. Edit a phone entry");
        System.out.println("3. Sort the PhoneBookDirectory");
        System.out.println("4. Linear Search");
        System.out.println("5. Print User's info");
    }
}
