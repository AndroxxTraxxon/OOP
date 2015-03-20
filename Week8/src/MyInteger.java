
public class MyInteger {
	
	public static boolean isEven(int num){
		return (num%2==0);	
	}
	
	public static boolean isOdd(int num){
		return (num%2==1);
	}
	
	public static boolean isPrime(int num){
		if (num < 2) return false;
		for(long j = 2; j<(int)(Math.sqrt(num)+1); j++){
			if (num%j==0)return false;
		}
		return true;
	}
}
