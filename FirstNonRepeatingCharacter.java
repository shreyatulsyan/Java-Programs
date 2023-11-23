import java.util.Map;
import java.util.LinkedHashMap;
class FirstNonRepeatingCharacter
{
	public static void main(String args[])
	{
		String str = "Java";
		Map<Character,Integer> map= new LinkedHashMap<>();

		for(char ch : str.toCharArray())
		{
			map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
		}
		System.out.println(map);
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue()<2)
			{
				System.out.println(entry.getKey());
				break;
			}
		}

	}
}