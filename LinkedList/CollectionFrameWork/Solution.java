import java.util.*;

class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(5);

        System.out.print(ll);  // Output: [5, 1, 2]

        System.out.println();  // Output: [5, 1, 2]


        ll.removeLast();
        ll.removeFirst();
        System.out.print(ll);  // Output: [5, 1, 2]

    }
}
