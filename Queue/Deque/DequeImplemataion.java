import java.util.*;
public class DequeImplemataion{
    public static void main(String [] args){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
deque.removeFirst();
deque.removeLast();
        System.out.println(deque);
    }
}