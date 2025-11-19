package javaStreamsExtended;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class PrintAllElementsInAList {
    public static void main(String args[]){
        List<Integer> listOfInt = Arrays.asList(1,2,3);
        listOfInt.stream().forEach(n -> System.out.println(n));

        //nhi aya
        Consumer<Integer> c = n->System.out.println(n);
        listOfInt.forEach(c);

    }
}

class SquareOfANumber {
    public static void main(String args[]){
        Function<Integer,Integer> f = n->n*n;
        System.out.println( f.apply(2));
    }}

class CheckIfStringStartsWithA {
    public static void main(String args[]) {
        Predicate<String> f = n -> n.startsWith("A");
        System.out.println(f.test("Ana"));
    }
}
class CountStringsWithLengthGreaterThan5 {
    public static void main(String args[]){
        List<String> list = Arrays.asList("apple", "banana", "orange");

        Predicate<String> f = n -> n.length()>5 ;
        long count = list.stream().filter(f).count();
        System.out.println(count);
    }
}
class DoubleValuesOfAList {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1, 2, 3);

        Function<Integer,Integer> f = n -> n*2 ;
        List<Integer> li = nums.stream().map(f).toList();
        System.out.println(li);
    }
}
class FilterEvenNumbers {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(1, 2, 3);

        Predicate<Integer> f = n -> n%2==0 ;
        List<Integer> li = nums.stream().filter(f).toList();
        System.out.println(li);
    }
}

//nhi aya
class SortStringsInDescendingOrder {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(5, 2, 3);
        nums.sort((a,b) -> b.compareTo(a));
        System.out.println(nums);
    }
}
//nhi aya reduce takes binary operator??
class SumOfNumbersUsingReduce {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(5, 2, 3);
        int sum = nums.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);
    }
}