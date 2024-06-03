import java.util.*;
import java.io.*;

public class Solution {

    public static int[] wavePrint(int arr[][], int nRows, int mCols) {
        int[] ans = new int[nRows * mCols];
        int k = 0;
        for (int j = 0; j < mCols; j++) {
            if (j % 2 == 1)
                for (int i = nRows - 1; i >= 0; i--)
                    ans[k++] = arr[i][j];
            else
                for (int i = 0; i < nRows; i++)
                    ans[k++] = arr[i][j];
        }
        return ans;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int total = row * col;

        // index initialization
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        // empty List
        List<Integer> ans = new ArrayList<>();

        while (count < total) {
            // Print starting row
            for (int index = startingCol; index <= endingCol; index++) {
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            // Print ending col
            for (int index = startingRow; index <= endingRow; index++) {
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            // Print ending row
            for (int index = endingCol; index >= startingCol; index--) {
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;

            // Print starting col
            for (int index = endingRow; index >= startingRow; index--) {
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        // int arr[][] = { { 4, 1, 2 }, { 7, 1, 3 }, { 8, 3, 5 } };
        // wavePrint(arr, 3, 3);
        int arr2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        spiralOrder(arr2);

    }
}