
public class CoinToss {

	public static void main(String[] args) {
		Coin c = new Coin();
		int heads=0;
		int tails=0;
		
		for(int i = 0; i < 20; i++){
			c.toss();
			System.out.println(c);
			if(c.getSideUp().equals("Heads")) heads++;
				else tails++;
		}
		System.out.println("Heads Count: " + heads);
		System.out.println("Tails Count: " + tails);
	}
}
