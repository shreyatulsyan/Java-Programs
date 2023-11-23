import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SegregateZeroAndOne
{
	public static void main(String args[])throws IOException
	{
		//int arr[] = {0, 1, 0, 1, 1, 1};
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

		String[] arrr = reader.readLine().split(" ");

		int arr[] = new int[arrr.length];

		for(int i=0;i<arrr.length;i++)
		{
			arr[i]=Integer.parseInt(arrr[i]);
		}
		//approach1(arr);	
		approach2(arr);	
	}

	public static void approach2(int[] arr)
	{
		int left = 0;
		int right= arr.length-1;

		while(left<right)
		{
			while(arr[left]==0 && left<right)
				left++;

			while(arr[right]==1 && left<right)
				right--;

			if(left<right)
			{
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void approach1(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			count++;
		}

		for(int i=0;i<arr.length;i++)
		{
			if(i<count)
			arr[i]=0;
			else
			arr[i]=1;
		}

		System.out.println(Arrays.toString(arr));
	}
}