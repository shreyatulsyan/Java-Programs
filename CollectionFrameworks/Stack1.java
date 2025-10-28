package CollectionFrameworks;

import java.util.Stack;

public class Stack1 {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(4);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Empty: " + stack.empty());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Search: " + stack.search(4));
        System.out.println("Search: " + stack.search(10));
        for(Integer i : stack){
            System.out.println("Print: " + i);
        }
    }
}
