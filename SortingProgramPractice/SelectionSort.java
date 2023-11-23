import java.util.Arrays;
class SelectionSort
{
	public static void main(String args[])
	{
		int[] arr = {4,6,3,8,2,9};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
