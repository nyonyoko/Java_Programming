// Interface for NormalUser methods
interface NormalUserInterface {
    int addEntry(PhoneBookEntry entry);
    int edit(String firstName, String lastName);
    void selectionSortById();
    int linearSearchByPhoneNumber(int PhoneNumber);
    void PrintUserInfo();
}
