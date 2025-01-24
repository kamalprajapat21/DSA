import java.util.*;

public class QueueB {

    // Implementation of stack using two queues
    static class ImplementationOfQueue {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        // Function to push an element into stack using two queues.
        void push(int a) {
            // Add the new element to q2.
            q2.add(a);
            
            // Move all elements from q1 to q2.
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            
            // Swap q1 and q2 references.
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }
        
        // Function to pop an element from stack using two queues. 
        int pop() {
            // If q1 is empty, the stack is empty.
            if (q1.isEmpty()) {
                return -1; // Return -1 if the stack is empty.
            }
            
            // Return the front element of q1 (top of the stack).
            return q1.poll();
        }
    }

    public static void main(String[] args) {
        ImplementationOfQueue stack = new ImplementationOfQueue();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.pop()); // Output: 10
        System.out.println(stack.pop()); // Output: -1 (stack is empty)
    }
}


/*
 Queue/NonRepeatingCharacter
 */