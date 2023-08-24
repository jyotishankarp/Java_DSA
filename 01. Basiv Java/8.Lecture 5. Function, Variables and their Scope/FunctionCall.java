import java.util.Scanner;

public class FunctionCall {
    // prev function
    public static boolean Prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // uning it here(prime)
    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isprime = Prime(i);
            if (isprime) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter given range:");
        int n = sc.nextInt();
        printPrime(n);
        System.out.println("Back in main");
        sc.close();
    }
}
