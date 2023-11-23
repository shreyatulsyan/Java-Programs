import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PallindromeNumber
{
	//585
	public static void main(String args[]) throws IOException
	{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int number = Integer.parseInt(br.readLine());
	 System.out.println(checkReverse(number)==number);
	}

	public static int checkReverse(int n)
	{
		int newNum=0;

		while(n>0)
		{
			newNum=newNum*10 + n%10;
			n=n/10;
		}

		return newNum;
	}
}