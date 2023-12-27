
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
	 * {
	 * in our nested array example, the array currently, looks like this:
	 *	[[3, 5], [1, 2], [4, 6], [7, 8]]
	 *and we need to get it to this:
	 *	[[1,2,3,5], [4, 6, 7, 8]]
	 *Set first half to Half of our 2dArray
	 *	set second half to Half of our 2dArray
	 *
	 *	this is index [0][Y] of Subdivisions
	 *	and [1][Y] 
	 *	With [3, 5] and [1, 2]
	 *	Check 3 and 1
	 *		1 is less than 3 so thats the new less
	 *		add it to index 0 of FirstHalf
	 *	Check 3 and 2
	 *		2 is less than 3 so thats the new less
	 *		add it to index 1 of FirstHalf
	 *
	 * 
	 *}
	 * */
	public int[][] JoinArrays(int[][] Subdivisions)
	{
		int[] FirstHalf;
		int[] SecondHalf;
		int[] FullArray;
		int LowestNumber = 99999;
		int HighestNumber = -99999;
		int k = 0;
		//Do distributive property without multiplication
		for( int i = 0; i < Subdivisions.length; i++ )
		{
			
			for(int j = 0; j < Subdivisions[i].length; j++)	
			{
				int CurrentElement = Subdivisions[i][j];
				int NextElement = -999;
				//Assign NextElement
				if(i == Subdivisions.length || i == Subdivisions.length - 1)
				{
				NextElement = Subdivisions[i - 1][k];
				}
				else
				{
					NextElement = Subdivisions[i +1][k];
				}
				System.out.println("CurrentElement" + CurrentElement);
				System.out.println("NextElement" + NextElement);
				
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
