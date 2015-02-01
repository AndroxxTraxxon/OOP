
public class EnergyDrinkComsumption {

	public static void main(String[] args) {
		int customers = 12467;
		int percentOneOrMore = 14;
		int percentCitrus = 64;
		
		System.out.println((customers * percentOneOrMore / 100) + " of the customers preferred one or more energy drinks per week.");
		System.out.println((customers * percentCitrus / 100) + " of the customers preferred citrus flavored drinks.");
		//I used integer math here because I wanted to make sure that I wasn't getting portions of people. 
		//Half of a person doesn't really buy much of a drink.
		
	}

}
