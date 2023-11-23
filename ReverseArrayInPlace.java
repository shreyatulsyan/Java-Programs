class ReverseArrayInPlace
{
	public static void main(String args[])
	{
		int[] array = {5,3,2,7,3,9};

		int[] newarray = reverse(array);
		for(int num : newarray)
		{
			System.out.println(num);
		}

	}

	public static int[] reverse(int[] array)
	{
		int i=0;
		int j=array.length-1;

		while(i<j)
		{
			int temp = array[i];
			array[i] = array[j];
			array[j] =temp;
			i++;
			j--;
		}

		return array;

	}
}