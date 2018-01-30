/* Name: Constructors
*  Author: Neil Clack
*  Date: Jan 28, 2018
*  
*  Constructors are special methods which are run every time you 
*  create an instance of a class. 
*/

package constructors;

/* Constructors do not have return types. 
 * Constructor names must be the same as the class. 
 * Constructor names must be capitalized the same as the class. \
 * Constructors run automatically in every instance without being called unlike a method.
 * As an example, every instance of Machine will automatically be named Annie, and run the sysout line.
 * Constructors may also accept parameters like a method.   
 */

class Machine {
	private String name;
	private int code;

	// You can also call constructors within other constructors using "this"
	public Machine() {
		// Calling another constructor must be the first line in the outer constructor
		this("Annie", 0);
		System.out.println("Constructor 1 running!");
	}
	
	public Machine(String name) {
		System.out.println("Constructor 2 running!");
		this.name = name;
	}
	
	public Machine(String name, int code) {
		System.out.println("Constructor 3 running!");
		this.name = name;
		this.code = code;
	}
}

public class Constructors {
	public static void main(String[] args) {
		// So, let's create an instance of our class.
		// The 'new' bit of this line is what actually creates the instance
		Machine machine1 = new Machine();
		
		// In order to have the second constructor run, it must be passed a paramter
		// Java will only run the constructors being used by a particular instance
		// Notice that this machine does not println "Constructor 1 Running!"
		Machine machine2 = new Machine("Zoe");
		
		// Number 3
		Machine machine3 = new Machine("Ahri", 7);
	}
}
