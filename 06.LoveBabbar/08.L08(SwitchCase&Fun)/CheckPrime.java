public class CheckPrime {
    static void CheckP(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Number is not prime");
            } else {
                System.out.println("Number io prime");
            }
        }

    }

    public static void main(String[] args) {
        int n = 13;
        CheckP(n);
        System.out.println();
    }

}
