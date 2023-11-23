class FrequencyElement
{
	public static void main(String [] args)
	{
		int[] arr = {5,4,5,4,9};

		int[] frq = new int[arr.length];

		int repeat =-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					frq[j] = repeat;
				}
			}
			if(frq[i]!=repeat)
			frq[i]=count;
		}

		for(int j=0;j<frq.length;j++){
			if(frq[j]!=repeat)
		System.out.println(frq[j]);
	}

	}
}