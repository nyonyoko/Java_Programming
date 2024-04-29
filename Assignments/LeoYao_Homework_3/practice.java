public class practice {
    public static void main(String[] args) {
        // i++ example
        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
        }
        // Output: 0 1 2 3

        // ++i example
        for (int i = 0; i < 4; ++i) {
            System.out.print(i + " ");
        }
        // Output: 0 1 2 3

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
}
