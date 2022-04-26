/**
 * 
 */

/**
 * @author tom
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {8,7,1,9,11,5,6};
		snapShot(array);
		quickSort(array, 0, array.length - 1);
		snapShot(array);

	}
	
	public static void quickSort(int[] array, int start, int end)
	{
		if (start < end)
		{
			int mid = partition(array, start, end);
			quickSort(array, start, mid - 1);
			quickSort(array, mid + 1, end);
		}
		
	}
	
	public static int partition(int[] array, int start, int end)
	{
		int pivot = array[end];
		System.out.println("Pivot is: " + pivot);
		int i = start - 1;
		for (int j = start; j < end; j++) 
		{
			if(array[j] <= pivot)
			{
				i++;
				System.out.println("i is :" + i + " and j is: " +j);
				swap(array, i, j);
			}
		}
		swap(array, i + 1, end);
		snapShot(array);
		return (i + 1);
	}
	
	private static void swap(int[] array, int a, int b)
	{
		System.out.println("Swapping " + array[a] + " and " + array[b]);
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void snapShot(int[] array)
	{
		System.out.println("");
		for (int i : array)
		{
			System.out.print(i + ", ");
		}
		System.out.println("");
	}

}
