package getters;

class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name);
	}
	
	/* Because of the "void" this method cannot return anything useful. 
	 * What we want to do is have this method make the calculation but only return the answer later when we need it. 
	void calculateyearstoretirement() {
		int yearsleft = 65 - age;
		System.out.println(yearsleft);
	}
	*/
	// because we want to return an int, we will use int
	int calculateyearstoretirement() {
		int yearsleft = 65 - age;
		// the return statement means that this function, or method, returns an object or variable. 
		return yearsleft; 
	}
}



public class App {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Joe";
		p1.age = 25;
		
		p1.speak();
		
		// here we call the method by assigning it to a variable called years.
		int years = p1.calculateyearstoretirement();
		System.out.println("Years till retirement: " + years);
	}

}
