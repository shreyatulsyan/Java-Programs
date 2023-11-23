class Pattern4
{
	public static void main(String [] args)
	{
		int rows =8;
		for(int i = 1 ; i<=rows ;i++)
		{
			for(int j = rows-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k = 1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int space =1;
		for(int i = rows-1 ; i>= 1 ;i--)
		{
			for(int j = 1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			for(int k =(2*i)-1;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}