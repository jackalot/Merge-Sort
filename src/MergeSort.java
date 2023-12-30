import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	/*
	 * create a method named subdivide(int[] originalArray) { find the length of the
	 * array if the length of the array is odd { indexOne starts at 0 indexTwo which
	 * starts at 1 for the length of the array {
	 * 
	 * }
	 */
private void findSmallestNum(ArrayList<Integer> FindSmallest)
{

}
	public int[][] JoinArrays(int[][] Subdivisions) {
		ArrayList<Integer> FirstHalf = new ArrayList<Integer>();
		// Get the length
		int length = Subdivisions.length;
		/*Array:
		 * [[3, 5], [1, 2], [4, 6], [7, 8]]
		 * */
		return Subdivisions;
	}

	public int[][] Subdivide(int[] originalArray) {
		int length = originalArray.length;
		int IndexOne;
		int IndexTwo;
		int[][] newArray = new int[0][0];
		if (length % 2 == 0) // even
		{
			// Its even, make the length half so that
			// we don't have nulls
			newArray = new int[length / 2][];
			// These two find the numbers for our original array
			IndexOne = 0;
			IndexTwo = 1;
			for (int i = 0; IndexTwo < length; i++) {
				int[] Nums = { -1, -1 };
				// Add the current numbers in the
				// original array
				Nums[0] = originalArray[IndexOne];
				Nums[1] = originalArray[IndexTwo];
				newArray[i] = Nums;
				// increment
				IndexOne += 2;// odd positions
				IndexTwo += 2;// even positions
			}
		} else // odd
		{

		}
		return newArray;
	}

	public int[][] SwapSubdivisions(int[][] Subdivisions) {
		for (int x = 0; x < Subdivisions.length; x++) {
			if (Subdivisions[x][0] > Subdivisions[x][1]) {
				int Swap = Subdivisions[x][0];
				Subdivisions[x][0] = Subdivisions[x][1];
				Subdivisions[x][1] = Swap;
			}
		}
		return Subdivisions;
	}
}
