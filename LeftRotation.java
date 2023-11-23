class LeftRotation
{
	public static void main(String [] args)
	{
		int n=3;
		int[] arr = {1,2,3,4,5};

		for(int i=0;i<n;i++)
		{
			int first = arr[0];
			int j;
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];

			}
			arr[j] = first;
		}

		for(int k = 0;k<arr.length;k++)
		{
			System.out.println(arr[k]+" ");
		}
	}
}