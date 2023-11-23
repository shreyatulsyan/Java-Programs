import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


class DuplicateStrings
{
	public static void findDuplicateWords(String sc)
	{
		sc=sc.toLowerCase();
		String[] s = sc.split(" ");
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String word:s)
		{
			map.put(word,map.containsKey(word)?map.get(word)+1:1);
		}

		for(Map.Entry<String,Integer> e : map.entrySet())
		{
			if(e.getValue()>1)
				System.out.println("Duplicate word is : " + e.getKey() +" appearing " + e.getValue() + " times.");
		}
	}

	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String givenString = br.readLine();
		findDuplicateWords(givenString);
	}
	
}