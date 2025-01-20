import java.util.*;

public class Stack03ReverseString{

    public static String StringReverse(String str){
        Stack<Character> st = new Stack<>();
        int index=0;
        while(index<str.length()){
            st.push(str.charAt(index));
            index++;
        }

        StringBuilder s = new StringBuilder("");
        while(!st.isEmpty()){
            s.append(st.pop());
        }
    return s.toString();
    }
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(StringReverse(str));
    }
}