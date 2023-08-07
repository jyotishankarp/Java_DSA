import java.util.*;

public class pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        pattern6(number);
        sc.close();
    }

    static void pattern1(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    static void pattern5(int num) {
        for (int row = 1; row < 2 * num; row++) {
            int totalColinRow = row > num ? 2 * num - row : row;
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //* 
    //* *
    //* * *
    //* * * *
    //* * * * *
    //* * * *
    //* * *
    //* *
    //*

    static void pattern6(int num) {
        for (int row = 1; row < 2 * num; row++) {
            int totalColinRow = row > num ? 2 * num - row : row;
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
