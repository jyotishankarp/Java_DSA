public class Fibonnacci {
    static int Fibb(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return Fibb(n - 1) + Fibb(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Fibb(3));
    }
}
