class BinarySearch1
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(binarySearch(arr,3));
	}

	public static int binarySearch(int[] arr,int k)
	{
		int left = arr[0];
		int right = arr.length-1;

		while(left<=right){
			int mid = (left+right)/2;

			if(arr[mid]>k)
			{
				right = mid-1;
			}
			else if(arr[mid]<k)
			{
				left = mid+1;
			}
			else
			{
				return mid;
			}

		}

		return -1;
		
	}
}