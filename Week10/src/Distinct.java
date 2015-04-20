import java.util.Scanner;


public class Distinct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10];
		int count=0;
		for(int i = 0; i < input.length; i++){
			System.out.print("Enter value " + (i+1) + ": ");
			int in = scan.nextInt();
			if(!contains(input, in)){
				input[count] = in;
				count++;
			}	
		}
		
		System.out.println("The mutually distinct numbers are as follows:");
		for(int i = 0; i < count; i++){
			System.out.print(input[i]+" ");
		}for(int i = 0; i < count; i++){
			System.out.print(input[i]+" ");
		}
		
		scan.close();
	}
	
	static boolean contains(int[]arr, int num){
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==num)return true;
		}
		return false;
	}
}
