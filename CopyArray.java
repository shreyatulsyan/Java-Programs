class CopyArray
{
	public static void main(String [] args)
	{
		int[] arr = new int[2];
		arr[0] = 6;
		arr[1] = 5;

		int[] arr2 = new int[arr.length];
		int i=0;
		while(i<arr.length)
		{
			arr2[i] = arr[i];
			i++;
		}
		for(int j=0;j<arr2.length;j++)
		System.out.println(arr2[j]);

	}
}