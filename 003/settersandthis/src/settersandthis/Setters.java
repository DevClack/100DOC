/* Name: settersandthis
*  Author: Neil Clack
*  Date: Jan 28, 2018
*/

package settersandthis;

class Frog {
	
	String name;
	int age;
	
	// Here is a setter, it sets the method parameter as name
	// *why does this method require "void"...?
	public void setName(String newname) {
		name = newname;
	}
	
	public void setAge(int newage) {
		age = newage;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Setters {
	public static void main(String[] args) {

		Frog frog1 = new Frog();
		// Here we use setName and input a paramter to be set as the name.
		frog1.setName("Bertie");
		frog1.setAge(3);
		// Using the getName method works exactly as before, because the name within frog1 has been set using the setter method
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}
}
