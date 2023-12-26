
public class MergeSort {
/*create a method named subdivide(int[] originalArray)
 * {
 *  find the length of the array
 *  if the length of the array is odd {
 * 		indexOne starts at 0 
 * 		indexTwo which starts at 1
 * 		for the length of the array {
 * 			
 * }
 * */
	/*JoinArrays()
	 * in our nested array example, the array currently, looks like this:
	 *	[[3, 5], [1, 2], [4, 6], [7, 8]]
	 *and we need to get it to this:
	 *	[[1,2,3,5], [4, 6, 7, 8]]
	 *Set first half to one Subdivision of our 2dArray
	 *set second half to another Subdivision of our 2dArray
	 *Create variables named:
	 *Full array, LowestNumber, HighestNumber
	 *
	 * */
	public int[][] JoinArrays(int[][] Subdivisions)
	{
		int[] FirstHalf;
		int[] SecondHalf;
		int[] FullArray;
		int LowestNumber = 99999;
		int HighestNumber = -99999;
		//Increment over the outside array
		
		for( int i = 0; i < Subdivisions[0].length; i++ )
		{
			int ThisArray = Subdivisions[i][0];
			int NextArray = Subdivisions[i + 1][0];
			//is the current number bigger or smaller
			// than the next number in the next array
			if(ThisArray <= NextArray)
			{
				if(LowestNumber > ThisArray)
				{
				LowestNumber = ThisArray;
				}
			}
			else
			{
				if(LowestNumber > NextArray)
				{
				LowestNumber = NextArray;
				}
			}	
		}
		return Subdivisions;
	}
	public int[][] Subdivide(int[] originalArray)
	{
		int length = originalArray.length;
		int IndexOne;
		int IndexTwo;
		int[][] newArray = new int[0][0];
		if(length % 2 == 0) // even
		{
			// Its even, make the length half so that
			// we don't have nulls
			newArray = new int[length / 2][];
			//These two find the numbers for our original array
			IndexOne = 0;
			IndexTwo = 1;
			for(int i = 0;IndexTwo < length; i++)
			{
				int[] Nums = {-1, -1};
				//Add the current numbers in the
				// original array
				Nums[0] = originalArray[IndexOne];
				Nums[1] = originalArray[IndexTwo];
				newArray[i] = Nums;
				// increment
				IndexOne += 2;// odd positions
				IndexTwo += 2;// even positions
			}
		}
		else //odd
		{
			
		}
		return newArray;
	}
public int[][] SwapSubdivisions(int[][] Subdivisions)
{
	for(int x = 0; x < Subdivisions.length; x++)
	{
		if(Subdivisions[x][0] > Subdivisions[x][1])
		{
			int Swap = Subdivisions[x][0];
			Subdivisions[x][0] = Subdivisions[x][1];
			Subdivisions[x][1] = Swap;
		}
	}
	return Subdivisions;
}
}
