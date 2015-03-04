
public class Circle1 {
	double radius;
	
	public Circle1(){
		radius = 1;
	}
	
	public Circle1(double radius) {
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	public String toString(){
		return "A circle with the radius " + radius + " has the area " + getArea();
		
	}
}
