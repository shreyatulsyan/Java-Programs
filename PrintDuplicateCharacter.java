import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.StringBuilder;


class PrintDuplicateCharacter
{
	public static void main(String args[])throws IOException
	{
		File file = new File("C:\\My Folder\\My Docs\\Study Material\\Java Programs\\StringReadingFile.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String givenString = br.readLine();
		System.out.println(getCountOfCharacters(givenString));
	}

	public static String getCountOfCharacters(String givenString)
	{
			StringBuilder result = new StringBuilder();
			Map<Character,Integer> map = new LinkedHashMap<>();

			for(char letter : givenString.toCharArray())
			{
				map.put(letter, map.containsKey(letter)?map.get(letter)+1:1);
			}

			for(Map.Entry entry: map.entrySet())
			{
					result.append(entry.getKey());
					result.append(entry.getValue());
			}

			return result.toString();
	}
}