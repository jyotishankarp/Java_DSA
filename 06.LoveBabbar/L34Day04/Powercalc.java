
public class Powercalc {
    // More iteration same as using for loop
    public static int Power(int n, int m) {
        if (m == 0)
            return 1;
        return n * Power(n, m - 1);
    }

    // better approach(Less iteration)
    public static int Power2(int n, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return n;
        // recursive call
        int ans = Power(n, b / 2);
        if (b % 2 == 0) {
            // b is even
            return ans * ans;
        } else {
            // b is odd
            return n * ans * ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(Power(3, 3));
        System.out.println(Power2(3, 3));
    }
}
