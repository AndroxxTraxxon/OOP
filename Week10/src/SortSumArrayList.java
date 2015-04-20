import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SortSumArrayList {
	public static void main(String[] args) {
		int length = 25;//init variables
		int sum = 0;

		Scanner scan = new Scanner(System.in);//init scaner
		
		ArrayList<Integer> nums = new ArrayList<Integer>(length);//initialize integer AL
		int[] numarray = new int[length];//init int array
		
		for(int i = 0; i < length; i++){// get input and load into AL and int array
			System.out.print("Enter number " + (i+1) + ": ");
			int input = scan.nextInt();
			nums.add(input);
			numarray[i] = input;
			sum += nums.get(nums.size()-1);
		}
		System.out.println("The numbers are:");//print the initial array.
		System.out.println(nums);
		numarray = sortedArray(numarray);//sort the int array with my algorithm
		nums.sort(null);//sort the AL with provided algorithm
		System.out.println("The sorted array is as follows:");//print info
		System.out.println(nums);//print sorted AL
		System.out.println(Arrays.toString(numarray));//print array sorted by my algorithm.
		System.out.println("The sum of the numbers is " + sum + ".");//print the sum of the entered numbers.
		
		scan.close();
		
	}
	
	public static int[] sortedArray(int[] input){//I just thought I would try my hand a making a sorting algorithm myself. 
		for(int i = 0; i < input.length-1; i++){//iterate through the entire array
			if(input[i]>input[i+1]){//if the item at i is greater than the next item
				for(int j = i+1; j >0; j--){//loop through the previously scanned items
					if(input[j-1]>input[j]){//if the first is greater than the second
						int first = input[j-1];//basic switch item[i] with item[i+1]
						input[j-1] = input[j];
						input[j]=first;
					}
				}
			}
		}
		
		return input;
	}
}
