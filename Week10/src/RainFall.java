public class RainFall{
	
	public static void main(String[] args){
		double[] amount = new double[12];//make an array with 12 elements, one for each month
		for(int i = 0; i < amount.length; i++)//for every element in the array,
		{
			amount[i] = getAmt(i+1);//assign a value
		}
		
		System.out.println(totalRainfall(amount));
		System.out.println(averageRainfall(amount));
		System.out.println(monthMost(amount));
		System.out.println(monthLeast(amount));
		
	}
	
	static double totalRainfall(double[] amts)//returns the sum of the values for every element in the amts array.
	{	
		double total = 0;
		for(int i = 0; i < amts.length; i++){
			total += amts[i];
		}
		return total;
	}
	
	static double averageRainfall(double[] amts)//returns the sum of an arrays values divided by the number(count) of values.
	{
		return totalRainfall(amts)/amts.length;
	}
	
	static String monthMost(double[] amts){//returns the position in an array with the highest value, and assigns it to a name based on its position in the array
		int index = 0;
		for(int i = 0; i < amts.length; i++){
			if(amts[i] > amts[index])index = i;	
		}
		switch(index){
			case 0: return "January";
			case 1: return "February";
			case 2: return "March";
			case 3: return "April";
			case 4: return "May";
			case 5: return "June";
			case 6: return "July";
			case 7: return "August";
			case 8: return "September";
			case 9: return "October";
			case 10: return "November";
			case 11: return "December";
			default: return "ERROR";
		}
	}
	
	static String monthLeast(double[] amts){//returns the position in an array with the lowest value, and assigns it to a name based on its position in the array
		int index = 0;
		for(int i = 0; i < amts.length; i++){
			if(amts[i] < amts[index])index = i;	
		}
		switch(index){
			case 0: return "January";
			case 1: return "February";
			case 2: return "March";
			case 3: return "April";
			case 4: return "May";
			case 5: return "June";
			case 6: return "July";
			case 7: return "August";
			case 8: return "September";
			case 9: return "October";
			case 10: return "November";
			case 11: return "December";
			default: return "ERROR";
		}
		
	}
	
	static double getAmt(int i)// returns an amount taken from user input.
	{
		@SuppressWarnings("resource")
		java.util.Scanner scan = new java.util.Scanner(System.in);
		double amt=-1;
		while(amt < 0){
			System.out.print("Enter rainfall for month " + i +":");
			amt = scan.nextDouble();
		}
		//scan.close();
		return amt;
	}
	
}