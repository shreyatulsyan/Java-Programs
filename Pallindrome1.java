class Pallindrome1
{
	public static void main(String args[])
	{
		int number = 1221;
		System.out.println(number==reverse(number));


	}
	public static int reverse(int n)
	{
		int rev = 0;
		int temp =n;

		while(temp>0)
		{
			rev = rev*10 + temp%10;
			temp=temp/10;
		}

		return rev;
	}
}