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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[][] = new int[3][3]; // creating a 2D array with rows
        arr[0][0] = 5;
        arr[2][2] = 7;
        System.out.println(arr[0][0]);
        System.out.println(arr[2][2]);

        // NEW ARRAY WITH CUSTOM INPUT
        // int arr2[][] = new int[3][4];
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // arr2[i][j] = s.nextInt();
        // }
        // }

        // PRINTING THE 2D ARRAY
        // Output2DArray(arr2, 3, 4);

        // ROW WITH STATIC INPUT
        int arr3[][] = { { 0, 1, 2 }, { 0, 1, 2 }, { 0, 1, 2 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        // FOR ELEMENT SEARCH:
        System.out.println("Enter the element");
        int searchValue = s.nextInt();

        if (isPresent(arr3, 3, 3, searchValue)) {
            System.out.println(searchValue + " is present in the array.");
        } else {
            System.out.println(searchValue + " is not present in the array.");
        }

        // ROW WISE SUM (Must return an 1D array)
        int sumArr = new int[3];
        rowWiseSum(arr3, sumArr, 3);
        // print1DArray(sumArr, 3);

        // Scanner Close
        s.close();
    }
}
