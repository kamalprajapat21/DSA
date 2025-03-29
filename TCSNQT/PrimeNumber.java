import java.util.*;

class PrimeNumber {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers < 2 are not prime
        }
        for (int i = 2; i * i <= n; i++) { // Check up to √n
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true;
    }

    // Function to return square if prime, else return 0
    public static int squareIfPrime(int n) {
        return isPrime(n) ? n * n : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number. Square: " + squareIfPrime(num));
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
