public abstract class ParentAbstractClass {
    ParentAbstractClass(){
        System.out.println("ParentAbstractClass Default Constructor");
    }
    ParentAbstractClass(int a){
        a=2;
        System.out.println("ParentAbstractClass Parameterized Constructor "+ a);
    }
    abstract void drive();
    void initialisenumber(){
        System.out.println("Initialise number method in ParentAbstractClass");
    }
}
