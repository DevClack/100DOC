/* Name: settersandthis
*  Author: Neil Clack
*  Date: Jan 28, 2018
*/

package settersandthis;

class Frog {
	// the "private" means that these variables are not accessible directly, outside of this class. 
	private String name;
	private int age;
	
	// Here is a setter, it sets the method parameter as name
	// * see notes in the "frog" class file for reference to this.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
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
