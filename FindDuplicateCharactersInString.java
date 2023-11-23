import java.util.Map;
import java.util.HashMap;
class FindDuplicateCharactersInString
{
	public static void main(String args[])
	{
			findDuplicateChars("programming");
	}

	public static void findDuplicateChars(String str)
	{
		Map<Character,Integer> map = new HashMap<>();
		char[] arrayOfCharacters= str.toCharArray();
		for(char letter: arrayOfCharacters)
		{
			map.put(letter,(map.containsKey(letter)?map.get(letter)+1:1));
		}

		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
			if(entry.getValue() > 1)
			{
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
			}
		}
	}
}