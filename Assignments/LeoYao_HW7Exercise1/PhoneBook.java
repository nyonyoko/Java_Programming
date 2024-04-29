import java.util.Scanner;
public class PhoneBook {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // add the three PhoneBookEntry objects
        PhoneBookEntry john = addEntry();
        PhoneBookEntry james = addEntry();
        PhoneBookEntry sarah = addEntry();
        // display them
        System.out.println();
        System.out.println("First object: ");
        john.printBookEntry();
        System.out.println("Second object: ");
        james.printBookEntry();
        System.out.println("Third object: ");
        sarah.printBookEntry();
        System.out.println();
        // change the information of the first object
        john.setPhoneNumber(202555555);
        // display the first object again after changing the phone number
        System.out.println("First object (after changing): ");
        john.printBookEntry();
        // change the zip code of the second object by the first's
        james.setZipCode(john.getZipCode());
        sc.close();
    }

    // this method is used to add a PhoneBookEntry
    public static PhoneBookEntry addEntry() {
        // prompts the user to enter the information of the phone book entry
        System.out.println("Enter the information of the phone book entry: ");
        // splits the input by comma
        String[] arr = sc.nextLine().split(",");
        // this means that the user has entered two values
        if (arr.length == 2){
            return new PhoneBookEntry(arr[0], Integer.valueOf(arr[1]));
        // this means that the user has entered six values
        } else if (arr.length == 6){
            return new PhoneBookEntry(Integer.valueOf(arr[0]), arr[1], arr[2], arr[3], Integer.valueOf(arr[4]), Integer.valueOf(arr[5]));
        // catches the case where the user has entered a number of cases other than two or six
        } else {
            // calls the default constructor
            PhoneBookEntry entry = new PhoneBookEntry();
            // this counts the number of int parameters used in the array
            int x = 0;
            // this counts the number of String parameters used in the array
            int y = 0;
            // this is used to test if the value at position [i] is convertable to int
            boolean convert = true;
            // this loop checks the elements in the array 
            // and sets the values respectively
            for (int i = 0; i < arr.length; i++){
                // this checks if the value at position [i] is convertable to int
                try {
                    Integer.valueOf(arr[i]);
                } catch (NumberFormatException e){
                    convert = false;
                }
                // this means that the value at position [i] is int
                if (convert){
                    // set id, zip code, and phone number respectively
                    if (x==0){
                        entry.setId(Integer.valueOf(arr[i]));
                    } else if (x==1){
                        entry.setZipCode(Integer.valueOf(arr[i]));
                    } else {
                        entry.setPhoneNumber(Integer.valueOf(arr[i]));
                        // return the entry since this is the last value to set
                        return entry;
                    }
                    // increment x to count for the next int value
                    x++;
                // this means that the value at position [i] is String
                // the logic is the same as above
                } else {
                    if (y==0){
                        entry.setFirstName(arr[i]);
                    } else if (y==1){
                        entry.setLastName(arr[i]);
                    } else {
                        entry.setEmail(arr[i]);
                    }
                    y++;
                }
            }
            // return the entry after setting all the values
            return entry;
        }
    }    
}