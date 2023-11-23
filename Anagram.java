import java.util.Arrays;
class Anagram
{
	public static void main(String args[])
	{
		String str1 = "listen";
		String str2 = "silent";	
		System.out.println(checkAnagram(str1,str2));
	}

	public static boolean checkAnagram(String str1, String str2)
	{
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);

		return new String(strArray1).equals(new String(strArray2));
	}
}