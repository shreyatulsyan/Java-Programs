class Armstrong{
	public static void main(String [] args)
	{
		int n = 153;
		int arm=0;
		int a=0;
		int temp = n;

		while (n>0)
		{
			a = n % 10; //3 //5
			arm = arm + (a*a*a); //27 + 125
			n = n/10; //15 
		}

		if(temp==arm)
		{
			System.out.println(temp + " is armstrong number.");
		}
		else
		{
			System.out.println(temp + " is not armstrong number.");
		}
	}

}