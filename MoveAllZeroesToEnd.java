import java.util.Arrays;
class MoveAllZeroesToEnd
{
	public static void main(String args[])
	{
		int[] arr= {2,5,0,4,2,7,0,0,1,9,4};

		moveAllZeroToEnd(arr);
	}
	public static void moveAllZeroToEnd(int[] arr)
	{
		int i=0;
		int j=0;

		while(i<arr.length)
		{
			if(arr[i]!=0)
			{
			arr[j]=arr[i];
			j++;
			}
			i++;
		}
		while(j<arr.length)
		{
			arr[j]=0;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

}