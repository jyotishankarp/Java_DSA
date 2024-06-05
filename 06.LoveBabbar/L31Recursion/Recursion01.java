public class Recursion01 {
    // initial Problem with recursion
    //
    static int fact(int n) {
        // base case(Here return state is mandat)
        if (n == 0)
            return 1;
        // recursive relation(This also mandatory)
        int choti = fact(n - 1);
        int badi = n * choti;
        return badi;
    }

    static int fact2(int n) {
        if (n == 0)
            return 1;
        return n * fact2(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        int ans = fact(n);
        System.out.println(ans);
        System.out.println(fact2(n));

    }
}
