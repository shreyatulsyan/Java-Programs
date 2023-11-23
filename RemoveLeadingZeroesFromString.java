import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
class RemoveLeadingZeroesFromString
{
	public static void main(String args[]) throws IOException
	{
			File file = new File("D:\\My Docs\\Study Material\\Java Programs\\Stringfile.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String givenString = br.readLine();
			System.out.println(removeLeadingZeroesFromStringMethod2(givenString));
	}
	public static String removeLeadingZeroesFromStringMethod1(String str)
	{
			return str.replace("0","");
	}
	public static String removeLeadingZeroesFromStringMethod2(String str)
	{
			int i=0;
			while(i<str.length() && str.charAt(i)=='0')
				i++;

			StringBuffer sb = new StringBuffer(str);
			sb.replace(0,i,"");

			return sb.toString();
	}


}