import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {
        int ranNum = new Random().nextInt(10) + 1; 
        System.out.println("A random number between 1 and 10: " + ranNum);
    }
}