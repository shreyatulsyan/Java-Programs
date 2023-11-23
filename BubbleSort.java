import java.util.Arrays;
class BubbleSort
{
	public static void main(String args[])
	{
		int[] arr = {3,5,2,7,4,9,5,2,9,1};
		bubbleSort(arr);
	}
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}