import java.util.*;
import java.text.DecimalFormat;
public class Assignment {
	
	public static void main(String[] args) {
		int rad;
		double area, diam;
<<<<<<< HEAD
		DecimalFormat dm = new DecimalFormat();
=======
		
>>>>>>> origin/master
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		
		rad = scan.nextInt();
		scan.close();
		
		area = circArea(rad);
		diam = circDiam(rad);
<<<<<<< HEAD
		dm.setMaximumFractionDigits(4);
		
		
		System.out.println("The circle's radius is " + rad + ", the area is " + dm.format(area));
		System.out.println("The diameter is "+ dm.format(diam) +".");
		
=======
		
		System.out.println("The circle's radius is " + rad + ", the area is " + area);
		System.out.println("The diameter is "+ diam +".");

>>>>>>> origin/master
		return;
		
	}
	
	static double circArea(int rad){
		
		return rad * rad * Math.PI;
	}
	
	static double circDiam(int rad){
		
		return 2 * rad;
	}
<<<<<<< HEAD
	
=======
>>>>>>> origin/master
}
