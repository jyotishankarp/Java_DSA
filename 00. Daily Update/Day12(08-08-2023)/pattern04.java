import java.util.*;

public class pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        pattern1(number);
        sc.close();
    }

    static void pattern1(int num2) {
        for (int row = 1; row <= num2; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
