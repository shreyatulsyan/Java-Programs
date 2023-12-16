public class Singleton1 {
    static Singleton1 obj = null;
       private Singleton1(){

       }

   public synchronized static Singleton1 getInstance(){
        if(obj==null)
            obj= new Singleton1();

        return obj;
   }
}
class Call{
    public static void main(String args[]){
        Singleton1 a = Singleton1.getInstance();
        Singleton1 b = Singleton1.getInstance();
        Singleton1 c = Singleton1.getInstance();
        int x = a.hashCode();
        int y = b.hashCode();
        int z = c.hashCode();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
