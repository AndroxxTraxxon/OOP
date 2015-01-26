import java.util.Scanner;


public class Challenge1 {

	public static void main(String[] args) {
		String name;
		int age;
		double annualPay;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		System.out.print ("Enter your age: ");
		age = scan.nextInt();
		System.out.println("Enter your desired annual salary: ");
		annualPay = scan.nextDouble();
		
		System.out.println("My name is " + name + ", my age is " + age + " and \nI hope to earn $" + annualPay);
		
		scan.close();
		return;

	}

}
