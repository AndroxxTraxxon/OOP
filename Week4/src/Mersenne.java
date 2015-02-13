import java.util.Scanner;


public class Mersenne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int input = scan.nextInt();
		int count = 0;
		int line = 0;
		if (input <2){
			System.out.println("There are no Mersenne prime numbers between 0 and " + input + ".");
			scan.close();
			return;
		}
		
		System.out.println("The Mersenne prime numbers less than or equal to " + input + " are as follows: ");
		for(int i = 2; i <= input; i++){
			if(isMersenne(i)){
				count++;
				line++;
				System.out.print(i + "  ");
				
			}
			if (line==10){
				System.out.println();
				line = 0;
			}
			
		}
		System.out.println();
		System.out.println("There were "+count+" Mersenne prime numbers less than or equal to " + input + ".");
		
		scan.close();

	}
	
	public static boolean isMersenne(int i){
		return(isPowTwo(i+1)&&Prime.isPrime(i));
		
	}
	
	public static boolean isPowTwo(int i){
		if(i == 2) return true;
		if(i % 2 != 0) return false;
		return isPowTwo(i/2);
		
	}

}
