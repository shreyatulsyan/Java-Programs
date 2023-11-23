import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class StringPallindrome
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		checkPallindrome(str);
	}

	public static void checkPallindrome(String str)
	{
			int i=0;
			int j=str.length()-1;
			boolean flag=true;
			char[] ch = str.toCharArray();
			while(i<j)
			{
				if(ch[i]!=ch[j])
				{
				flag=false;
				break;
				}
				i++;
				j--;
			}
			if(flag)
			System.out.println("String is pallindrome");
			else
			System.out.println("String is not pallindrome");
	}

}