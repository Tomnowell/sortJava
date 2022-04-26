/**
 * 
 */

/**
 * @author tom
 *;
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int[] testArray = {1, 5, 6, 2, 9, 4};
		for (int i: insertionSort(testArray))
		{
			System.out.print(i+", ");
		}
		
	}
	
	public static int[] insertionSort(int[] array)
	{
		int[] newArray = new int[array.length];
		
		for (int j = 1; j < array.length; j ++)
		{
			int key = array[j];
			// Insert A[j] into the sorted sequence
			
			int i = j - 1;
			
			while (i >= 0 && array[i] > key)
			{
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}
		return array;
	}

}
