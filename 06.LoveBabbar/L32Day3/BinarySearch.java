public class BinarySearch {
    public static boolean BinarySer(int arr[], int start, int end, int key) {
        if (start > end)
            return false;
        // calculate mid
        // int mid = (start + end) / 2;
        int mid = start + (end - start) / 2;
        // check immediately
        if (arr[mid] == key)
            return true;

        // Recursive case: Search in the right half
        if (arr[mid] < key) {
            return BinarySer(arr, mid + 1, end, key);
        // Recursive case: Search in the left half
        } else {
            return BinarySer(arr, start, mid - 1, key);

        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 9 };
        System.out.println(BinarySer(arr, 0, arr.length - 1, 5));
    }
}
