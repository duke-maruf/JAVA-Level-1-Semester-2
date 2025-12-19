class Person {
	String name;
	String gender;
	Person() {
		name = "Unknown";
		gender = "Unknown";
	}
	Person(String n, String g) {
		name = n;
		gender = g;
	}
	void showDetails() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
	}
	
}
// Method overloading
/*
 * 1. Method names should be same
 * 2. Methods should have different parameters (type or number)
 * 3. Method return type has no effect
 */
// Method Overriding (or replacing)
/* 1. We can only override in subclass or child class
 * 2. return_type methodName(parameters) -> Everything should be same. So,
 * method signature of both methods should be same
 * 
 */


class Student extends Person {
	String id;
	Student(String id, String n, String g) {
		super(n,g); // constructor method
		this.id = id;
	}
	void showDetails() {
		System.out.println("ID: " + id);
//		System.out.println("Name: " + name);
//		System.out.println("Gender: " + gender);
		super.showDetails(); // only a keyword to access variable or
							// method of immediate superclass
	}
}
public class MyClass {
	public static void main(String[] args) {
		Student s1 = new Student("21001", "Islam", "Male");
		s1.showDetails();
	}
}












