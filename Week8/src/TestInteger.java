import java.util.Scanner;

public class TestInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int input = scan.nextInt();
		scan.close();
		
		
		System.out.println("isEven: ["+MyInteger.isEven(input)+"]");
		System.out.println("isOdd: ["+MyInteger.isOdd(input)+"]");
		System.out.println("isPrime: ["+MyInteger.isPrime(input)+"]");
		
		MyInteger myInt = new MyInteger(1233);
		MyInteger myPInt = new MyInteger(MyInteger.parseInt("457"));
		
		System.out.println("myInt:s"+myInt);
		System.out.println("myInt.isEven: ["+myInt.isEven()+"]");
		System.out.println("myInt.isOdd: ["+myInt.isOdd()+"]");
		System.out.println("myInt.isPrime: ["+myInt.isPrime()+"]");
		System.out.println("myPInt:" + myPInt);
		System.out.println("myPInt.isEven: ["+MyInteger.isEven(myPInt)+"]");
		System.out.println("myPInt.isOdd: ["+MyInteger.isOdd(myPInt)+"]");
		System.out.println("myPInt.isPrime: ["+MyInteger.isPrime(myPInt)+"]");
		System.out.println("[myInt = myPInt]:" + myInt.equals(myPInt));
		System.out.println("[myInt = input]:" + myInt.equals(input));
		
	}
}
