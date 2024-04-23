import java.util.Scanner;

public class Create2DArray {
    // Create an 2d array from user input
    public void Input2DArray(int arr[][]) {
        System.out.println("Hello");
    }

    public void Output2DArray(int arr[][], int row, int col) {
        System.out.println("Here is the " + row + "*" + col + " output");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Check search value
    public static boolean isPresent(int arr[][], int row, int col, int val) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == val)
                    return true;
            }
        }
        return false;
    }

    // sum all the col values of an row
    public static void rowWiseSum(int arr[][], int row, int col, int sumArr[]) {
        int rowSum = 0;
        int largestRowSum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum = rowSum + arr[i][j];
            }
            sumArr[i] = rowSum;
            if (rowSum > largestRowSum) {
                largestRowSum = rowSum;
            }
            rowSum = 0;
        }
        // Largest row sum is
        System.out.println("Largest row sum is " + largestRowSum);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // --CREATING A 2D ARRAY WITH ROWS
        // int arr[][] = new int[3][3];
        // arr[0][0] = 5;
        // arr[2][2] = 7;
        // System.out.println(arr[0][0]);
        // System.out.println(arr[2][2]);

        // --NEW ARRAY WITH CUSTOM INPUT
        // int arr2[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // arr2[i][j] = s.nextInt();
        // }
        // }

        // --PRINTING THE 2D ARRAY
        // Output2DArray(arr2, 3, 4);

        // --ROW WITH STATIC INPUT
        int arr3[][] = { { 0, 1, 2 }, { 0, 1, 2 }, { 0, 1, 2 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        // --FOR ELEMENT SEARCH:
        // System.out.println("Enter the element");
        // int searchValue = s.nextInt();

        // if (isPresent(arr3, 3, 3, searchValue)) {
        // System.out.println(searchValue + " is present in the array.");
        // } else {
        // System.out.println(searchValue + " is not present in the array.");
        // }

        // --ROW WISE SUM (Must return an 1D array)
        int arr4[][] = { { 4, 1, 2 }, { 7, 1, 3 }, { 8, 3, 5 } };
        int sumArr[] = new int[arr4.length];
        rowWiseSum(arr4, arr4.length, arr4[0].length, sumArr);
        // print1DArray(sumArr, 3);
        System.out.print("sum 1D array is: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(sumArr[i] + " ");
        }

        // Scanner Close
        s.close();
    }
}
