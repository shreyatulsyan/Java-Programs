import java.util.Arrays;
class Reverse
{
	public static void main(String args[])
	{
		String expression = "2*//3";
		String regex = "[+-/*]";

		System.out.println(Arrays.toString(expression.split(regex)));
		/*int arr[] = {1,3,5,7,9,11,15,17,19,7,8};
		int left = 0;
		int right = 0;
		int k=3;

for(int i=0;i<arr.length;i=i+k)
{
	left=i;
	right=Math.min(i+k-1, arr.length - 1);
		while(left<right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] =temp;
			left++;
			right--;
		}
}

System.out.println(Arrays.toString(arr));*/
	}
}