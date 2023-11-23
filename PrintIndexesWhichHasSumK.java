import java.util.Arrays;
class PrintIndexesWhichHasSumK
{
	//https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
	public static void main(String args[])
	{
		twoPointerTechnique();
	}

	public static void bruteForce()
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};

		int sum=10;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i] +" "+ arr[j]);
				}
			}
		}
	}
	public static void twoPointerTechnique()
	{
		int arr[] = {1, 4, 45, 6, 10, -8};

		int sum =16;

		Arrays.sort(arr);

		int i=0;
		int j=arr.length-1;

		while(i<j)
		{
			if(arr[i]+arr[j]>sum)
			{
				j--;
			}
			else if(arr[i]+arr[j]<sum)
			{
				i++;
			}
			else
			{
				System.out.println(arr[i] +" "+ arr[j]);
				i++;
				j--;
			}
		}
	}
}