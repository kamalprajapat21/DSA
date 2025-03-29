// import java.util.*;
// class facto{
// public static int factorial(int n){
// if(n == 0||n==1){
// return 1;
// }
// return  n*factorial(n-1);
// }

// public static void main(String []args){
// System.out.println(factorial(5));
// }
// }




import java.util.*;
class facto{
public static int factorial(int n){
return (n==0||n==1)?1: n*factorial(n-1);



}

public static void main(String []args){
System.out.println(factorial(5));
}
}