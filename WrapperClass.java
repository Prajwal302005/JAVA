import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Number : ");
        int a = scanner.nextInt();

        
        System.out.println("Given Number :" + a);
        System.out.println("Binary equivalent :" + Integer.toBinaryString(a));
        System.out.println("Octal equivalent :" + Integer.toOctalString(a));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(a));

        scanner.close();
    }
}
