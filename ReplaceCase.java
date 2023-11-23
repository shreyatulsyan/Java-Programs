class ReplaceCase
{
	public static void main(String args[])
	{
		String word= "HeLLo";

		char[] words = word.toCharArray();

		for(int i =0;i<words.length;i++)
		{
			if(Character.isUpperCase(words[i]))
			{
				words[i]=Character.toLowerCase(words[i]);
			}
			else
			{				
				words[i]=Character.toUpperCase(words[i]);
			}
		}

		System.out.println(String.valueOf(words));

	}
}