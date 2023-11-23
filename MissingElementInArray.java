import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

class MissingElementInArray
{
	public static void main(String args[])
	{
		Integer[] arr1 = {1,2,3,4,5,6};
		Integer[] arr2 = {1,2,3,5,6,7,8,9};

		int [] arr;

		if(arr1.length > arr2.length) {

			//checkDifference(arr1, arr2);
			approach2(arr1,arr2);
		}
		else {
			//checkDifference(arr2, arr1);
			approach2(arr2,arr1);

		}
	}

	public static void checkDifference(int[] arr1,int[] arr2)
	{
	boolean flag=false;
		for(int i = 0;i<arr1.length;i++)
		{
			flag=false;
			for(int j=0;j<arr2.length;j++)
			{
					if(arr1[i]==arr2[j])
					{
					flag=true;
					break;
					}
			}
			if(!flag)
			System.out.println(arr1[i]);
		}
	}

	public static void approach2(Integer[] arr1,Integer[] arr2)
	{
		List<Integer> li = Arrays.asList(arr1);
		Set<Integer> set1 = new HashSet<>(li);
		set1.removeAll(Arrays.asList(arr2));

		for(int i : set1)
		{
			System.out.println(i);
		}


	}
}