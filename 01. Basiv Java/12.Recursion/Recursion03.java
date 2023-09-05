// Fibbonacci Number
public class Recursion03 {
    public static int Fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibb(n - 1) + Fibb(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibb(n));
    }
}
