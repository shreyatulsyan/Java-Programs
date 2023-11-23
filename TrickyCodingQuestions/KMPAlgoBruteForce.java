class KMPAlgoBruteForce
{
	public static void main(String args[])
	{
		String txt = "ABABDABACDABABCABABABABCABAB";
        String pat = "ABABCABAB";
        brteForce(txt,pat);

	}
	public static void brteForce(String txt, String pat)
	{
		int j=0;
		int start = 0;
		int found=0;

		for(int i=start;i<txt.length();i++)
		{

			if(j<pat.length() && txt.charAt(i)==(pat.charAt(j)))
			{
				if(j==pat.length()-1)
				{
					System.out.println("found" + i);
				 	found++;
				 	start++;
					j=0;
					continue;
				}
				
				j++;
			}
			else
			{
				start++;
				j=0;
			}

		}

		System.out.println(found);
	}
}