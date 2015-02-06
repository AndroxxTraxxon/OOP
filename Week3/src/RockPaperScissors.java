import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {
		
		//do{
			playGame();
		//}while(playAgain());
		//System.exit(0);
		
	}
	
	static void playGame(){
		int user, random;
		Scanner scan = new Scanner(System.in);
		System.out.print("rock (0), paper (1), scissors (2): ");
		user = scan.nextInt();
		random =  (int) (Math.random()*3);
		if(user == random)
			System.out.println("It's a Tie!");
		
		else {switch (random){
			case 0:
			
				if (user == 1)
					System.out.println("You won: paper beats rock");
				else if (user == 2)
					System.out.println("You lost: rock beats scissors");
			
				break;
			case 1:
				if (user == 0)
					System.out.println("You lost: paper beats rock");
				else if (user == 2)
					System.out.println("You won: scissors beats paper");
				break;
			case 2:
				if (user == 0)
					System.out.println("You won: rock beats scissors");
				else if (user == 1)
					System.out.println("You lost: scissons beats paper");
				break;
			default:System.out.println("I really don't know what you're talking about.");
		
			}
		}
		
		
		scan.close();
		
	}
	
	/*static boolean playAgain(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Play again? (Y:N) ");
		String input = scan.nextLine();
		scan.close();
		input = input.substring(0,1).toUpperCase();
		return input == "Y";
	}*/
}
