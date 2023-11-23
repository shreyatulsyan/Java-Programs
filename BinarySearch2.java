class BinarySearch2
{
	public static void main(String args[])
	{
	int[] arr = {2,3,4,5,6,7,9,10,13,14,17,19};
	System.out.println(search(arr,13));
	}
	
	public static int search(int[] arr,int value)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{	
			int mid= (i+j)/2;

			if(value>arr[mid])
			i=mid+1;

			else if(value<arr[mid])
			j=mid-1;

			else if(value==arr[mid]) 
			return mid;
		}

		return -1;
	}

}