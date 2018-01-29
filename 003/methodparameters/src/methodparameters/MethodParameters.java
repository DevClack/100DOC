package methodparameters;

class Robot{
	// the "String text" means that this method requires a String parameter, called text. 
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	// you can have more that one parameter in a method
	public void move(String direction, double distance) {
		System.out.println("Moving: " + distance + " Meters" + "\nDirection: " + direction);
	}
}

public class MethodParameters {
	public static void main(String[] args) {
		Robot sam = new Robot();
		
		/* you can pass variables to the () within methods when you call such method. 
		 * The method itself, must be set to accept that type of variable, such as above
		 * these variables are called parameters. 
		 */
		
		sam.speak("Hello, my name is Sam!");
		sam.jump(4);
		
		// If your method asks for more than one parameter, you must supply them all, seperated by commas
		sam.move("West", 12.2);
		
		// you may also pass existing variables as parameters
		
		String greeting = "Hello there! This is the greeting string!";
		sam.speak(greeting);
	}

}
