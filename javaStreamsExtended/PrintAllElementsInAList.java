package javaStreamsExtended;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

class PrintAllElementsInAList {
    public static void main(String args[]){
        List<Integer> listOfInt = Arrays.asList(1,2,3);
        listOfInt.stream().forEach(n -> System.out.println(n));

        //nhi aya: aa gya
        Consumer<Integer> c = n->System.out.println(n);
        listOfInt.forEach(c);

        // real world example
        var emp1 = new Employee(5000, "Shreya");
        var emp2 = new Employee(2000, "Prateek");
        var emp3 = new Employee(3000, "Mini");

//        var emplList = List.of(emp1, emp2, emp3);
        var emplList = new ArrayList<Employee>();
        emplList.add(emp1);
        emplList.add(emp2);
        emplList.add(emp3);

        System.out.println("Before increment: " + emplList);

        // plain java
        for (var emp: emplList) {
            emp.setSalary(emp.getSalary() + 500);
        }
        System.out.println("After increment using plain java: " + emplList);

        // use forEach
        emplList.forEach(emp -> emp.setSalary(emp.getSalary() + 500));
        System.out.println("After increment using forEach java: " + emplList);
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

//nhi aya: ho gaya
class FindFirstStringStartingWithA{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ravi", "Amit", "Raj", "Aman");
        Optional<String> res = list.stream().filter(n->n.startsWith("A")).findFirst();
        res.ifPresentOrElse(System.out::println, () -> System.out.println("No names starting with A"));

        Optional<String> res2 = list.stream().filter(n->n.startsWith("Z")).findFirst();
        res2.ifPresentOrElse(System.out::println, () -> System.out.println("No names starting with Z"));
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

class Printlengthsofeachstringinalist{
    public static void main(String args[]){
        List<String> countries = Arrays.asList("India","USA", "Vietnam");
        Function<String,Integer> f  = n -> n.length();
        countries.stream().map(f).forEach(System.out::println);
    }
}

class Printlengthsofeachstringinalist2{
    public static void main(String args[]){
        List<String> countries = Arrays.asList("India","USA", "Vietnam");
        countries.forEach(n -> System.out.println(n.length()));

        //Sort a list of strings using lambda
        List<String> items = Arrays.asList("Banana", "Apple", "Mango");
        items.sort((a, b) -> a.compareTo(b));

    }
}
class Convertlistofstringstouppercase{
    public static void main(String args[]) {
        List<String> list = Arrays.asList("java", "lambda", "code");
        list.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
    }
}
class Sumallnumbersinalist{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        //Using reduce
        int sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
class FindMaximumNumberUsingLambda{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println(sum);
    }
}
class Countelementsgreaterthan50{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(30,60,90,80);
        long sum = list.stream().filter(n->n>80).count();
        System.out.println(sum);
    }
}
class RemoveDuplicatesusinglambda{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(30,60,30,90,80);
        list.stream().distinct().forEach(n -> System.out.println(n));
    }
}
class Printsquareofeachnumber{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(n->n*n).forEach(n -> System.out.println(n));
    }
}
class Convertlistofintegerstolistofstrings{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(n->"Num" + n).forEach(n -> System.out.println(n));
    }
}

//Create your own functional interface and use lambda
@FunctionalInterface
interface ShreyasCustomizedInterface<T>{
    void doSomething(T t);
}

class ClassForUsingLambdaForCustomizedInterface{
    public static void main(String args[]) {
    List<String> list = Arrays.asList("Red","Blue","Orange");
    ShreyasCustomizedInterface s = (o) -> System.out.println(o);
    s.doSomething(list);
    }
}
//nhi aya
class Iterateamapusinglambda{
    public static void main(String args[]) {
        Map<String,Integer> map = new HashMap<>();
        map.put("S",2);
        map.put("A",4);
        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
//nhi aya
class SortListInDescendingOrder{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.sort((a, b) -> b - a);
        System.out.println(list);
    }
}
class CheckIfAnyNumberIsDivisibleBy5{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        boolean res = list.stream().anyMatch(n->n%5==0);
        System.out.println(res);
    }
}

//nhi aya
class GFG {
    public static void main(String[] args) {
        // Creating list of integers
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);

        // Using reduce to find the sum of all elements
        int sum = numbers.stream()
                .reduce(0, (element1, element2) -> element1 + element2);

        // Displaying the sum of all elements
        System.out.println("The sum of all elements is " + sum);
    }
}
//nhi aya
class GFG2 {
    public static void main(String[] args) {
        // Calculating the product of all numbers in the range [2, 8)
        int product = IntStream.range(2, 8)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1); // Provides -1 if the stream is empty

        // Displaying the product
        System.out.println("The product is : " + product);
    }
}


class MultiplyBy2 {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        list.forEach(e -> System.out.println(e * 2));

        list.stream().forEach(e -> System.out.println(e * 2));

        list = list.stream()
            .map(e -> e * 2)
            .toList();
        System.out.println(list);
    }
}
