import java.util.LinkedHashMap;
import java.util.Map;
class CountOccurrencesOfCharacter
{
	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		Map<Character,Integer> map = new LinkedHashMap<>();

		for(char eachChar : str.toCharArray())
		{
			map.put(eachChar,map.containsKey(eachChar)?map.get(eachChar)+1:1);
		}

		for(Map.Entry entry: map.entrySet())
		{
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}

	}
}