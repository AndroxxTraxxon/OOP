import java.math.BigInteger;


public class RiceChessBoard {
	
	
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger prevNum = BigInteger.ONE;
		sum = sum.add(prevNum);
		for(int pow = 0; pow < (8*8)-1; pow++){
			prevNum = prevNum.add(prevNum);
			sum = sum.add(prevNum);
			
		}
		
		System.out.println(sum.toString());
	}
	
}
