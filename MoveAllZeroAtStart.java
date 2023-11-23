import java.util.Arrays;
class MoveAllZeroAtStart
{
	public static void main(String args[])
	{
		int[] arr = {9,0,5,7,4,0,4,3,0,21,2};
		//0,0,0,9,5,7
		moveAllZero(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void moveAllZero(int[] arr)
	{
		int k=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				arr[k--]=arr[i];
			}
		}
		for(int i=k;i>=0;i--)
		{
			arr[i]=0;
		}
	}
}
