class BinarySearch3
{
	public static void main(String args[])
	{
		int[] arr = {2,3,4,5,6,7,8};
		binarySearch(arr, 7);
	}

	public static void binarySearch(int[] arr,int n)
	{
		int start =0;
		int end = arr.length-1;
		
		while(start<end)
		{
			int mid= (start+end)/2;
			if(n>arr[mid])
			{
				start=mid+1;
			}
			else if(n<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				System.out.println("Found at" + mid);
				break;
			}

		}
	}
}