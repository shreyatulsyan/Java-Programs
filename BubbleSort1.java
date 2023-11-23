import java.util.Scanner;
import java.util.Arrays;
class BubbleSort1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] arr = new int[l];
		for(int i=0;i<l;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[i])
				{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}

			}
		}
		
	}
}