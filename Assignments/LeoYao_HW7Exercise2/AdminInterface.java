// Interface for PhoneBookAdmin methods
interface AdminInterface {
    int addEntry(PhoneBookEntry entry);
    int edit(String firstName, String lastName);
    int delete(int id);
    void selectionSortById();
    int linearSearchByPhoneNumber(int PhoneNumber);
    PhoneBookEntry binarySearchById(int id);
    void PrintUserInfo();
    void changePassword(String newPassword);
    void changeUsername(String newUsername);
}