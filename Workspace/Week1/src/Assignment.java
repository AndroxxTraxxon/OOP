import java.util.*;
import java.text.DecimalFormat;
public class Assignment {
	
	public static void main(String[] args) {
		int rad;
		double area, diam;
		DecimalFormat dm = new DecimalFormat();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		
		rad = scan.nextInt();
		scan.close();
		
		area = circArea(rad);
		diam = circDiam(rad);
		dm.setMaximumFractionDigits(4);
		
		
		System.out.println("The circle's radius is " + rad + ", the area is " + dm.format(area));
		System.out.println("The diameter is "+ dm.format(diam) +".");

		return;
		
	}
	
	static double circArea(int rad){
		
		return rad * rad * Math.PI;
	}
	
	static double circDiam(int rad){
		
		return 2 * rad;
	}
	
}
