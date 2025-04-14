import java.util.Scanner;

public class PrimeSum {
    
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to check if N can be expressed as the sum of two prime numbers
    static boolean canBeExpressedAsSumOfPrimes(int N) {
        for (int i = 2; i <= N / 2; i++) {
            if (isPrime(i) && isPrime(N - i)) {
                return true;  // Found a valid prime pair
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        
        if (canBeExpressedAsSumOfPrimes(N)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        sc.close();
    }
}
