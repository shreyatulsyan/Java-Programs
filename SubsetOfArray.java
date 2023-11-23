import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

class SubsetOfArray
{
	public static void main(String args[])
	{
		int[] arr1={ 3, 5, 7, 12, 1, 9, 10, 0, 2 };
		int[] arr2 = { 1, 3, 5, 9 };
		System.out.println(approach1(arr1,arr2));
	}

	public static int approach1(int[] arr1, int[] arr2)
	{
		Set<Integer> set = new HashSet<>();
		for(int number : arr1)
		{
			set.add(number);
		}

		for(int number : arr2)
		{
			if(!set.contains(number))
			{
				return -1;
			}
		}

		return 1;
	}
}