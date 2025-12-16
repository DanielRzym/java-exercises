import java.util.Random; // Import needed for random numbers

public class NumberUtils {

    /**
     * Task I: Demonstration of control flow.
     * 1. Check if a generated integer is even or odd.
     *
     * @author Daniel Rzymański
     */
    public static void main(String[] args) {

        // --- 1. First task: Even or Odd check ---

        Random random = new Random();
        // Generates a number from 0 to 99.
        int candidateNumber = random.nextInt(100);

        System.out.println("Candidate number is: " + candidateNumber);

        // Check parity using modulo operator
        if (candidateNumber % 2 == 0) {
            System.out.println("Result: The number is EVEN.");
        } else {
            System.out.println("Result: The number is ODD.");
        }
    }
}