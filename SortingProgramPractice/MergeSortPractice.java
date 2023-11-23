import java.util.Arrays;
class MergeSortPractice
{
	public static void main(String args[])
	{
		int[] arr = {5,7,8,2,4};
		merge(0,arr.length-1,arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void merge(int low,int high,int[]arr)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			merge(low,mid,arr);
			merge(mid+1,high,arr);
			merged(low,mid,high, arr);
		}
	}

	public static void merged(int low, int mid,int high, int[] arr)
	{
		int start = low;
		int end = mid+1;

		int[] arr1 = new int[high-low+1];
		int k=0;

		for(int i = low; i<=high; i++)
		{
			if(start>mid)
			{
				arr1[k++]= arr[end++];
			}
			else if(end>high)
			{
				arr1[k++]= arr[start++];
			}
			else if(arr[start]>arr[end])
			{
				arr1[k++] = arr[end++];
			}
			else
			{
				arr1[k++] = arr[start++];
			}
		}

		for(int t=0;t<k;t++)
		{
			arr[low++] = arr1[t];
		}
	}
}