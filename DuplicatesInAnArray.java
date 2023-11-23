import java.util.HashMap;
import java.util.Map;
class DuplicatesInAnArray
{
	public static void main(String args[])
	{
		usingHashMap();
		usingBruteForce();
	}
	public static void usingHashMap()
	{
		int[] arr = {1,2,3,4,2,7,8,8,3};

		Map<Integer,Integer> map = new HashMap<>();

		for(int ar : arr)
		{
			map.put(ar,map.containsKey(ar)?map.get(ar)+1:1);
		}

		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if((entry.getValue())>1)
			System.out.println(entry.getKey());
		}
	}
	public static void usingBruteForce()
	{
		int[] arr = {1,2,3,4,2,7,8,8,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}