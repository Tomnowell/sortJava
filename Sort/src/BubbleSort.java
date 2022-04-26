/**
 * 
 */

/**
 * @author tom
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] array = {2,3,8,6,1};
		
		bubbleSort(array);
		
		for(int i : array)
		{
			System.out.print(i + ", ");
		}

	}
	
	public static void bubbleSort(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = array.length - 1; j > i; j--)
			{
				if (array[j] < array[j - 1])
				{
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

}
