package arrayofstrings;

public class ArrayofStrings {
	public static void main(String[] args) {
		/* syntax of arrays. 
		 * Type[] name = new*newarray* type[Count]
		 * [] indicates an array while type indicates type of data
		 */
		
		/// Array of strings
		String[] words = new String[3];
		/// Array of integers
		int[] nums = new int[3];
		
		/* Here we can set each element of the array to a 
		 * specific data, or in this case, a specific string.
		 * Arrays in java are indexed the same as list items in python. 
		 * Array indexes begin at 0 and end in [count - 1]
		 */
		words[0] = "Welcome";
		words[1] = "to";
		words[2] = "arrays!";
		
		System.out.println("Words[0] = " + words[0]);
		System.out.println("Words[1] = " + words[1]);
		System.out.println("Words[2] = " + words[2]);
		System.out.println(words[0] + " " + words[1] + " " +  words[2]);
		
		/* self note: alternatively I could have included spaces in my strings. 
		 * I believe this is bad practice but will need to check later. 
		 */
		String[] words2 = new String[3];
		words2[0] = "Welcome ";
		words2[1] = "to ";
		words2[2] = "Arrays!";
		System.out.println(words2[0] + words2[1] + words2[2]);
		
		/* Here we can create an array and assign each index in one line
		 * This creates a String array with 3 elements (String[3])
		 * It assigns each index, 1,2,3 to apples, oranges and pineapples respectively
		 */
		String[] fruits = {"apple", "orange", "pineapple"};
		
		/* Iterating through arrays:
		 * This function declares a variable to set to each array member
		 * it then prints out each item in fruits, using fruit for the print function
		 * for each item in the array "fruits"
		 */
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}
}
