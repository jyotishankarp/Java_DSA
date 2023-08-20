
// & | ~ ^(Bitwise Operator)
import java.util.Scanner;

public class bitwiseoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        System.out.print("& Operator:");
        System.out.println(2 & 3);
        System.out.print("OR Operator:");
        System.out.println(2 | 3);
        System.out.print("negation/complement Operator:");
        System.out.println(~3);
        System.out.print("XOR Operator:");
        System.out.println(2 ^ 3);

        System.out.print("Left Shift Operator");
        System.out.println(34<<1);
        // System.out.println(-4<<1);

        System.out.print("Left Shift Operator");
        System.out.println(34>>2);
        // System.out.println(-4>>1);

        // bitwise01(num);
        sc.close();
    }

    static void bitwise01(int num) {

    };
}
