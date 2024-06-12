import java.util.Arrays;

public class IsSorted {
    public static boolean isSort(int arr[], int size) {
        // base case
        if (size == 0 || size == 1)
            return true;
        // Check if the first two elements are in order
        if (arr[0] > arr[1])
            return false;
        else {
            // Create a new array that excludes the first element
            // int[] newArr = new int[size - 1];
            // System.arraycopy(arr, 1, newArr, 0, size - 1);

            // boolean remainingPart = isSort(newArr, size - 1);
            // return remainingPart;

            // 2nd Approach
            return isSort(Arrays.copyOfRange(arr, 2, size), size - 2);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 6 };
        System.out.println("Array is sorted: " + isSort(arr, arr.length));
        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println("Array is sorted: " + isSort(arr2, arr2.length));
    }
}
