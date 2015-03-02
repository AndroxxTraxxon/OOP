/*
 * Write a class  named  Car that has the following fields:

• yearModel: The yearModel field is an int  that holds the car's year model.
• make: The make field is a String  object  that holds the make of the car.
• speed: The speed field is an int  that holds the car's current speed.

In addition, the class  should have the following methods :

• Constructor : The constructor  should accept the car's year model and make as arguments .
These values  should be assigned  to the object 's yearModel and make fields. The 
constructor  should also assign  0 to the speed field.
• Accessor: The appropriate accessor methods  should be implemented to access the values 
stored  in the object 's yearModel, make, and speed fields.
• accelerate: The accelerate method  should add 5 to the speed field when it is called.
• brake: The brake method  should subtract 5 from the speed field each time it is called.

Demonstrate the class  by adding a main method  that creates a Car object  (use the year 1965 and the make "Bat Mobile" and then calls the 
accelerate method  five times. After each call to the accelerate method , get the current
speed of the car and print it on a separate line. Then, call the brake method  five times,
each time printing the current speed of the car on a separate line.
 */


public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int year, String mk){
		yearModel = year;
		make = mk;
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car bat = new Car(1965, "Bat Mobile");
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.accellerate();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		bat.brake();
		System.out.println(bat.getSpeed());
		
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accellerate(){
		speed += 5;
		
	}
	
	public void brake(){
		speed -= 5;
		if (speed < 0) speed = 0;
	}
	
}
