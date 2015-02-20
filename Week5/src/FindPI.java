import java.lang.Math;
public class FindPI {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int accuracy = 20000000;
		double fourth = 0;
		double pi = 0;
		long finishTime = 0;
		double deltaTime = 0;
		
		
		
		
		for(int i = 0; i < accuracy; i ++){
			fourth += (Math.pow(-1,i)/(2*i + 1));
			
		}
		pi = fourth * 4;
		
		finishTime = System.currentTimeMillis();
		deltaTime = (finishTime - startTime)/1000.0;
		
		System.out.println("PI/4 = " + fourth);
		System.out.println("PI = " + pi);
		System.out.println("After " + accuracy +" iterations.");
		System.out.println("This operation took " +deltaTime + " seconds.");
	}
}
