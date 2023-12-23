import java.util.ArrayList; // import the ArrayList class
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
	public ArrayList<Integer[]> Subdivide(int[] originalArray)
	{
		int length = originalArray.length;
		int IndexOne;
		int IndexTwo;
		ArrayList<Integer[]> Subdivisions = new ArrayList<Integer[]>();
		if(length % 2 == 0) // even
		{
			IndexOne = 0;
			IndexTwo = 1;
			for(;IndexTwo < length ;)
			{
				Integer[] Nums = {-1, -1};
				Nums[0] = originalArray[IndexOne];
				Nums[1] = originalArray[IndexTwo];
				IndexOne += 2;
				IndexTwo += 2;
				Subdivisions.add(Nums);
			}
		}
		else //odd
		{
			
		}
		return Subdivisions;
		//Helps access our Subdivisions
		//System.out.println(Subdivisions.get(0));
		//System.out.println(Subdivisions);
	}
	/*ConvertTo2dArray(OriginalArray, Subdivisions)
	 * {
	 * 	Create a new array named newArray
	 at the length of the original.
	 * 	for each element in subdivisions
	 * 	{
	 * 		(Remember, each element in 
	 * 		subdivision is another array)
	 * 		at the current index, in the second dimension
	 		add the index 0 and 1 to new Array as a newArray at
	 		the current index.
	 		IE: Index 0 of Subdivisions:
	 		{[1, 5],.....}
	 		Add the 1, and 5 to newArray so it looks like this
	 		IE: Index 0
	 		[[1,5],....]
	 * 	}
	 * }
	 * */
}
