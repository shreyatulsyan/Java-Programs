import java.util.Arrays;
class Segregate
{
	public static void main(String args[])
	{
			int arr[] = {0, 1, 0, 1, 1, 1};
			int i=0;
			int j=arr.length-1;
			while(i<j)
			{
				while(arr[i]!=1 && i<j)
				{
					i++;
				}
				while(arr[j]!=0 && i<j)
				{
					j--;
				}

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

			System.out.println(Arrays.toString(arr));

	}

}