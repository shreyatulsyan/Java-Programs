import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;

class RemoveDuplicatesFromArray
{
	public static void main(String args[])
	{
		List<Integer> numbers = new ArrayList<>(Arrays.asList(3,4,5,5,7,7,2,1));

		System.out.println("Before"+numbers);

		Set<Integer> set = new LinkedHashSet<Integer>(numbers);

		numbers.clear();

		numbers.addAll(set);

		System.out.println("After"+numbers);
	}
}