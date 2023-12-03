package SortingProgramPractice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
class MergeSort
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().trim().split("\\s+");
		int[] a = new int[n];
		for(int i=0;i<str.length;i++)
		{
			a[i]=Integer.parseInt(str[i]);
		}

		mergeSort(a,0,a.length-1);

	}

	public static void mergeSort(int[] a,int start,int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);

		}
	}

	public static void merge(int[] a,int start,int mid,int end)
	{
		int p=start;
		int q= mid+1;
		int k=0;
		int newArray[]= new int[end-start+1];
		for(int i=start;i<=end;i++)
		{
			if(p>mid)
			{
				newArray[k++]=a[q++];
			}
			else if(q>end)
			{
				newArray[k++]=a[p++];
			}
			else if(a[q]>a[p])
			{
				newArray[k++]=a[p++];
			}
			else 
			{
				newArray[k++]=a[q++];
			}
		}

		for(int t=0;t<k;t++)
		{
			a[start++]= newArray[t];
		}
		System.out.println(Arrays.toString(a));

	}
}