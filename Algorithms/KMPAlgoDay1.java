import java.util.Arrays;
class KMPAlgoDay1
{
	public static void main(String args[])
	{
		String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        int[] lps = new int[pat.length()];
        
        int t=0;
        for(int p=1;p<pat.length();p++)
        {
        	if(pat.charAt(p)==pat.charAt(t))
        	{
        		lps[p]=t;
                        t++;
        	}
        	else
        	{
        		t=0;
        	}
        }

        System.out.println(Arrays.toString(lps));

        /*for(int i=0;i<txt.length;i++)
        {

        }*/
	}
}