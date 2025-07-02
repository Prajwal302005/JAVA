import java.util.Scanner;
public class Double_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		if(!scanner.hasNextDouble()) {
			System.out.println("input is not double value");
			return;
		}
		double num1= scanner.nextDouble();
		System.out.println("enter the second number");
		if(!scanner.hasNextDouble()) {
			System.out.println("second input is not double");
			return;
		}
		double num2= scanner.nextDouble();
		double average= (num1+num2)/2;
		System.out.println("average" + average);
		scanner.close();
		
	}

}
//java takes int as doubles//datatype 
