import java.util.*;
class AreaFind{

    static final double PI = Math.PI;
public static double AreaAns(double n){
double r  = n/2;
double area = PI * r*r;
return area;
}
public static void main(String args[]){

System.out.println(AreaAns(8));
}
}