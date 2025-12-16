void main() {

/**
 * Task I: Demonstration of basic Java literals.
 *
 * This program outputs:
 * - All boolean literals (true/false).
 * - The same integer value represented in decimal, octal, hexadecimal, and binary formats.
 * - Real number literals (floating-point).
 * - Character literals, including one encoded using UTF-16.
 *
 * @author Daniel Rzymański
 */

    // 1. All boolean literals
    System.out.println("--- Boolean Literals ---");
    System.out.println(true + "\n" + false);

    // 2. The same integer value represented in different formats
    byte example = 127; // 0111 1111
    System.out.println("--- Integer Literals ---");
    System.out.println("Decimal: " + example);
    System.out.println("Octal: 0_177 = " + 0_177);
    System.out.println("Hexadecimal: 0x7F = " + 0x7F);
    System.out.println("Binary: 0b1111111 = " + 0b1111111);

    // 3. Real number literals (floating-point)

    //DecimalFloatingPointLiterals
    System.out.println("--- Decimal Floating Point Literals ---");
    float DecFloatingPontLiteral_1 = 1.111e+1f;
    float DecFloatingPontLiteral_2 = .11e-11F;
    double DecFloatingPontLiteral_3 = 111e+1d;
    double DecFloatingPontLiteral_4 = 111E1D;
    System.out.println("1. " + DecFloatingPontLiteral_1 +
            "\n2. " + DecFloatingPontLiteral_2 +
            "\n3. " + DecFloatingPontLiteral_3 +
            "\n4. " + DecFloatingPontLiteral_4);
    //HexadecimalFloatingPointLiteral
    System.out.println("--- Hexadecimal Floating Point Literals ---");
    float HexFloatingPontLiteral_1 = 0xF.Fp1f;
    double  HexFloatingPontLiteral_2 = 0XF.FP1D;
    System.out.println("1. " + HexFloatingPontLiteral_1 +
            "\n2. " + HexFloatingPontLiteral_2);

    // 4. Character literals, including one encoded using UTF-16

    //Character Literal
    char CharExample = 'A';
    char CharExample2 = '\n';
    char CharExample3 = '\uD83D';
    char CharExample4 = '\uDE80';
    System.out.println("1. and 2. " + CharExample + CharExample2);
    System.out.println("3. and 4. " +  CharExample3 +  CharExample4);




}