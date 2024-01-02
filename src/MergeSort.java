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
private void SortHalfArray(ArrayList<Integer> FirstHalf)
{
	ArrayList<Integer> unsortedFirstHalf = FirstHalf;
	ArrayList<Integer> sortedFirstHalf = new ArrayList<Integer>();
	int smallestNum =  unsortedFirstHalf.get(0);
	int largestNum = unsortedFirstHalf.get(0);
	for(int x = 0; x < unsortedFirstHalf.size() - 1; x++)
	{
	
	}
	System.out.println(largestNum);
	System.out.println(smallestNum);
	/*1.Create a new array list called sortedFirstHalf
	 *2. create a variable named SmallestNum, set it to index 0
	 *3. create a variable named LargestNum, set it to index 0
	 *4. create a for loop, loop through the array
	 *{
	 *	1. check the current index and call it currentNum
	 *	2. check the next index and call it nextNum
	 *  3. if currentNum is less than nextNum
	 *  {
	 *  	1. if curretNum is less than SmaallestNum
	 * 		{
	 *  		1. set SmallestNum to it
	 *  	}
	 *  }
	 *  4. if currentNum is greater than nextNum
	 *  {
	 *  	1. if curretNum is greater than LargestNum
	 * 		{
	 *  		1. set LargestNum to it
	 *  	}
	 *  }  	
	 *}//loop ends
	 *	We know the biggest and largest numbers,
	 * so now find the order
	 **/

}
private void AddFirstHalf(ArrayList<Integer> FirstHalf, int[][] Subdivisions)
{
	int length = Subdivisions.length;
	int firstHalfLength = length / 2;
	for(int x = 0; x < firstHalfLength; x++)
	{
		FirstHalf.add(Subdivisions[x][0]);
		FirstHalf.add(Subdivisions[x][1]);
	}
}
	public int[][] JoinArrays(int[][] Subdivisions) {
		ArrayList<Integer> FirstHalf = new ArrayList<Integer>();
		// Get the length
		int length = Subdivisions.length;
		int firstHalfLength = length / 2 - 1;
		AddFirstHalf(FirstHalf, Subdivisions);
		SortHalfArray(FirstHalf);
		System.out.println(FirstHalf);
		/*Array:
		 * [[3, 5], [1, 2], [4, 6], [7, 8]]
		 * We need it to be:
		 * [[1,2,3,5],[4,6,7,8]]
		 * [1,2,3,4,5,6,7,8]
		 * Heres what we need to do in this method:
		 *3.  Now we know whats in the first half, lets get the arrayList in order. Lets
		 * create a method named SortHalfArray();
		 *
		 *
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
