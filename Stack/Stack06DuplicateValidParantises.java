import java.util.*;

public class Stack06DuplicateValidParantises {

    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                

                // Check for duplicate parentheses
                if (count < 1) {
                    return true;
                } else {
                    stack.pop(); // Pop the opening parenthesis
                }
            } else {
                stack.push(ch);
            }
        }

        return false; // No duplicate parentheses found
    }

    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(hasDuplicateParentheses(str)); // Expected output: true
    }
}




/*
 * add git
 */