import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
class RemoveDuplicatesFromArrayList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<length;i++)
		{
		list.add(sc.nextInt());
		}

		removeDuplicates(list);
	}

	public static<T> void removeDuplicates(List<T> list)
	{
		LinkedHashSet<T> lhs = new LinkedHashSet<>(list);
		System.out.println("printing..");
		Iterator it = lhs.iterator();
		while(it.hasNext())
		{

			System.out.println(it.next());
		}

	}
}