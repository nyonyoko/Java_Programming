import java.lang.Math;
public class Exercise6 {
    // the static main method
    public static void main(String[] args) {
        // generate a random letter
        char letter = randomLetter();
        // display the result
        System.out.println("The random letter is " + letter);
    }

    // generate a random letter
    // return the random letter as a character
    public static char randomLetter() {
        return (char) (Math.random() * 26 + 'a');
    }
}
