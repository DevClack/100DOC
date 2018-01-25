package testing;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		
		int val = input.nextInt();
		
		System.out.println("Your integer is: " + val);
	}

}
