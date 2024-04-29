public class Exercise3 {
    public static void main(String[] args) {
        // create the string variable to store the characters
        String line = "";
        for (int i = 65; i <= 126; i++) {
            line += (char)i;
            line += " ";
            // 5 characters per line
            if ((i-64)%5==0) {
                System.out.println(line);
                line = "";
            }
        }
    }
}
