import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer input
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();

        // Display results
        System.out.println("Given Number :" + number);
        System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
        System.out.println("Octal equivalent :" + Integer.toOctalString(number));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number).toUpperCase());

        scanner.close();
    }
}
