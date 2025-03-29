import java.util.*;
class FindGCD{
public static int GDCSol(int a,int b){

// if(a==0){
// return b;
// }else if(b == 0){
// return a;
// }else if (a>b){
// return GDCSol(a-b,b);
// }else{
// return GDCSol(a,b-a);
// }

if(b==0){
    return a;
}
return GDCSol(a,a%b);
}

public static void main(String[]args){
int a = 25;
int b = 24;
System.out.println(GDCSol(a,b));
}
}