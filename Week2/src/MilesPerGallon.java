//OK. O.Aktunc

import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		double miles, gallons, mpg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the miles driven: ");
		miles = scan.nextDouble();
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		mpg = miles/gallons;
		System.out.println("The miles-per-gallon is " + mpg);
		
		scan.close();
		System.exit(0);
	}
	
	

}
