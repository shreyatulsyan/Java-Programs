import java.util.List;

class StreamDemoForEach {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        //Basic java
        System.out.println("Basic Java using loop");
        for(var ele: list) {
            System.out.println(ele);
        }

        System.out.println("\nStream API using lambda");
        // Java 8 streams
        list.stream().forEach(n -> System.out.println(n));

        System.out.println("\nStream API using method reference");
        list.stream().forEach(System.out::println);

        //custom method call
        System.out.println("\nStream API using lambda custom method");
        // Java 8 streams
        list.stream().forEach(n -> testJavaMethodReference(n));

        System.out.println("\nStream API using method reference custom method");
        list.stream().forEach(StreamDemoForEach::testJavaMethodReference);
    }

    private static void testJavaMethodReference(Integer n) {
        if (n > 3) {
            System.out.println(n);
        }
    }
}