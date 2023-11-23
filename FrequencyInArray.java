import java.util.Map;
import java.util.HashMap;

class FrequencyInArray
{
	public static void main(String args[])
	{
		occurenceOfCharacterInString("Java",'a');
	}

	public static void occurenceOfCharacterInArray()
	{
		int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
		Map<Integer,Integer> map = new HashMap<>();

		for(int element : arr)
		{
			map.put(element, map.containsKey(element)?map.get(element)+1:1);
		}

		for(Map.Entry entry : map.entrySet())
		{
			System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
		}
	}

	public static void occurenceOfCharacterInString(String str, char ch)
	{
			int count=0;
			if(str==null || str=="")
				return;
			for(char letter: str.toCharArray())
			{
				if (letter==ch)
					count++;
			}

			System.out.println(count);

	}


}