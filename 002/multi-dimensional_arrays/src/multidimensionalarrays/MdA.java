package multidimensionalarrays;

public class MdA {
	public static void main(String[] args) {
		/* A multi-dimensional array is simply an array of arrays
		 * the syntax is Type[count][count] where
		 * Type[Row][Column]
		 */
		int[][] grid = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		/* here we have two rows, two columns. 
		 * Indexing this array is as simple as it looks
		 */
		System.out.println(grid[1][2]);
		/* we get 6 because [1] means index 1 of outer array ({4,5,6})
		 * and in [2] means index 2 of the array in index 1 of the total array
		 * So first is the outermost array
		 * second is the second outer most array and so on. 
		 * [0][0] would return 1 because {1,2,3} is in index 0 and within index 0, 1 is index 0 of that array
		 * It sounds confusing but is actually very simple in practice. Now I'll try to create a 3 dimensional array
		 */
		
		int[][][] grid2 = {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				},
				{
					{10,20,30},
					{40,50,60},
					{70,80,90}
				}
		};
		/* Now we have an array, within a second array, within a third array
		 * This is just for fun and experimentation
		 * I can not think of any reason this would be necessary in real code at this point in time
		 * Now let's try to sysout 5, 9, 10 and 70
		 */
		System.out.println(grid2[0][1][1]);
		System.out.println(grid2[0][2][2]);
		System.out.println(grid2[1][0][0]);
		System.out.println(grid2[1][2][0]);
		
		/// Kind of proud of myself here, it worked! 
		/// p.s. There was a massive smile on my face after successfully running this
		
		
		/* okay now let's iterate through grid.
		 * This is done in the "rows" then "columns" fashion
		 * We will need a for loop within a for loop
		 * the second loop will need a different loop variable
		 */
		
		for(int row=0; row<grid.length; row++ ) {
			for(int col=0; col<grid[row].length; col++) {
				/// we use grid[row] to iterate over each item of the inner array
				System.out.print(grid[row][col] + " ");
			}
			/// because this is within the row loop and not col, it will "print" a new line with each row only
			System.out.println();
		}
		
	}
}
