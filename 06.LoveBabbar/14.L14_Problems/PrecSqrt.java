//Finding the SquareRoot of a given number upto (n) precission
public class PrecSqrt {
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

    static double PrecSqr(int n, int precision, int tempSol) {
        double factor = 1;
        double ans = tempSol;

        for (int i = 0; i < precision; i++) {
            factor = factor / 10;
            for (double j = ans; j * j < n; j += factor) {
                ans = j;
            }
        }
        return ans;
    }

    // BETTER APPROACH By ME
    static float PrecisionSqrt(int number, int precision, int tempAns) {
        double ans = tempAns;
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (ans * ans <= number) {
                ans += increment;
            }
            // loop terminates when ans * ans > number
            ans = ans - increment;
            increment = increment / 10;
        }
        return (float) ans;
    }

    public static void main(String[] args) {
        int n = 37;
        int num = FunSqrt(n);
        System.out.println("The Square root of " + n + " is: " + num);
        int precision = 6;

        double prec = PrecSqr(n, precision, num);
        System.out.println("Final Answer is: " + prec);

        System.out.println("Final Answer is: " + PrecisionSqrt(n, precision, num));

    }
}
