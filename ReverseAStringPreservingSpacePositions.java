class ReverseAStringPreservingSpacePositions
{
	public static void main(String args[])
	{
		reverseAStringPreservingSpacePositions("Java is a programming language");
	}
	public static void reverseAStringPreservingSpacePositions(String str)
	{
		char[] ch= str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			while(ch[i]==' ')
			i++;

			while(ch[j]==' ')
			j--;

			char temp= ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;

		}
		System.out.println(new String(ch));
	}


}