class Pattern7
{
	public static void main(String [] args)
	{
		int rows =8;

		for(int i = 1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1;i<=rows;i++)
		{
			for(int j=rows-i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}