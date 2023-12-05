
public class ISPrime {
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean num = isPrime(13);
        System.out.println(num);
    }
}
