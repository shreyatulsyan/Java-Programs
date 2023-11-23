import java.util.Arrays;
class BubbleSort4
{
	public static void main(String args[])
	{
		int arr[] ={2,5,3,8,1,2,3};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j];
				arr[j+1]= arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}