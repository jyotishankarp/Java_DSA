
public class Occurrence {
    static int firstOccurrence(int arr[], int key, int size) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }

            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 6, 7, 8, 9, 10 };        
        int arr2[] = { 2, 4, 5, 6, 6, 7, 8, 9, 10 };
        int num = firstOccurrence(arr, 9, 9);
        System.out.println("the occurrence of 9" + " is at index of " + num);
        System.out.println();
    }
}
