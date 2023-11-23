class OccurenceMaximumTimes
{
	public static void main(String args[])
	{
		System.out.println(getCharacterOfMaximumOccurence("Hello World"));

	}
	static char getCharacterOfMaximumOccurence(String givenString)
	{
		int[] countOfCharacters = new int[26];
		int max =0;
		char maxChar;
		givenString= givenString.toLowerCase();

		for(char ch : givenString.toCharArray())
		{
			if(ch!=' ')
			{
				countOfCharacters[ch-'a']++;
			}
		} 

		for(int i=0;i<countOfCharacters.length;i++)
		{
			if(countOfCharacters[i]>countOfCharacters[max])
			{
				max = i;
			}
		}
		return (char)('a'+max);
	}

}