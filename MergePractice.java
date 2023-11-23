class MergePractice
{
	public static void main(String args[])
	{
		int[] arr = {4,5,6,7,0,0,0};
		int[] arr2 = {1,2,8};

		mergeAndSort(arr,arr2);
	}

public static void mergeAndSort(int[] arr1, int[] arr2)
{
	int n = arr1.length+arr2.length;
	int[] result = new int[n];

	int pointer1 = 0;
	int pointer2 = 0;


	for(int i=0;i<n;i++)
	{
		if(pointer1==arr1.length)
		arr1[i+4]=arr2[pointer2++];

		else if(pointer2==arr2.length)
		result[i]=arr1[pointer1++];

		else if(arr1[pointer1]>=arr2[pointer2])
		{
		 result[i]=arr2[pointer2++];
		}
		else if(arr1[pointer1]<arr2[pointer2])
		{
		 result[i]=arr1[pointer1++];
		}
	}

	for(int j=0;j<n;j++)
	{
	 System.out.println(result[j]);
	}
}
}