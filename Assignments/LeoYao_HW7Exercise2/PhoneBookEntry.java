public class PhoneBookEntry{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int zipCode;
    private int phoneNumber;

    // default constructor
    public PhoneBookEntry(){
        this.id = -1;
    }

    // constructor
    public PhoneBookEntry(String firstName, int phoneNumber){
        this.id = -1;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public PhoneBookEntry(int id, String firstName, String lastName, String email, int zipCode, int phoneNumber){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    // getters and setters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getZipCode(){
        return this.zipCode;
    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // print the information of a PhoneBookEntry
    public void printBookEntry(){
        if (this.id != -1){
            System.out.println("Id: " + this.id);
        }
        if (this.firstName != null){
            if (this.lastName != null){
                System.out.println("Name: " + this.firstName + " " + this.lastName);
            } else {
                System.out.println("Name: " + this.firstName);
            }
        }
        if (this.email != null){
            System.out.println("Email: " + this.email);
        }
        if (this.zipCode != 0){
            System.out.println("Zip Code: " + this.zipCode);
        }
        if (this.phoneNumber != 0){
            System.out.println("Phone Number: " + this.phoneNumber);
        }
    }
}

