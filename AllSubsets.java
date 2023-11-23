class AllSubsets
{
	public static void main(String args[])
	{
		String str = "FUN";
		int l = str.length();
		int temp=0;
		String[] allsubsets = new String[l*(l+1)/2];
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				allsubsets[temp]=str.substring(i,j+1);
				temp++;
			}
		}

		for(int i = 0; i < allsubsets.length; i++) {  
            System.out.println(allsubsets[i]);  
        }  
	}
}