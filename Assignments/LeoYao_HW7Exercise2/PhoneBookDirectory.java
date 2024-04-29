import java.util.Scanner;
public class PhoneBookDirectory {
    private PhoneBookEntry[] dir;
    // constructor
    public PhoneBookDirectory() {
        this.dir = new PhoneBookEntry[6];
    }
    // add an entry to the phonebook in the first empty space in the array
    // returns 1 if successfully added or 0 otherwise (in case array is full)
    public int addEntry(PhoneBookEntry entry) {
        for (int i = 0; i < this.dir.length; i++) {
            if (this.dir[i] == null) {
                this.dir[i] = entry;
                return 1;
            }
        }
        return 0;
    }

    // print all phonebook entries
    public void printAllEntries() {
        for (PhoneBookEntry entry : this.dir) {
            if (entry != null) {
                entry.printBookEntry();
            }
        }
    }

    // linear search by phone number
    // returns 1 of the entry if found or 0 if not
    public int linearSearchByPhoneNumber(int phoneNumber) {
        for (PhoneBookEntry entry : this.dir) {
            if (entry != null && entry.getPhoneNumber() == phoneNumber) {
                entry.printBookEntry();
                return 1;
            }
        }
        return 0;
    }

    // binary search by id
    // returns the entry if found or an empty entry if not
    public PhoneBookEntry binarySearchById(int id) {
        selectionSortById();
        int low = 0;
        int high = this.dir.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (this.dir[mid] == null) {
                return new PhoneBookEntry();
            }
            if (this.dir[mid].getId() == id) {
                return this.dir[mid];
            } else if (this.dir[mid].getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new PhoneBookEntry();
    }

    // selection sort by id
    public void selectionSortById() {
        for (int i = 0; i < this.dir.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < this.dir.length; j++) {
                if (this.dir[j] != null && this.dir[j].getId() < this.dir[min].getId()) {
                    min = j;
                }
            }
            if (min != i) {
                PhoneBookEntry temp = this.dir[i];
                this.dir[i] = this.dir[min];
                this.dir[min] = temp;
            }
        }
    }

    // edit an entry by first name and last name
    // returns 1 if found and edited or 0 if the names are not found
    public int edit(String firstName, String lastName) {
        Scanner sc = new Scanner(System.in);
        for (PhoneBookEntry entry : this.dir) {
            if (entry != null && entry.getFirstName().equals(firstName) && entry.getLastName().equals(lastName)) {
                while (true) {    
                    // allow the user to choose to edit any data field of this entry
                    System.out.println("What would you like to edit?");
                    System.out.println("1. ID");
                    System.out.println("2. First Name");
                    System.out.println("3. Last Name");
                    System.out.println("4. Email");
                    System.out.println("5. Zip Code");
                    System.out.println("6. Phone Number");
                    System.out.println("7. Exit");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter new ID: ");
                            entry.setId(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter new first name: ");
                            entry.setFirstName(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("Enter new last name: ");
                            entry.setLastName(sc.nextLine());
                            break;
                        case 4:
                            System.out.println("Enter new email: ");
                            entry.setEmail(sc.nextLine());
                            break;
                        case 5:
                            System.out.println("Enter new zip code: ");
                            entry.setZipCode(sc.nextInt());
                            break;
                        case 6:
                            System.out.println("Enter new phone number: ");
                            entry.setPhoneNumber(sc.nextInt());
                            break;
                        case 7:
                            sc.close();
                            return 1;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                }
            }
        }
        sc.close();
        return 0;
    }

    // delete an entry by id
    // returns 1 if found and deleted or 0 if not
    public int delete(int id) {
        for (int i = 0; i < this.dir.length; i++) {
            if (this.dir[i] != null && this.dir[i].getId() == id) {
                this.dir[i] = new PhoneBookEntry();
                return 1;
            }
        }
        return 0;
    }
}
