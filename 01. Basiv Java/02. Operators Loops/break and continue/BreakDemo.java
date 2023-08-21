import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();
        boolean prime = false;
        for (int d = 2; d < (num / 2); d++) {
            if (num % d == 0) {
                prime = true;
                break;
            }
        }
        if (prime) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("its a prime number");
        }
        sc.close();

    }
}
