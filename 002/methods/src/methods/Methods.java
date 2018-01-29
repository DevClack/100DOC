package methods;

class Person {
	String name;
	int age;

	/*
	 * Can create methods within classes to call at a later time. These are also
	 * called "subroutines. For currently unkown reason, methods always begin with
	 * void, and lowercase letters.
	 */
	
	void sayHello() {
		System.out.println("Hello!");
	}
	
	void speak() {
		System.out.println("This is a second method within the person class!");
	}
}

/// note: fixing formatting is easy with control+shift+f

public class Methods {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 23;
		// To run a method, use the object name (not the class name) and .method()
		// Must include parenthesis!
		
		person1.sayHello();
		System.out.println("My name is " + person1.name + " and I am " + person1.age + " years old.");

		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 20;
		person2.sayHello();
		System.out.println("My name is " + person2.name + " and I am " + person2.age + " years old.");
		person2.speak();

	}

}
