import java.util.*;

public class Stack04ReverseStackInO1 {

    // Method to reverse a stack using recursion
    static void ReverseStack(Stack<Integer> st) {
        // Base condition: if stack is empty, return
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = st.pop();

        // Recursively reverse the remaining stack
        ReverseStack(st);

        // Insert the removed element at the bottom
        insertAtBottom(st, top);
    }

    // Helper method to insert an element at the bottom of a stack
    static void insertAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, data);
        st.push(top);
    }

    public static void main(String[] args) {
        // Create a stack and push elements
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);

        // Reverse the stack
        ReverseStack(s);

        System.out.println("Reversed Stack: " + s);
    }
}
