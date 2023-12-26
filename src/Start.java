import java.util.ArrayList; // import the ArrayList class
public class Start {
	public static void main(String[] args) {
		
		/*Different arrays and tests*/
		final int[] EVEN_LENGTH_ARRAY = {5,3,1,2,4,6,8,7};
		final int[] ODD_LENGTH_ARRAY = {5,3,1,2,4,6,8,7,0};
		final int[] EVEN_NUMBER_ARRAY = {4,2,6,8,10,4,10,6,2,8};
		final int[] ODD_NUMBER_ARRAY = {5,3,7,9,1,5,1,7,3,9};
		MergeSort sort = new MergeSort();
		ArrayList<Integer[]> Subdivisions = sort.Subdivide(EVEN_LENGTH_ARRAY);
		
		/*65318724
		 * SUBDIVIDE
		 *6531-8724
		 *SUBDIVIDE UNTIL
		 *ITS A SUBARRAY OF 2
		 *65-31-87-24
		 *SWAP THEM
		 *56-13-78-24
		 *ORGANIZE
		 *1356-2478
		 *ORGANIZE AGAIN
		 *56137824
		 * */
	}
}
