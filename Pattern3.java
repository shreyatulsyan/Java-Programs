class Pattern3
{
	public static void main(String [] args)
	{
		int rows = 5;
		int j =0;

		for(int i=0; i < rows; i++)
		{
			for(j=rows-1;j>i; j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}