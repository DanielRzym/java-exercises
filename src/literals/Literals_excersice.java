public class LiteralsExercise { // Wrapped in a class for standard compatibility

    public static void main(String[] args) {

        /**
         * Task I: Demonstration of basic Java literals.
         * @author Daniel Rzymański
         */

        // --- 1. Boolean Literals ---
        System.out.println("--- Boolean Literals ---");
        System.out.println(true + "\n" + false);

        // --- 2. Integer Literals ---
        // Showing 127 in different formats
        System.out.println("\n--- Integer Literals ---");
        byte example = 127;
        System.out.println("Decimal: " + example);
        System.out.println("Octal: 0_177 = " + 0_177);      // Prefix 0
        System.out.println("Hexadecimal: 0x7F = " + 0x7F);  // Prefix 0x
        System.out.println("Binary: 0b1111111 = " + 0b1111111); // Prefix 0b

        // --- 3. Real Number Literals ---

        System.out.println("\n--- Decimal Floating Point Literals ---");
        // Variables renamed to camelCase and fixed typos
        float decPointLiteral1 = 1.111e+1f;
        float decPointLiteral2 = .11e-11F;
        double decPointLiteral3 = 111e+1d;
        double decPointLiteral4 = 111E1D;

        System.out.println("1. " + decPointLiteral1 +
                "\n2. " + decPointLiteral2 +
                "\n3. " + decPointLiteral3 +
                "\n4. " + decPointLiteral4);

        System.out.println("\n--- Hexadecimal Floating Point Literals ---");
        // Hex floats: 0x[Integer].[Fraction]p[Exponent]
        float hexPointLiteral1 = 0xF.Fp1f;
        double hexPointLiteral2 = 0XF.FP1D;

        System.out.println("1. " + hexPointLiteral1 +
                "\n2. " + hexPointLiteral2);

        // --- 4. Character Literals ---

        System.out.println("\n--- Character Literals ---");
        char charA = 'A';
        char charNewline = '\n';

        // Surrogate pair for Rocket Emoji 
        char highSurrogate = '\uD83D';
        char lowSurrogate = '\uDE80';

        // Using replace("\n", "\\n") 
        System.out.println("Standard: " + charA + " and Newline (hidden)");

        // Concatenating high and low surrogates 
        System.out.println("Unicode Pair: " + highSurrogate + lowSurrogate);
    }
}
