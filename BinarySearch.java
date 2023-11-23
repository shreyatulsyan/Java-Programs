class BinarySearch
{
	public static int[] a = {1,2,3,4,5,6,7,8,9};
	public static void main(String args[])
	{
		

		System.out.println(binarySearching(0,(a.length)-1,7));
	}
	public static int binarySearching(int low,int high,int key)
	{
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(a[mid]>key)
			{
				high = mid-1;
			}
			else if(a[mid]<key)
			{
				low = mid+1;
			}
			else
			{
				return mid;
			}
		}

		return -1;
	}
}