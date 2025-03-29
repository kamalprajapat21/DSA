import java.util.*;
class RangeOfPrimeNumber{

 public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers < 2 are not prime
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check up to √n
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true;
    }


public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a:");
int a = sc.nextInt();
System.out.println("Enter b:");
int b = sc.nextInt();
sc.close();

if (a >= b) {
    System.out.println("Invalid range! 'a' should be less than 'b'.");
    return;
}
int ans = 0;
for(int i = a;i<b;i++){
if(isPrime(i)){
    ans = ans + i;


}
}
System.out.println(ans);

}
}