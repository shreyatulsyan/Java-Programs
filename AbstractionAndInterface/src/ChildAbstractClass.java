public class ChildAbstractClass extends ParentAbstractClass implements ParentInterface , InterfaceInInterface.Inter , InterfaceInClass.ABCDInterface{
    ChildAbstractClass(){
        System.out.println("ChildAbstractClass Default Constructor");
    }
    ChildAbstractClass(int a) {
        super(a);
        System.out.println("ChildAbstractClass Parameterized Constructor "+ a);
    }

    @Override
    void drive() {
        System.out.println("ParentAbstractClass Drive");
    }

    public static void main(String args[]) {
        ChildAbstractClass b = new ChildAbstractClass(2);
        b.initialisenumber();
        b.calculatePercentage(3);
        System.out.println("Interface Percentage " + ParentInterface.per);
        b.cdef();
        b.wagonR();
    }

    @Override
    public void calculatePercentage(int per) {
        System.out.println("ParentInterface calculatePercentage: " + per);
    }

    @Override
    public void cdef() {
        System.out.println("InterfaceInInterface cdef");
    }

    @Override
    public void wagonR() {
        System.out.println("InterfaceInClass.ABCDInterface wagonR");
    }
}
