
// import java.util.ArrayList;

// public class Stack01{
//     static class Stack{
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         }


//         ///push
//         public static void push(int data){
//             list.add(data);
//         }

//         ///pop 
//         public static int pop(){
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }


//         public static int peek(){
//             return list.get(list.size()-1);
        
//         }
//     }


//     ///Main Function
//     public static void main(String [] args){
//         Stack s = new Stack();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
//         s.push(50);
//         s.push(60);


//         while(!Stack.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


import java.util.*;
public class Stack01{

    //  static class Stack {
        // ArrayList<Integer> list = new ArrayList<>(); // Non-static list (unique for each Stack object).
    
        // public boolean isEmpty() {
        //     return list.size() == 0;
        // }
    
        // public void push(int data) {
        //     list.add(data);
        // }
    
        // public int pop() {
        //     int top = list.get(list.size() - 1);
        //     list.remove(list.size() - 1);
        //     return top;
        // }
    
        // public int peek() {
        //     return list.get(list.size() - 1);
        // }
    
    
    public static void main(String[] args) {
        // Stack stack1 = new Stack();
        // Stack stack2 = new Stack();
    
        Stack<Integer>stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
    
        System.out.println(stack1.peek()); // Output: 10
        stack1.pop();
        System.out.println(stack1.peek()); // Output: 20
    }
    
}