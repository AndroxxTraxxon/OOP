
public class Array {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter?");//prompt user for input
		int input = scan.nextInt();//take input from scanner
		int[] myArray = new int[input];//set myArray to length of input
		
		for(int i = 0; i < myArray.length; i++)
		
		{//for each element in myArray
			System.out.print("Enter number " + (i+1) + ": ");//prompt for input
			myArray[i] = scan.nextInt();//set myArray at i to input.
		}
		System.out.println("Highest element is " + max(myArray));//print the highest number
		System.out.println("Lowest element is " + min(myArray));//print lowest number
		System.out.println("Sum of the elements is " + sum(myArray));//print sum of numbers
		System.out.println("Average of the elements is " + avg(myArray));//print average of numbers.
		scan.close();

	}
	
	public static int max(int[] arr){
		int max = Integer.MIN_VALUE;//set the max to lowest possible value
		for(int i = 0; i < arr.length; i++){//for each element
			if (arr[i]>max) max = arr[i];//if the element is greater than the current max, then set the max to the element
		}
		return max;
	}
	
	public static int min(int[] arr)
	
	{
		int min = Integer.MAX_VALUE;//set the min to highest possible value
		for(int i = 0; i < arr.length; i++){
			if (arr[i]<min) min = arr[i]; //if the element is lesser than the current min, then set the min to the element
		}
		return min;
	}
	
	public static int sum(int[] arr)
	//Returns the sum of the values of the elements in an int array 
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];//add each element in the array to sum.
		}
		return sum;
	}
	
	public static double avg(int[] arr)
	//Returns the average value of the elements in an int array 
	{
		return (double)sum(arr)/arr.length;
	}

}
