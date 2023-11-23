class LeftRightEqual
{
	public static void main(String args[])
	{
		int[] arr ={1,0,1,12,-2,-8}; //sum=4 3 2

										//left 1 2

			int n = getNumbers(arr);
			if(n!=-1)
			{
				for(int i=0;i<arr.length;i++)
				{
					if(i<=n)
					System.out.print("Left : " + arr[i]+ "\n");

					else
					System.out.print("Right : " + arr[i] + "\n");
				}
			}


	}
	public static int getNumbers(int[] arr)
	{
		int sum=0;
		int left=0;

		for(int i =0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		for(int i =0;i<arr.length;i++)
		{
			sum=sum-arr[i];
			left = left+arr[i];

			if(left==sum)
			return i;
		}

		return -1;

	}
}