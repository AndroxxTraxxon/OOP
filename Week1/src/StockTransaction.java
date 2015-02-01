
public class StockTransaction {

	public static void main(String[] args){
		
		int shares = 1000;
		double rate = 32.87;
		double rate2 = 33.92;
		double commission = .02;
		
		double initCost = shares * rate;
		double initCommission = initCost * commission;
		
		double saleAmt = shares * rate2;
		double closeCommission = saleAmt * commission;
		 
		double profit = saleAmt - closeCommission - initCommission - initCost;
		
		System.out.println("Purchase amount:     $" + initCost);
		System.out.println("Purchase commission: $" + initCommission);
		System.out.println("Sale amount:         $" + saleAmt);
		System.out.println("Sale commission:     $" + closeCommission);
		System.out.println("Total profit:        $" + profit);
		
	}
}
