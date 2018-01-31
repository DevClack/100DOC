/*Static variables and methods are useful for constants
 * one example is Math.PI, which is a constant variable that equals pi
 * This makes certain data and functions unchangeable outside of the class
 * Constants are usually referenced with uppercase letters and a final keyword
 */
class Thing {
	// Final means constant, which means it is not reasignable
	public final static int LUCKY_NUMBER = 7;

	public String name;
	/*
	 * Static variables do not copy to each object. They belong only to the class
	 * Decsription belongs to the class "Thing" not the object, thing1 or thing2
	 * 
	 * a non static variable creates a copy of the object for each instance of the
	 * class
	 */
	public static String description;

	// Note for earlier subject
	// void is a return type for methods that return a variable
	// Return type should math the variable type, System.out.println() is not a
	// variable type
	// Therefore, sysout needs to be void
	public void showName() {
		System.out.println(name);

	}

	// There can also be static methods
	public static void showInfo() {
		System.out.println("Hello");
	}

	// static methods can also use other stativ variables within the class
	public static void showDescrip() {
		System.out.println(description);
		// They can not reference non static variables
		// System.out.println(name); Gives an error
	}

	// static variables can also be used as counters. When the Thing class is run,
	// counter will increase by 1
	// Count can also be used to create ID's
	public int id;
	
	public static int count = 0;

	public Thing() {
		id = count; 
		count++;
	}
}

public class app {
	public static void main(String[] args) {

		// Static variables can be set outside of a class
		// Static variables can only be one thing at a time, therefore the same for each
		// instance
		System.out.println("Before creating objects, count is: " + Thing.count);
		Thing.description = "I am a thing";
		System.out.println(Thing.description);
		Thing.showInfo();
		Thing.showDescrip();

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		thing1.name = "bob";
		thing2.name = "sue";

		System.out.println(Thing.description + " named " + thing1.name + " and my I.D. is: " + thing1.id);
		System.out.println(Thing.description + " named " + thing2.name + " and my I.D. is: " + thing2.id);

		thing1.showName();
		thing2.showName();

		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("Now count is: " + Thing.count);

	}
}
