///////Studnet Comaparable 



import java.util.*;
class firstProgram{
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[]args){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A",10));
        pq.add(new Student("B",50));
        pq.add(new Student("V",80));
        pq.add(new Student("D",130));

        pq.add(new Student("M",1085));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-->"+ pq.peek().rank);
            pq.remove();
        }
    }
}