import java.util.Arrays;
class BubbleSort3
{
	public static void main(String args[])
	{
		int[] arr = {6,3,4,4,5,6};

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}