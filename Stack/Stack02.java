// import java.util.*;
//  class Stack02{

//     // static void InsertAtLast(Stack<Integer> s, int data){

//     //     if(s.isEmpty()){
//     //         s.push(data);
//     //         return;
//     //     }
//     //     int top = s.pop();
//     //     InsertAtLast(s,data);
//     //     s.push(top);
//     // }



//     ///////Using Stack<Integer> return type
    
//     public static Stack <Integer> InsertAtLast(Stack<Integer> s, int data){

//         if(s.isEmpty()){
//             s.push(data);
//             return s;
//         }
//         int top = s.pop();
//         InsertAtLast(s,data);
//         s.push(top);
//         return s;
//     }

//     ///////
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(10);
//         s.push(20);
//         s.push(30);
//         s.push(40);
    

//         InsertAtLast(s,4);

//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// }




//////Insert AT Bottom in Stack

import java.util.*;
public class InsertAtBottom{

////Logic///
public static Stack<Integer>s (Stack<Integer>s,data);

if(s.isEmpty()){
s.push(data);
return s;
}
int top = s.pop();
InserAtBottom(s,data);
s.push(top);
return s;

public static void main(String[] args){
Stack<Integer> s = new Stack<>();
s.push('1');
s.push('2');
s.push('3');

InsertAtBottomElement(s,data);


while(!s.isEmpty){
System.out.println(s.pop());
}

}
}