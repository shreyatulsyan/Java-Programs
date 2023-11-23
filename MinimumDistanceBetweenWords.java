class MinimumDistanceBetweenWords
{
	public static void main(String args[])
	{
		String sentence = "the brown quick frog quick the";
		s1 = "the";
		s2 = "the";

		checkMinimumDistance(sentence,s1,s2);
	}

	public static void checkMinimumDistance(String sentence,String s1, String s2)
	{
		int[] words = sentence.split(" ");
		boolean word1found =false;
		boolean word2found = false;
		int start =0;
		int end=0;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(s1) && word1found == false)
			{
			word1found=true;
			start=i;
			}

			if(words[i].equals(s2) && word1found==true){
			word2found=true;
			end=i;
			}

			if(word1found==true && word2found==true)
			break;
		}

		System.out.println()
	}
}