public class BubbleSortRec {
    public static void BblSort(int arr[], int n) {
        // base case (already sorted)
        if (n == 0 || n == 1)
            return;
        // 1st case: Take the largest element to the last.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        // Recursive call
        BblSort(arr, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 4, 2 };
        BblSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
