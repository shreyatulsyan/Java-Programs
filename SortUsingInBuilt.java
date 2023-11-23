import java.util.Arrays;
class SortUsingInBuilt
{
	public static void main(String args[])
	{
		String s = "Selenium";
		char c[]= s.toLowerCase().toCharArray();
		Arrays.sort(c);
		System.out.println(new String(c));
	}
}