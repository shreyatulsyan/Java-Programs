class ReverseArray
{
	public static void main(String [] args)
	{
		int[] arr = {2,3,4,5,6};
		for(int i=arr.length-1;i>=0;i--)
			System.out.println(arr[i]);
		int n = arr.length;
		while(n!=0)
		{
			System.out.println(arr[--n]);
		}
	}
}