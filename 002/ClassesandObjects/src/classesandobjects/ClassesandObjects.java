package classesandobjects;

import java.util.Scanner;

/* Public classes must match the name of file. ClassesandObjects must be in a file named ClassesandObjects
 * You may have as many non-public classes in a class file as required
 * A class is a template for creating objects. 
 */

class Person{
	/* A "person" class is responsible for creating objects or, in this case, people. 
	 * Classes may contain: 
	 * 1: Data - name, address, location, mood, "state". These are also called instance variables.
	 * 2: sub-routines or methods - System.out.println(); is a subroutine.
	 * 
	 */
	
	/// data
	String name;
	int age; 
	String height; 
}

public class ClassesandObjects {

	public static void main(String[] args) {
		
		// Using the person class to create a person
		// name here is the variable that refers to the person
		
		Person person1 = new Person();
		// to access, or asign attributes (instance variables from the referenced class) use .method
		person1.name = "Joe";
		person1.age = 24;
		person1.height = "5'7";
		
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 20;
		person2.height = "5'3";
		
		System.out.println("Our first person is: " + person1.name);
		System.out.println("His age and height are: " + person1.age + " " + person1.height);
	}

}
