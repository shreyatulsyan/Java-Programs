import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
//        Test a = new Test();
//        Test b = new Test();
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        new String().equals()
        var obj = new Main();
        obj.test();
    }

    public void test() throws RuntimeException {
        throw new Exception("shreya here");
    }
}

class Test {}