public class NarcissisticNumber {

    public static void main(String[] args) {

        /**
         * Task: Narcissistic Number Check (Armstrong Number)
         *
         * Description:
         * A Narcissistic number is a number that is the sum of its own digits
         * each raised to the power of the number of digits.
         * Example: 153 = 1^3 + 5^3 + 3^3
         *
         * @author Daniel Rzymański
         */

        // 1. Input data
        int candidateNumber = 153;

        // 2. Variables for calculation
        int tempNumber = candidateNumber;
        int sumOfPowers = 0;
        int numberOfDigits = 0;

        // --- Step 1: Count digits ---
        // We use a temporary variable so we don't destroy the original 'candidateNumber'
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            numberOfDigits++;
        }

        // --- Step 2: Calculate sum of powers ---
        tempNumber = candidateNumber; // Reset temp variable back to original value

        while (tempNumber != 0) {
            int currentDigit = tempNumber % 10; // Extract last digit

            // Math.pow returns double, so we cast to int
            sumOfPowers += (int) Math.pow(currentDigit, numberOfDigits);

            tempNumber = tempNumber / 10; // Remove last digit
        }

        // --- Step 3: Validate and Print ---
        System.out.println("Candidate: " + candidateNumber);
        System.out.println("Calculated Sum: " + sumOfPowers);

        if (candidateNumber == sumOfPowers) {
            System.out.println("Result: YES! " + candidateNumber + " is an Armstrong number.");
        } else {
            System.out.println("Result: NO. " + candidateNumber + " is NOT an Armstrong number.");
        }
    }
}