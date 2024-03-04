package assign__;

public class pg5 {
	
	private String name;
	private int age;
	private String address;
	public pg5() {
	this.name = "unknown";
	this.age = 0;
	this.address = "not available";
	}
	// First setInfo method
	public void setInfo(String name, int age) {
	this.name = name;
	this.age = age;
	}
	// Second setInfo method
	public void setInfo(String name, int age, String address) {
	this.name = name;
	this.age = age;
	this.address = address;
	}
	@Override
	public String toString() {
	return "Name: " + name + " Age: " + age + ", Address: " + address;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using array of objects
		pg5[] students = new pg5[3];
		// Create instances and set their values
		students[0] = new pg5();
		students[0].setInfo("Mika",28);
		students[1] = new pg5();
		students[1].setInfo("Lea",17, "Raia");
		students[2] = new pg5();
		students[2].setInfo("Rajdhir",26,"Margoa");
		

		// Print the name, age, and address of the 3 students
		for (int i = 0; i < 3; i++) {
		System.out.println(students[i]);
		}
	}

}
