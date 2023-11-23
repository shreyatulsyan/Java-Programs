import java.util.Arrays;
class PracticeAllSorting
{
	public static void main(String args[])
	{
		int[] arr ={6,3,8,4,7,3,1,8};
		//bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		//mergeSort(arr,0,arr.length-1);
		//System.out.println("With mergeSort: " + Arrays.toString(arr));	
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}

			}
		}
		System.out.println("With bubbleSort: " + Arrays.toString(arr));
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void selectionSort(int[] arr)
	{
		int min;
		for(int i=0;i<arr.length;i++)
		{
			min = i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println("With SelectionSort: " + Arrays.toString(arr));
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void insertionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i;
			while(j>0 && temp<arr[j-1])
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println("With insertionSort: " + Arrays.toString(arr));
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////
	public static void mergeSort(int arr[],int start,int end)
	{ 
		if(start<end)
		{
			int mid = (start+end)/2;
			mergeSort(arr, start , mid);
			mergeSort(arr, mid+1 , end);
			merge(arr,start,end,mid);
		}
	}

	public static void merge(int[] arr,int start,int end, int mid)
	{
		int p=start;
		int q=mid+1;
		int[] A = new int [end-start+1];
		int k=0;
		for(int i=start;i<=end;i++)
		{
			if(p>mid)
				A[k++] = arr[q++];
			else if(q>end)
				A[k++] = arr[p++];
			else if(arr[p]>arr[q])
				A[k++] = arr[q++];
			else
				A[k++] = arr[p++];
		}
		for(int l=0;l<k;l++)
		{
			arr[start++] = A[l];
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////


}