class Pattern8
{
	public static void main(String args[])
	{
		int n = 1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(n);
				System.out.print(" ");
				n++;
			}
			System.out.println();
		}
	}
}