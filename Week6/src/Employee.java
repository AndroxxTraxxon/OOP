/*
 * Write a class  named  Employee that has the following fields:
• name : The name  field is a String  object  that holds the employee's name .
• idNumber: The idNumber is an int  variable  that holds the employee's ID number.
• department: The department field is a String  object  that holds the name  of the department where the employee works.
• position: the position field is a string  object  that holds the employee's job title.

Write appropriate mutator methods  that store  the values  in these fields and accessor methods  that return the values  in these fields. 

Once you have written the class , add a main
method  that creates three Employee objects  to hold the following data:

Name  			ID Number 	Department 		Position
Susan Meyers 	47899 		Marketing 		Sales Rep 
Mark Jones 		39119 		IT 				Programmer
Joy Rogers 		81774 		Manufacturing 	Engineer

The program  should store  this data in the three objects  and then display the data 
for each employee in the format:

Name , employee number ID Number, works as a Position in Department.

For example:

Susan Meyers, employee 47899, works as a Sales Rep in Marketing.

Print each statement  on a separate line in the order Susan, Mark, Joy.
 * 
 * 
 * 
 */

public class Employee {
	String name;
	int idNumber;
	String department;
	String position;
	
	public Employee(String nm, int id, String dept, String pos){
		name = nm;
		idNumber = id;
		department = dept;
		position = pos;
		
	}
	
	public static void main(String[] args) {
		Employee susan = new Employee("Susan Meyers", 47899, "Marketing", "Sales Rep");
		Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		System.out.println(susan);
		System.out.println(mark);
		System.out.println(joy);
		
		
		
		
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String toString(){
		//Susan Meyers, employee 47899, works as a Sales Rep in Marketing.
		return (getName() + ", employee " + getIdNumber() + ", works as a " + getPosition() + " in " + getDepartment() +".");
		
	}
	
}
