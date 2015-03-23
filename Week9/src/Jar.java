
public class Jar {
	private int jarCount;
	public static int coinCount;
	
	public void addCoin(){
		System.out.println("Clink");
		jarCount++;
		coinCount++;
	}
	
	public int getJarCount(){
		return jarCount;
		
	}

	@Override
	public String toString() {
		return "Jar [jarCount=" + jarCount + "]";
	}
	
}
