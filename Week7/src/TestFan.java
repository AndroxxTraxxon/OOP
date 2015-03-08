import java.util.Scanner;


public class TestFan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String color;
		int speed;
		double radius;
		boolean fanStatus;
		
		System.out.println("Enter the color of the fan: ");
		color = scan.nextLine();
		System.out.println("Enter the speed of the fan: ");
		speed = scan.nextInt();
		System.out.println("Enter the radius of the fan: ");
		radius = scan.nextDouble();
		System.out.println("Enter the status of the fan: ");
		String input = scan.nextLine();
		input = input.toUpperCase();
		fanStatus = (input.equals("ON")||input.equals("RUNNING")||input.equals("HIGH"));
		
		Fan fan = new Fan(speed, fanStatus, radius, color);
		System.out.println(fan);
		
		scan.close();
		
	}
}
