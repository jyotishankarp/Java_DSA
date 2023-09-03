import java.util.Scanner;

public class TwoDArray3 {
    public static int[][] Array2D() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number or rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter " + i + " th row" + j + "th col" + " Number");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    // public static void PrintArray2D(int arr[][]) {
    // for (int i = 0; i < arr.length - 1; ++i) {
    // for (int j = 0; j < cols; j++) {
    // System.out.println(arr[i][j]);
    // }
    // }
    // }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number or rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter " + i + " th row" + j + "th col" + " Number");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j]);
            }
        }
        // return arr;
        sc.close();

        // PrintArray2D(arr);
        System.out.println();
    }
}
