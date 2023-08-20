import java.util.Scanner;

public class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter The Number:");
        // int num = sc.nextInt();
        // Char_pattern1(num);

        System.out.print("Enter The Number:");
        int num = sc.nextInt();
        System.out.print("Enter The Starting Character:");
        char sChar = sc.next().charAt(0);
        Char_pattern2(num,sChar);
        sc.close();
    }

    /*  Q1:Print the below pattern:
     ABCD
     ABCD
     ABCD
     ABCD
    END */
    static void Char_pattern1(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print((char) ('F' + col - 1));
            }
            System.out.println();
        }
    }

    /*  Q1:Print the below pattern:
     ABCD
     ABCD
     ABCD
     ABCD
     with starting char as input
    END */
    static void Char_pattern2(int num, char sChar) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print((char) (sChar + col - 1));
            }
            System.out.println();
        }
    }
}
