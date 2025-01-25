import java.util.*;
public class interleaveQueueImplematation{
public static void QueueC(Queue<Integer> q){
    int n = q.size();
    Queue<Integer> first = new LinkedList<>();

    for(int i = 0;i<n/2;i++){
        //if we use n ---> q.size() this give us different ans bcz q.size() is variable but we need fix value here so////
        first.add(q.remove());
    }
while(!first.isEmpty()){
    q.add(first.remove());
    q.add(q.remove());
}
}

    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        QueueC(q);
        
            System.out.println(q);
        
    }
}
