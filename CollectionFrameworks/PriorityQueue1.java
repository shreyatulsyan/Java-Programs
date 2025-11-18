//package CollectionFrameworks;
//
//import javax.swing.*;
//import java.util.*;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class PriorityQueue1 {
//    public static void main(String args[]){
//        Queue<Integer> q = new PriorityQueue<>();
//        Queue<Integer> emptyqueue = new PriorityQueue<>();
//
//        int[] a = new int[]{2,4,5};
//        List<int[]> b = Arrays.asList(a);
//        int[] a = new int[] {1,2,3,4,5};
//        a = Arrays.stream(a).boxed().toList().stream().distinct().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();;
//       a =  b.toArray();
//
//
//        q.add(8);
//        q.add(3);
//        q.add(6);
//        q.add(8);
//        q.add(4);
//        //83684
//        //38684
//
//        System.out.println(q);//33688
//        System.out.println("Poll: " + q.poll()); //3
//        System.out.println(q);//3688
//        System.out.println("Remove: " + q.remove());//3
//        System.out.println(q);//688
//
//        System.out.println("Peek: " + q.peek()); //6
//        System.out.println(q); //688
//        System.out.println("Element: " + q.element()); //6
//        System.out.println(q); //688
//
//        System.out.println("Poll: " + emptyqueue.poll()); //null
//        System.out.println(emptyqueue);
//        System.out.println("Peek: " + emptyqueue.peek()); //null
//        System.out.println(emptyqueue);
//        System.out.println("Remove: " + emptyqueue.remove()); //excption
//        System.out.println(emptyqueue);
//        System.out.println("Element: " + emptyqueue.element()); //exception
//        System.out.println(emptyqueue);
//    }
//}
