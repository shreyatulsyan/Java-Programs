
import java.util.Scanner;
class Fibonacci1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();

		for(int i=0;i<number;i++)
		System.out.println(printFibonacciThroughRecursion(i));
	}
	public static void printFibonacci(int n)
	{
		int a=1;
		int b=1;
		System.out.println(a+"\n"+b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
	public static int printFibonacciThroughRecursion(int n)
	{
		if(n<=1)
			return n;

			return printFibonacciThroughRecursion(n-1)+printFibonacciThroughRecursion(n-2);

	}

}