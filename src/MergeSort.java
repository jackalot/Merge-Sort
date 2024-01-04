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
private ArrayList<Integer> SortHalfArray(ArrayList<Integer> HalfArray)
{
	ArrayList<Integer> unsortedFirstHalf = HalfArray;
	ArrayList<Integer> sortedFirstHalf = new ArrayList<Integer>();
	int smallestNum =  unsortedFirstHalf.get(0);
	int largestNum = unsortedFirstHalf.get(0);
	//Find the smallest, and largest in the array
	for(int x = 0; x < unsortedFirstHalf.size() - 1; x++)
	{
		int currentNum = unsortedFirstHalf.get(x);
		int nextNum = unsortedFirstHalf.get(x + 1);
		//Compare the current and next number,
		// find the smallest/greatest and store it
		/* if the current number is smaller , store it*/
		if(currentNum < nextNum && currentNum < smallestNum)
		{
				smallestNum = currentNum;
		}
		/*If the current number is bigger, store it*/
		if(currentNum > nextNum && currentNum > largestNum)
		{
				largestNum = currentNum;
		}
		/* if the next number is smaller , store it*/
		if(nextNum < currentNum && nextNum < smallestNum)
		{
				smallestNum = nextNum;
		}
		/*If the next number is bigger, store it*/
		if(nextNum > currentNum && nextNum > largestNum)
		{
				largestNum = nextNum;
		}
		
	}
	//Add the smallest to our sorted list
	sortedFirstHalf.add(smallestNum);
	//remove smallest and biggest from the unsortedList
	int index =  unsortedFirstHalf.indexOf(largestNum);
	unsortedFirstHalf.remove(index);
		index =  unsortedFirstHalf.indexOf(smallestNum);
	unsortedFirstHalf.remove(index);
	//sort through the list, see if its in order
	while(unsortedFirstHalf.isEmpty() == false)
	{
		int medianNum = 0;
		//Get all numbers below the median and set that to 
		// be removed next iteration of outer loop
		for(int x = 0; x < unsortedFirstHalf.size(); x++)
		{
			int currentNum = unsortedFirstHalf.get(x);
			//any number lower than the current 
			// median is our next number in the list
			if(medianNum == 0)
			{
				medianNum = currentNum;
			}
			if(currentNum < medianNum)
			{
				medianNum = currentNum;
			}
		}
		//Remove the median from the unordered list, 
		// add it to the sorted list 
		index =  unsortedFirstHalf.indexOf(medianNum);
		unsortedFirstHalf.remove(index);
		sortedFirstHalf.add(medianNum);
	}
	sortedFirstHalf.add(largestNum);
	return sortedFirstHalf;

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
private void AddSecondHalf(ArrayList<Integer> SecondHalf, int[][] Subdivisions)
{
	int length = Subdivisions.length;
	int firstHalfLength = length / 2;
	for(int x = firstHalfLength; x < length; x++)
	{
		SecondHalf.add(Subdivisions[x][0]);
		SecondHalf.add(Subdivisions[x][1]);
	}
}
public int[][] JoinArrays(int[][] Subdivisions) {
		ArrayList<Integer> FirstHalf = new ArrayList<Integer>();
		ArrayList<Integer> SecondHalf = new ArrayList<Integer>();
		// Get the length
		int length = Subdivisions.length;
		int firstHalfLength = length / 2 - 1;
		AddFirstHalf(FirstHalf, Subdivisions);
		AddSecondHalf(SecondHalf, Subdivisions);
		FirstHalf = SortHalfArray(FirstHalf);
		SecondHalf = SortHalfArray(SecondHalf);
		System.out.println("[" + FirstHalf + "," + SecondHalf + "]");
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
