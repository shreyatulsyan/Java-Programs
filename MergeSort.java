import java.util.Arrays;
class MergeSort
{
	public static void main(String args[])
	{
		int[] arr = {5,3,8,2,9,3,6,1,4};
		mergeSort(arr,0,arr.length-1);
	}
	public static void mergeSort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(arr,start,mid-1);
			mergeSort(arr,mid+1,end);
			merge(arr,start,end,mid);
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void merge(int[] arr, int start,int end,int mid)
	{
		int p = start;
		int q = mid+1;
		int k=0;
		int[] newarr = new int[end-start+1];
		for(int i=start;i<=end;i++)
		{
			if(p>mid)
			newarr[k++]= arr[q++];

			else if(q>end)
			newarr[k++] = arr[p++];		

			else if(arr[p]<arr[q])
			newarr[k++] = arr[p++];

			else
			newarr[k++] = arr[q++];
		}

		for(int t=0;t<k;t++)
		{
			arr[start++]=newarr[t];
		}
	}
}