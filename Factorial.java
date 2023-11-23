class Factorial
{
	public static void main(String [] args)
	{
		int n=5;int prod =1;
		for(int i=n;i>=1;i--)
		{
			prod *= i;
		}
		System.out.print("Factorial of " + n + " is " + prod);
	}
}