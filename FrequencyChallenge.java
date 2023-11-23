class FrequencyChallenge
{
	public static void main(String[] args)
	{
		int[] arr = {0,4,6,8,4,4,4,6,6,2,4};
		int[] frq = new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			int count = 1;
			int j;
			for(j =i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					frq[j]=-1;
				}
			}
			if(frq[i]!=-1)
			{
				frq[i]=count;
			}
		}
		for(int j=0;j<frq.length;j++){
		System.out.println(frq[j]);
	}

	}
}