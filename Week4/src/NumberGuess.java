import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rando = (int)(Math.random()*100)+1;
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 100");
		
		do{
			input = scan.nextInt();
			if(input > rando)System.out.println("Guess lower");
			else if(input < rando)System.out.println("Guess higher");
			
		}while(input != rando);
		System.out.println("You guessed it right.");
		scan.close();

	}

}
