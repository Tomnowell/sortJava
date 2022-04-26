/**
 * @author tom
 *
 */

import java.util.Arrays;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testArray = {5,2,4,7,1,3,2,6};
		
		mergeSort(testArray, 0, 8);
		for (int i: testArray)
		{
			System.out.print(i+", ");
		}

	}
	
	public static void mergeSort(int[] array, int start, int end)
	{
		if (start < end)
		{
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}
	
	public static void merge(int[] array, int start, int mid, int end)
	{
		
		
		int n1 = mid - start;
		int n2 = end - mid;
		
		int[] arrayLeft = new int[(n1 + 1)];
		int[] arrayRight = new int[(n2 + 1)];
		
		
		for(int i = 0; i < n1; i++)
		{
			arrayLeft[i] = array[start + i];
		}
		
		for(int j = 0; j < n2; j++)
		{
			arrayRight[j] = array[mid + j];
		}
		
		arrayLeft[n1] = 32767;
		arrayRight[n2] = 32767;
		
		int i = 0;
		int j = 0;
		
		for (int k = start; k < end; k++)
		{
			if (arrayLeft[i] <= arrayRight[j])
			{
				array[k] = arrayLeft[i];
				i++;
			}
			else
			{
				array[k] = arrayRight[j];
				j++;
			}
		}
	}

}
