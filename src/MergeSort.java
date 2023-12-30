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
public void findSmallestNum(ArrayList<Integer> FindSmallest, int Num1, int Num2, int Num3)
{
	int indexOne = FindSmallest.indexOf(Num1);
	int indexTwo = FindSmallest.indexOf(Num2);
	int indexThree = FindSmallest.indexOf(Num3);
	if(indexOne > -1 && indexTwo > -1 && indexThree > -1)
	{
	FindSmallest.remove(indexOne);
	indexTwo = FindSmallest.indexOf(Num2);
	FindSmallest.remove(indexTwo);
	indexThree = FindSmallest.indexOf(Num3);
	FindSmallest.remove(indexThree);
	}
}
	public int[][] JoinArrays(int[][] Subdivisions) {
		ArrayList<Integer> FirstHalf = new ArrayList<Integer>();
		// Get the length
		int length = Subdivisions.length;
		if (length % 2 == 0) {
			// F, I, F, O
			// [3,5][1,2]
			// F
			int firstIntFirstArray = Subdivisions[0][0];
			// I
			int SecondIntFirstArray = Subdivisions[0][1];
			// F
			int firstIntSecondArray = Subdivisions[1][0];
			// O
			int SecondIntSecondArray = Subdivisions[1][1];
			ArrayList<Integer> FindSmallest = new ArrayList<Integer>();
			FindSmallest.add(firstIntFirstArray); // index 0
			FindSmallest.add(SecondIntFirstArray);// index 1
			FindSmallest.add(firstIntSecondArray);// index 2
			FindSmallest.add(SecondIntSecondArray);// index 3
			// Empty find smallest
			while (FindSmallest.size() > 1) {
				/*
				 * Comments Descriptions The capital letter is the left hand, The lower letter
				 * is the right hand
				 */
				// F-f-
				if (firstIntFirstArray <= firstIntSecondArray) {
					// F--o
					if (firstIntFirstArray <= SecondIntSecondArray) {
						int index = FindSmallest.indexOf(SecondIntSecondArray);
						if (index > -1)
						{
						FindSmallest.remove(index);
						}
					}
				}
				// f-F-
				if (firstIntSecondArray <= firstIntFirstArray) {
					// -iF-
					if (firstIntSecondArray <= SecondIntFirstArray) {
						// in [3,5],[1,2]
						// 5,2,3 should be removed
						findSmallestNum(FindSmallest, firstIntFirstArray,
								SecondIntFirstArray, SecondIntSecondArray);
						System.out.print(FindSmallest);
					}
				}
			}

		}
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
