class Searching
{
	public static void main(String args[])
	{
		int[] arr = {5,7,3,6,2,8,3,7,3};
		linearSearch(arr, 7);
		int[] arr2 = {4,6,7,9,10,34,56,67,89};
		binarySearch(arr2,10);
	}

	public static void linearSearch(int[] arr, int item)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(item == arr[i])
			{
				System.out.println("Linear search - Found at " + i);
				break;
			}
		}
	}
	public static void binarySearch(int[] arr,int item)
	{
		int start=0;
		int end=arr.length;

		while(start<end)
		{
			int mid = (start+end)/2;
			if(item<arr[mid])
			{
				end=mid-1;
			}
			else if(item>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				System.out.println("Binary Search - Found at " + mid);
				break;
			}
		}
	}
}