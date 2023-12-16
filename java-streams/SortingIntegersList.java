import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingIntegersList {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 5, 1, 2, 3, 5);
        // Sort ascending
        System.out.println("Sorted ascending: ");
        var sortedListAsc = nums.stream()
            .sorted()
            .collect(Collectors.toList());
        
        // List has exposed a forEach method directly.
        sortedListAsc.forEach(System.out::println);

        // Sort descending
        System.out.println("Sorted descending: ");
        nums.stream()
            .sorted(Collections.reverseOrder())
            .forEach(System.out::println);
    }
}
