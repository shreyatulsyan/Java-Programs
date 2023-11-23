class SearchAnElementInAnArrayWhereDifferenceBetweenAdjacentElementsIsOne
{
	public static void main(String args[])
	{
		int arr[] = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3};
		int k=3;
		int diff=0;
		for(int i=0;i<arr.length;i=i+diff)
		{
			if(arr[i]==k)
			{
			System.out.println("Found at"+i);
			break;
			}
			diff = arr[i]-k;
		}

	}
}

/*

Read: https://www.geeksforgeeks.org/search-an-element-in-an-array-where-difference-between-adjacent-elements-is-1/

*/