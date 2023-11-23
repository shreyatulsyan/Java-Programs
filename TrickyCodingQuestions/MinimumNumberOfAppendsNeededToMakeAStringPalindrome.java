class MinimumNumberOfAppendsNeededToMakeAStringPalindrome
{
	public static void main(String args[])
	{
		String str = "abede";
		for(int k=0;k<str.length();k++)
		{
			if(isPallindrome(str.substring(k)))
			{
				System.out.println(k);
				break;
			}
		}

	}
	public static boolean isPallindrome(String str)
	{
		return str.equals(reverse(str));
	}
	public static String reverse(String str)
	{
		char[] arr = str.toCharArray();
		int i=0;
		int j=arr.length-1;

		while(i<j)
		{
			char temp = arr[i];
			arr[i] = arr[j]; 
			arr[j] = temp;
			i++;
			j--;
		}

		return new String(arr);
	}
}
















/*

https://www.geeksforgeeks.org/minimum-number-appends-needed-make-string-palindrome/

*/