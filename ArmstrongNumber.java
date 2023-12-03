class ArmstrongNumber
{
	public static void main(String args[])
	{
		checkArmstrong(153);
	}
	public static void checkArmstrong(int temp)
	{
		double sum=0;
		int n=temp;
		int[] arr = new int[]{-1,-1};
		while(n>0)
		{
			int digit = n%10;
			sum= sum + Math.pow(digit,3);
			n=n/10;
		}
		if(sum==temp)
		System.out.println("Armstrong");
		else
		System.out.println("Not Armstrong");
	}

}