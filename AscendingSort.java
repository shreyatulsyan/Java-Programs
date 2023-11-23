class AscendingSort
{
	public static void main(String [] args)
	{
		int temp =0;
		int arr[] ={5,2,8,7,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);
	}
}