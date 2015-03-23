
public class JarTest {
	public static void main(String[] args) {
		Jar a = new Jar();
		Jar b = new Jar();
		Jar c = new Jar();
		Jar d = new Jar();
		
		while(Jar.coinCount < 1000){
			switch((int)(Math.random()*4)){
			case 0:
				a.addCoin();
				break;
			case 1:
				b.addCoin();
				break;
			case 2:
				c.addCoin();
				break;
			case 3:
				d.addCoin();
				break;
			default:
			}
			
		}
		
		System.out.println("Time to Spend!");
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
	}
}
