
public class Functions02 {
    public static boolean Prime(int n) {
        for (int i = 2; i < (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = Prime(25);
        System.out.println(ans);
    }
}
