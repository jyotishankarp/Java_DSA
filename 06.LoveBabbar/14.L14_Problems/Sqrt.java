
public class Sqrt {
    static int FunSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long low = 0;
        long high = x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == x) {
                // System.out.println(high);
                return (int) mid;
            } else if (square < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // System.out.println(high);
        return (int) high;
    }

    public static void main(String[] args) {
        int n = 25;
        int num = FunSqrt(n);
        System.out.println("The Square root of " + n + " is: " + num);
    }
}
