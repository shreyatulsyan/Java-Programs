class ReverseWithoutSpecialCharacters
{
	public static void main(String [] args)
	{
		String str = "Ab,c,de!$";
		int i=0;
		int j=str.length()-1;
		char[] charOfStr = str.toCharArray();

		while(i<j)
		{
			while(!Character.isAlphabetic(charOfStr[i]))
			{
				i++;
			}
			while(!Character.isAlphabetic(charOfStr[j]))
			{
				j--;
			}

			char temp = charOfStr[i];
			charOfStr[i] = charOfStr[j];
			charOfStr[j] = temp;


			i++;
			j--;

		}

		System.out.println(String.valueOf(charOfStr));
	}
}