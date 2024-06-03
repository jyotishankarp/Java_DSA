public class gcd {
    public static int GcdCalc(int a, int b) {
        // Euclidean algorithm
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        // here i can return anyone from a,b as they are equal at this point
        return a;
    }

    public static void main(String[] args) {
        int a = 23;
        int b = 72;
        System.out.println(GcdCalc(a, b));
    }
}
