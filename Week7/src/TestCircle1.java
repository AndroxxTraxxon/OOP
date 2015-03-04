
public class TestCircle1 {
	public static void main(String[] args) {
		Circle1 c1 = new Circle1(5);
		Circle1 c2 = new Circle1();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setRadius(100);
		System.out.println(c1);
	}
}
