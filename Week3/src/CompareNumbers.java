import java.util.Scanner;
public class CompareNumbers {
	public static void main(String[] args) {
		int a,b,c, sum, product, avg, largest, smallest;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = scan.nextInt();
		System.out.print("Enter second number: ");
		b = scan.nextInt();
		System.out.print("Enter third number: ");
		c = scan.nextInt();
		
		sum = a+b+c;
		product = a*b*c;
		avg = (a+b+c)/3;
		largest = max(a,max(b, c));
		smallest = min(a, min(b, c));
		
		System.out.printf("For the numbers %d, %d, and %d \n", a,b,c);
		System.out.println("Largest is " + largest);
		System.out.println("Smallest is " + smallest);
		System.out.println("Sum is " + sum);
		System.out.println("Product is "+ product);
		System.out.println("Average is " + avg);
		scan.close();
		System.exit(0);
	}
	
	static int max(int a, int b){
		return (a>b)?a:b;
		
	}
	
	static int min(int a, int b){
		return (a<b)?a:b;
		
	}
}
