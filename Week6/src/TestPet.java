import java.util.Scanner;

public class TestPet {
	public static void main(String[] args) {
		Pet pet = new Pet();
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your pet's name?");
		pet.setName(scan.nextLine());
		System.out.println("What type of pet is " + pet.getName() + "?");
		pet.setType(scan.nextLine());
		System.out.println("How many years old is " + pet.getName() + "?");
		pet.setAge(scan.nextInt());
		System.out.println(pet.getName() + " is a " + pet.getType() + " that is " + pet.getAge() + " years old.");
		
		scan.close();
	}
}
