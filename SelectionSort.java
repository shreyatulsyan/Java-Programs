import java.util.Arrays;
class SelectionSort
{
	public static void main(String args[])
	{
		int[] arr = {4,7,2,9,6,4,3,7,1};
		selectionsort(arr);

	}
	public static void selectionsort(int[] arr)
	{
		int min= 0;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;

			System.out.println(Arrays.toString(arr));
		}
	}
}