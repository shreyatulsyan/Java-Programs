import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

class MaxChar
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sc = br.readLine();
		maxChar(sc);		
	}

	public static void maxChar(String givenString)
	{
		Map<Character,Integer> map = new HashMap<>();	
		for(int i=0;i<givenString.length();i++)
		{
			map.put(givenString.charAt(i),map.containsKey(givenString.charAt(i))?map.get(givenString.charAt(i))+1:1);
		}

		int max = Integer.MIN_VALUE;
		char key = 0;

		for(Map.Entry<Character,Integer> m: map.entrySet())
		{
			if(m.getValue()>max)
			{
				max = m.getValue();
				key = m.getKey();         
			}
		}
		System.out.println("Max character is " +key+ " Value: "+max);
		
	}
}