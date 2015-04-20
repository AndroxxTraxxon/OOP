import java.util.Arrays;
import java.util.Scanner;


public class Lottery {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[5];
		int[] rando = new int[5];
		int[] matching = new int[5];//init arrays
		randoArray(rando);//randomize the lottery numbers
		getNumbers(input);//get user input for input numbers
		int count = 0;//to keep track of how many matched numbers
		for(int i = 0; i < input.length; i++){
			if(input[i]==rando[i]){//
				matching[count] = input[i];
				count++;
			}
		}
		
		System.out.println("The lottery numbers are:\n" + Arrays.toString(rando));
		System.out.println("You matched " + count +" numbers.");
		if(count >0){//if there are any matched numbers
			System.out.println("The matching numbers are:");//disp. info.
			for(int i = 0; i < count; i++){//print all the numbers that were matching.
				System.out.print(matching[i]);
				System.out.print((i+1 < count)?", ":"");//if there is another item, put a comma. to be pretty.
			}
		}else System.out.println("Sorry!");
		
		scan.close();
	}
	
	public static void randoArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*10);
		}
		
	}
	public static void getNumbers(int[] arr){
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			System.out.print("Enter input " + (i+1)+": ");
			arr[i] = scan.nextInt();
			while(arr[i]>9||arr[i]<0){
				System.out.println("ERROR: INVALID INPUT /nPlease enter a number 0-9:");
				arr[i] = scan.nextInt();
			}
		}
		scan.close();
	}
	
}
