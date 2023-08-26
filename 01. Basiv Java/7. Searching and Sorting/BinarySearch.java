
public class BinarySearch {
    public static int binarySearch(int arr[], int element) {
        int start = 0, end = (arr.length) - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (element > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int element = 4;
        int arr[] = { 1, 8, 4, 5, 7, 9, 25, 4, 82, 4, 5, 7 };
        int index = binarySearch(arr, element);
        System.out.println("Present at index of: " + index);
    }

}
