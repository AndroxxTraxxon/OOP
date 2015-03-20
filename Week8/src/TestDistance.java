import java.util.Scanner;


public class TestDistance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first X coord: ");
		double x1 = scan.nextDouble();
		System.out.println("Enter the first Y coord: ");
		double y1 = scan.nextDouble();
		System.out.println("Enter the second X coord: ");
		double x2 = scan.nextDouble();
		System.out.println("Enter the second Y coord: ");
		double y2 = scan.nextDouble();
		
		System.out.println("The distance between those two points is " + TheDistance.distance(x1,y1,x2,y2) + ".");
		scan.close();
	}
}
