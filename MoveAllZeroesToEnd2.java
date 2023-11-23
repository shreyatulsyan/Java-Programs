import java.util.Arrays;
class MoveAllZeroesToEnd2
{
	public static void main(String args[])
	{
		int[] arr= {2,5,0,4,2,7,0,0,1,9,4};
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			    arr[j]= arr[i];
				j++;
			}
		}
		for(int k=j;k<arr.length;k++)
		{
			arr[k]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}