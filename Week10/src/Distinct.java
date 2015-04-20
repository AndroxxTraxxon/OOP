import java.util.Scanner;


public class Distinct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		int count=0;
		for(int i = 0; i < input.length; i++){// for a given number of inputs
			System.out.print("Enter value " + (i+1) + ": ");
			int in = scan.nextInt();
			if(!contains(input, in)){//if the input is not already in the array, add it to the array.
				input[count] = in;
				count++;
			}	
		}
		
		System.out.println("The mutually distinct numbers are as follows:");
		for(int i = 0; i < count; i++){
			System.out.print(input[i]+" ");
		}
		
		scan.close();
	}
	
	static boolean contains(int[]arr, int num){//returns if an int array contains a given value
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==num)return true;
		}
		return false;
	}
}
