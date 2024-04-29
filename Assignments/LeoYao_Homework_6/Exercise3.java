// import the scanner
import java.util.Scanner;
// Guess the Capitals
public class Exercise3 {
    // test program that repeatedly prompts the user to enter a capital for a state
    public static void main(String[] args) {
        // create a Scanner
        Scanner sc = new Scanner(System.in);
        // create an empty 50-2 matrix
        String[][] keys = keys();
        for (int i = 0; i < keys.length; i++) {
            // prompt the user to enter the capital of a state
            System.out.println("What is the capital of " + keys[i][0] + "?");
            String capital = sc.nextLine();
            // check if the user's answer is correct
            // and display the result
            if (capital.equalsIgnoreCase(keys[i][1])) {
                System.out.println("Your answer is correct.");
            } else {
                System.out.println();
                System.out.println("The correct answer should be " + keys[i][1]);
            }
            System.out.println();
        }
        // close the scanner
        sc.close();       
    }

    // method that returns a 50-2 matrix containing the states and their capitals
    public static String[][] keys(){
        // create an empty 50-2 matrix
        String[][] keys = new String[50][2];
        // put the states and their capitals into the matrix
        keys[0] = new String[]{"Alabama", "Montgomery"};
        keys[1] = new String[]{"Alaska", "Juneau"};
        keys[2] = new String[]{"Arizona", "Phoenix"};
        keys[3] = new String[]{"Arkansas", "Little Rock"};
        keys[4] = new String[]{"California", "Sacramento"};
        keys[5] = new String[]{"Colorado", "Denver"};
        keys[6] = new String[]{"Connecticut", "Hartford"};
        keys[7] = new String[]{"Delaware", "Dover"};
        keys[8] = new String[]{"Florida", "Tallahassee"};
        keys[9] = new String[]{"Georgia", "Atlanta"};
        keys[10] = new String[]{"Hawaii", "Honolulu"};
        keys[11] = new String[]{"Idaho", "Boise"};
        keys[12] = new String[]{"Illinois", "Springfield"};
        keys[13] = new String[]{"Indiana", "Indianapolis"};
        keys[14] = new String[]{"Iowa", "Des Moines"};
        keys[15] = new String[]{"Kansas", "Topeka"};
        keys[16] = new String[]{"Kentucky", "Frankfort"};
        keys[17] = new String[]{"Louisiana", "Baton Rouge"};
        keys[18] = new String[]{"Maine", "Augusta"};
        keys[19] = new String[]{"Maryland", "Annapolis"};
        keys[20] = new String[]{"Massachusetts", "Boston"};
        keys[21] = new String[]{"Michigan", "Lansing"};
        keys[22] = new String[]{"Minnesota", "Saint Paul"};
        keys[23] = new String[]{"Mississippi", "Jackson"};
        keys[24] = new String[]{"Missouri", "Jefferson City"};
        keys[25] = new String[]{"Montana", "Helena"};
        keys[26] = new String[]{"Nebraska", "Lincoln"};
        keys[27] = new String[]{"Nevada", "Carson City"};
        keys[28] = new String[]{"New Hampshire", "Concord"};
        keys[29] = new String[]{"New Jersey", "Trenton"};
        keys[30] = new String[]{"New Mexico", "Santa Fe"};
        keys[31] = new String[]{"New York", "Albany"};
        keys[32] = new String[]{"North Carolina", "Raleigh"};
        keys[33] = new String[]{"North Dakota", "Bismarck"};
        keys[34] = new String[]{"Ohio", "Columbus"};
        keys[35] = new String[]{"Oklahoma", "Oklahoma City"};
        keys[36] = new String[]{"Oregon", "Salem"};
        keys[37] = new String[]{"Pennsylvania", "Harrisburg"};
        keys[38] = new String[]{"Rhode Island", "Providence"};
        keys[39] = new String[]{"South Carolina", "Columbia"};
        keys[40] = new String[]{"South Dakota", "Pierre"};
        keys[41] = new String[]{"Tennessee", "Nashville"};
        keys[42] = new String[]{"Texas", "Austin"};
        keys[43] = new String[]{"Utah", "Salt Lake City"};
        keys[44] = new String[]{"Vermont", "Montpelier"};
        keys[45] = new String[]{"Virginia", "Richmond"};
        keys[46] = new String[]{"Washington", "Olympia"};
        keys[47] = new String[]{"West Virginia", "Charleston"};
        keys[48] = new String[]{"Wisconsin", "Madison"};
        keys[49] = new String[]{"Wyoming", "Cheyenne"};
        // return the matrix
        return keys;
    }
}
