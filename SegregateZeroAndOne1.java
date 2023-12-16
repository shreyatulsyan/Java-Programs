import java.util.Arrays;
class SegregateZeroAndOne1
{
	public static void main(String args[])
	{
		int[] arr = {0,1,1,1,0,0,1,1,0,0,0,0,1,0,1};
		segregateZeroAndOne(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void segregateZeroAndOne(int[] arr)
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			while(arr[left] != 1)
			left++;

			while(arr[right] !=0)
			right--;

			if(left<right)
			{
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
	}
}