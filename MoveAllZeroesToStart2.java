import java.util.Arrays;
class MoveAllZeroesToStart2
{
	public static void main(String args[])
	{
		int[] arr = {9,0,5,7,4,0,4,3,0,21,2};

		int i= arr.length-1;
		int j= arr.length-1;

		while(i>=0)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j--;
			}
			i--;
		}

		while(j>=0)
		{
			arr[j]=0;
			j--;
		}

		System.out.println(Arrays.toString(arr));
	}
}