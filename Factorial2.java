class Factorial2
{
	public static void main(String args[])
	{
		int givenNumber = 7;
		System.out.println(findFactorial(givenNumber));
	}
	public static int findFactorial(int n)
	{
		if(n<2)
		return n;

		return n*findFactorial(n-1);
	}
}
