// NormalUser class with implementation of NormalUserInterface
class NormalUser extends User implements NormalUserInterface {
    private int id;
    private PhoneBookDirectory phoneBookDirectory;

    // Constructor
    public NormalUser(int id, String username, String password, PhoneBookDirectory phoneBookDirectory) {
        super(username, password);
        this.id = id;
        this.phoneBookDirectory = phoneBookDirectory;
    }
    
    // Getters and setters for id and phoneBookDirectory
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PhoneBookDirectory getPhoneBookDirectory() {
        return phoneBookDirectory;
    }

    public void setPhoneBookDirectory(PhoneBookDirectory phoneBookDirectory) {
        this.phoneBookDirectory = phoneBookDirectory;
    }

    // Implementing methods from NormalUserInterface
    @Override
    public int addEntry(PhoneBookEntry entry) {
        return phoneBookDirectory.addEntry(entry);
    }

    @Override
    public int edit(String firstName, String lastName) {
        return phoneBookDirectory.edit(firstName, lastName);
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
    public void PrintUserInfo() {
        System.out.println("ID: " + id);
        super.PrintUserInfo();
        phoneBookDirectory.printAllEntries();
    }
}
