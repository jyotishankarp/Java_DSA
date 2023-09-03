import java.util.Scanner;

public class TwoDArray4 {
    public static int[][] Array2D() {
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
        return arr;
        // sc.close();
    }

    public static void PrintArray2D(int arr[][]) {
        // how we know row & col
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // for (int i = 0; i < arr.length - 1; ++i) {
        // for (int j = 0; j < cols; j++) {
        // System.out.println(arr[i][j]);
        // }
        // }
        // return arr;
        // sc.close();

        // int arr2[][] = { { 2, 5, 6 }, { 3, 2, 1 } };

        int arr[][] = Array2D();
        PrintArray2D(arr);

        System.out.println();
    }
}
