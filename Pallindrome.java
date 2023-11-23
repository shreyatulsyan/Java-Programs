class Pallindrome
{
	public static void main(String [] args)
	{
		int n = 121;
		int temp = n;
		int rev; int sum =0;

		while(temp>0)
		{
			rev = temp % 10;
			sum = (sum * 10) + rev;
			temp = temp/10;
		}

		if(n == sum)
		{
			System.out.println(n + " is pallindrome number.");
		}
		else
		{
			System.out.println(n + " is not pallindrome number.");
		}
	}
}