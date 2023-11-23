class LeapYear
{
	public static void main(String args[])
	{
		System.out.println(leapYear(2012));
	}

	public static boolean leapYear(int n)
	{
		return (n%400==0)||((n%4==0)&&(n%100!=0));
	}
}