/* Name: settersandthis
*  Author: Neil Clack
*  Date: Jan 28, 2018
*/

class "Frog"{
	// the "private" means that these variables are not accessible directly, outside of this class. 
	private String name;
	private int age;
	
	/* Here, there are two variables with the same names within the "frog" class
	 * inside of the setName method, "name" refers to the variable parameter within the method. 
	 * this.name refers to the name variable outside of this particular method. 
	 * i.e. this.name refers to the name variable within line 8 of this class file
	 * while name refers to the name variable within line 18
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}