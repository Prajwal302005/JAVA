
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter total kilometers driven per day: ");
        double kmPerDay = sc.nextDouble();

        System.out.print("Enter cost per liter of fuel : ");
        double costPerLiter = sc.nextDouble();

        System.out.print("Enter average kilometers per liter: ");
        double kmPerLiter = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = sc.nextDouble();

        System.out.println("Enter toll charges per day ");
        double tolls = sc.nextDouble();
        
        double fuelUsed = kmPerDay / kmPerLiter;
        double fuelCost = fuelUsed * costPerLiter;

        
        double totalCost = fuelCost + parkingFees + tolls;

       
        System.out.printf("Your total daily driving cost is: ₹%.2f%n", totalCost);

        sc.close();
    }
}
