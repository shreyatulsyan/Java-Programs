import java.util.List;

public class IntermediateAndTerminalOperations {
    public static void main(String[] args) {

        /**
         * Reference: https://javaconceptoftheday.com/java-8-stream-intermediate-and-terminal-operations/
         */

        /**
         * ternary operators
         * operators after which stream is closed/terminated and no more events can be added to
         * stream pipeline.
         * 
         * for eg- forEach, collect etc
         */

        /**
         * intermediate operators
         * operators after which we can continue the stream pipeline.
         * 
         * for eg- filter, map, flatMap etc
         */
        
        System.out.println("Code to show usage of terminal operation: ");
        var list = List.of("ABC", "PQR", "DX", "XY", "JKL");
        list.stream()
            .filter(IntermediateAndTerminalOperations::test)
            .forEach(System.out::println);

        System.out.println("Code problem to create pipeline of events: ");
        var listTest = List.of("ABC", "PQR", "DX", "XY", "JKL", "ABC");
        // no repetitions
        // converted to lower case
        // length > 2
        listTest.stream()
            .distinct()
            .filter(e -> e.length() > 2)
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }

    private static boolean test(String str) {
        System.out.println("Inside test");
        return str.length() > 2;
    }
}
