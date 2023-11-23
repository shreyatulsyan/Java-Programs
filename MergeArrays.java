import java.util.Arrays;
class MergeArrays
{
	public static void main(String args[])
	{
		int a[] = {1,3,2,5,4};
		int b[]=  {7,6,9,8,10};

		int c[] = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int l = a.length;
		for(int i=0;i<b.length;i++)
		{
			c[l++]=b[i];
		}

		System.out.println(Arrays.toString(c));

		//USING PREDEFINED FUNCTION SYSTEM.ARRAYCOPY

		int al = a.length;
		int bl= b.length;

		int c1[] = new int[a.length+b.length];
		

		System.arraycopy(a,0,c1,0,al);
		System.arraycopy(b,0,c1,al,bl);

		System.out.println(Arrays.toString(c1));

	}
}