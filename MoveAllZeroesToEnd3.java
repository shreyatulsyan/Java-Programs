import java.util.Arrays;
class MoveAllZeroesToEnd3
{
	public static void main(String args[])
	{
		int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		int j=0;
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		while(j<arr.length)
		{
			arr[j]=0;
			j++;
		}

		System.out.println(Arrays.toString(arr));

	}
}