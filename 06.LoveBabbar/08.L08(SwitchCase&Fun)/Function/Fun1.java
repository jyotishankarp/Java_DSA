
public class Fun1 {
    static void Pring() {
        System.out.println("Hello World");
    }

    boolean EvenOdd() {
        System.out.println("Hello");
        return false;
    }

    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int NCR(int n, int r) {
        int num = fact(n);
        int deno = fact(r) * fact(n - r);
        return num / deno;

    }

    public static void main(String[] args) {
        Pring();
        int answer = NCR(5, 2);
        System.out.println(answer);
    }
}
