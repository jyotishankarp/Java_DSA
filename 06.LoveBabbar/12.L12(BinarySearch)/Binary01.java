
public class Binary01 {
    static int binarySearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;
        // MIGHT BE GOES OUT OF INTEGER VALUE:
        // int mid = (start + end) / 2;
        // insted
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            // MIGHT BE GOES OUT OF INTEGER VALUE:
            // mid = (start + end) / 2;
            // insted
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int even[] = { 2, 4, 6, 8, 12, 18 };
        int odd[] = { 3, 8, 11, 14, 16 };
        System.out.println("Index of 12 in 'even' array: " + binarySearch(even, 6, 12));
        System.out.println("Index of 11 in 'odd' array: " + binarySearch(odd, 5, 11));
    }
}
