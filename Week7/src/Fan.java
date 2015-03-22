
//OK. O.Aktunc

public class Fan {
	private int speed;
	private boolean fanStatus;
	private double radius;
	private String color;
	
	public Fan(){
		speed = 0;
		fanStatus = false;
		radius = 5;
		color = "blue";
		
	}

	public Fan(int speed, boolean fanStatus, double radius, String color) {
		super();
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isFanStatus() {
		return fanStatus;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
	
	public String toString(){
		return "Speed: " + speed + "\n"
				+ "Radius: " + radius + "\n"
				+ "Fan Status: " + fanStatus + "\n"
				+ "Color: " + color
				+ ".";
		
	}
	
}
