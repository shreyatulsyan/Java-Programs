class LargestElement
{
	public static void main(String [] args)
	{
		int[] arr={9,4,5,6,6,6,7,8,9,12,34,52,12};
		int largest = arr[0];
		for(int i=1;i<arr.length;i++)
		{
				if(largest<arr[i])
				{
					largest=arr[i];
				}
			
		}
		System.out.println(largest);
	}
}