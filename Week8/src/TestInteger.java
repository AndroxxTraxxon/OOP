import java.util.Scanner;

public class TestInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int input = scan.nextInt();
		
		System.out.println(" isEven: ["+MyInteger.isEven(input)+"]");
		System.out.println("  isOdd: ["+MyInteger.isOdd(input)+"]");
		System.out.println("isPrime: ["+MyInteger.isPrime(input)+"]");
		
		scan.close();
	}
}
