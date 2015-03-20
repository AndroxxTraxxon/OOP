
public class Temperature {
	double ftemp;
	
	public Temperature(double temp){
		setFahrenheit(temp);
	}
	
	public Temperature(){
		setFahrenheit(0);
	}
	
	public void setFahrenheit(double temp){
		ftemp= temp;
	}
	
	public double getFahrenheit(){
		return ftemp;
	}
	
	public double getCelsius(){
		return (5.0/9) * (ftemp - 32);
	}
	
	public double getKelvin(){
		return (5.0/9) * (ftemp - 32) + 273;
	}
	
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Enter a Fahrenheit temperature:");
		
		double input = scan.nextDouble();
		Temperature temp = new Temperature(input);
		System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
		System.out.println("The temperature in Celsius is " + temp.getCelsius()); 
		System.out.println("The temperature in Kelvin is " + temp.getKelvin());
		scan.close();
	}
	
}
