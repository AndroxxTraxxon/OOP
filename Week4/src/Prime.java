//OK. O.Aktunc

import java.util.Scanner;

public class Prime {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		long input = scan.nextInt();
		int count = 0;
		int line = 0;
		if (input <2){
			System.out.println("There are no prime numbers between 0 and " + input + ".");
			scan.close();
			return;
		}
		
		System.out.println("The prime numbers less than " + input + " are as follows: ");
		for(int i = 2; i <= input; i++){
			if(isPrime(i)){
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
		System.out.println("There were "+count+" prime numbers less than or equal to " + input + ".");
		
		scan.close();
	}
	
	public static boolean isPrime(long i){
		if (i < 2) return false;
		for(long j = 2; j<(int)(Math.sqrt(i)+1); j++){
			if (i%j==0)return false;
		}
		return true;
	}
}
