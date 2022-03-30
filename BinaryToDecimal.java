import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Binary to Decimal
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        // Get the binary number from the user
        String binary = input.nextLine();
        // Convert the binary number to decimal
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            // Get the digit
            int digit = binary.charAt(i) - '0';
            // Multiply the digit by 2^i
            decimal += digit * Math.pow(2, binary.length() - i - 1);
        }   
        // Display the decimal number
        System.out.println("The decimal number is " + decimal);

    }
}
