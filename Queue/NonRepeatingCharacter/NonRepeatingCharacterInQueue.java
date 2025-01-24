import java.util.*;
public  class NonRepeatingCharacterInQueue{


public static void QueueC(String str){
int freq[] = new int[26];
Queue<Character> q = new LinkedList<>();
for(int i = 0;i<str.length();i++){
    char ch = str.charAt(i);
    q.add(ch);
    freq[ch-'a']++;

    while(!q.isEmpty() && freq[ch - 'a']>1){
        q.remove(ch);
    }
    if(q.isEmpty()){
System.out.print(-1 + " ");
    }else{
        System.out.print(i + " ");
        break;
    }
}
}
public static void main(String[] args){
    String str = "aabccxb";
    QueueC(str);
}
}