import java.util.Arrays;
class InsertionSort
{
	public static void main(String args[])
	{
		int[] arr = {5,3,8,2,9,3,6,1,4};
		insertionSort(arr);
	}

	public static void insertionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j=0;
			for(j=i;j>0 && temp<arr[j-1];j--)	
			{
				arr[j] = arr[j-1];
			}
			arr[j]= temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}