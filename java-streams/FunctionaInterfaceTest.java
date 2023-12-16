public class FunctionaInterfaceTest implements FTest {

    @Override
    public int test() {
        System.out.println(this.toString());
        return 1;
    }
    
    public static void main(String[] args) {
        FTest test = new FunctionaInterfaceTest();
        test.test();
    }
}

@FunctionalInterface
interface FTest {
    int test();

    boolean equals(Object a);
}