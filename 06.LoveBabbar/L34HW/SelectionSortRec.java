public class SelectionSortRec {
    // Method to sort an array using selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Selection Sort using recursion
    public static void selectionSortRec(int[] arr, int minIdx) {
        if (minIdx == arr.length - 1)
            return;
        for (int j = minIdx + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[j];
                arr[j] = temp;
            }
            // Some Better approach will implement to avoid unnecessary swap
        }
        selectionSortRec(arr, minIdx + 1);
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Original array: ");
        PrintArr(arr);
        selectionSortRec(arr, 0);
        System.out.println("\nSorted array: ");
        PrintArr(arr);
    }
}
