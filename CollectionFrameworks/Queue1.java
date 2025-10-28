package CollectionFrameworks;

import javax.swing.*;
import java.util.*;

public class Queue1 {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> emptyqueue = new LinkedList<>();
        q.add(8);
        q.add(3);
        q.add(6);
        q.add(8);
        q.add(3);
        q.offer(0);
        q.offer(12);
        q.offer(11);


        System.out.println("Poll: " + q.poll());
        System.out.println(q);
        System.out.println("Remove: " + q.remove());
        System.out.println(q);

        System.out.println("Poll: " + emptyqueue.poll());
        System.out.println(emptyqueue);
        System.out.println("Remove: " + emptyqueue.remove());
        System.out.println(emptyqueue);

        System.out.println("Peek: " + q.peek());
        System.out.println(q);
        System.out.println("Element: " + q.element());
        System.out.println(q);

        System.out.println("Peek: " + emptyqueue.peek());
        System.out.println(emptyqueue);
        System.out.println("Element: " + emptyqueue.element());
        System.out.println(emptyqueue);
    }
}
