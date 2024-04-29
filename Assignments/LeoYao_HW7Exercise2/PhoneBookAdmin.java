// PhoneBookAdmin class with implementation of AdminInterface
public class PhoneBookAdmin extends User implements AdminInterface  {
    private String email;
    private PhoneBookDirectory phoneBookDirectory;

    // Constructor
    public PhoneBookAdmin(String username, String password, String email, PhoneBookDirectory phoneBookDirectory) {
        super(username, password);
        this.email = email;
        this.phoneBookDirectory = phoneBookDirectory;
    }

    // Getters and setters for email and phoneBookDirectory
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PhoneBookDirectory getPhoneBookDirectory() {
        return phoneBookDirectory;
    }

    public void setPhoneBookDirectory(PhoneBookDirectory phoneBookDirectory) {
        this.phoneBookDirectory = phoneBookDirectory;
    }

    // Implementing methods from AdminInterface
    @Override
    public int addEntry(PhoneBookEntry entry) {
        return phoneBookDirectory.addEntry(entry);
    }

    @Override
    public int edit(String firstName, String lastName) {
        return phoneBookDirectory.edit(firstName, lastName);
    }

    @Override
    public int delete(int id) {
        return phoneBookDirectory.delete(id);
    }
    
    @Override
    public void selectionSortById() {
        phoneBookDirectory.selectionSortById();
    }

    @Override
    public int linearSearchByPhoneNumber(int PhoneNumber) {
        return phoneBookDirectory.linearSearchByPhoneNumber(PhoneNumber);
    }

    @Override
    public PhoneBookEntry binarySearchById(int id) {
        return phoneBookDirectory.binarySearchById(id);
    }

    @Override
    public void PrintUserInfo() {
        super.PrintUserInfo();
        System.out.println("Email: " + email);
        phoneBookDirectory.printAllEntries();
    }

    // change password and username methods
    @Override
    public void changePassword(String newPassword) {
        super.setPassword(newPassword);
    }

    @Override
    public void changeUsername(String newUsername) {
        super.setUsername(newUsername);
    }
}
