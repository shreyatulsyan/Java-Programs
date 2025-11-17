package javaStreamsExtended;

public class LambdaTest {
    public static void main(String[] args) {

        // using Impl directly
        Impl impl = new Impl();
        impl.test();

        // using Impl using parent reference
        FunctionalInterfaceTest functionalInterfaceTest1 = new Impl();
        functionalInterfaceTest1.test();

        // anonymous implementation
        FunctionalInterfaceTest functionalInterfaceTest2 = new FunctionalInterfaceTest() {
            @Override
            public void test() {
                System.out.println("Functional interface implemented via anonymous");
            }
        };
        functionalInterfaceTest2.test();

        // Lambda 1
        FunctionalInterfaceTest functionalInterfaceTest3 = () -> System.out.println("Functional interface implemented via lambda");
        functionalInterfaceTest3.test();

        // Method reference
        FunctionalInterfaceTest functionalInterfaceTest4 = LambdaTest::print;
        functionalInterfaceTest4.test();
    }

    private static void print() {
        System.out.println("Functional interface implemented via method reference");
    }
}

// implementing an interface.
class Impl implements FunctionalInterfaceTest {
    @Override
    public void test() {
        System.out.println("Functional interface implemented via implementing interface");
    }
}