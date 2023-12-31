package StringQuestions;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElementsinAnArray
{
	public static void main(String args[])
	{
		String[] arr = {"Amazon", "GCP", "Azure", "Amazon","Ali Baba", "SauceLabs","Azure","GCP"};
		//approach1(arr);
		//approach2(arr);
		//approach4(arr);
		practice(arr);
	}

	public static void approach1(String[] arr)
	{
		System.out.println("********Brute Force*********");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				System.out.println(arr[i]);
			}
		}
	}

	public static void approach2(String[] arr)
	{
		System.out.println("*********Using Hash Set**********");
		Set<String> set = new HashSet<>();

		for(String a : arr)
		{
			if(!set.add(a))
				System.out.println(a);
		}
	}

	public static void approach3(String[] arr)
	{
		System.out.println("*********Using Hash Map**********");
		Map<String,Integer> map = new HashMap<>();
		for(String word : arr)
			map.put(word,map.containsKey(word)?map.get(word)+1:1);

		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			if(entry.getValue()==2)
				System.out.println(entry.getKey());
		}
	}

	public static void approach4(String[] arr)
	{
		System.out.println("*********Using Streams**********");
		Set<String> set = new HashSet<>();
		Set<String> setdup = Arrays.asList(arr).stream().filter(e -> !set.add(e)).collect(Collectors.toSet());
		System.out.println(setdup);
	}

	public static void practice(String[] arr){
		HashMap<String,Integer> map = new HashMap<>();

		for(String s : arr){
			map.put(s,(map.getOrDefault(s,0))+1);
		}

		for(Map.Entry<String,Integer> e : map.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

	}
}