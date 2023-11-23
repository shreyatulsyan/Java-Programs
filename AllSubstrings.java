class AllSubstrings
{
	public static void main(String args[])
	{
		getAllSubstrings("abcd");
	}

	public static void getAllSubstrings(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<=str.length();j++)
			{
					System.out.println(str.substring(i,j));
			}
		}
	}

}