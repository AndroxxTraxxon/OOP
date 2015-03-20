
public class TheDistance {

	public static double distance(double x1, double y1, double x2, double y2){
		return(new Point(x1,y1).distanceTo(new Point(x2, y2)));
		
	}
}

class Point{
	public double x;
	public double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(Point other){
		return Math.sqrt(Math.pow(x-other.x, 2) + Math.pow(y-other.y, 2));
		
	}
	
}