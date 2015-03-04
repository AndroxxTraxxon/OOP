
public class Student {

	private String name;
	private int id;
	private String major;
	
	public Student(){
		name = "James Bond";
		id = 007;
		major = "espionage";
		
	}
	
	public Student(String name, int id, String major) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String toString(){
		return (name + " " + id + " " + major);
		
	}

}
