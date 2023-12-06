
public class ReverseArray {
    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int arr[], int n) {
        int start = 0;
        int end = n - 1;

        // create a while condition
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // swap(arr[start], arr[end]);
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int brr[] = { 2, 6, 3, 9, 4 };

        reverse(arr, 6);
        reverse(brr, 5);

        printArr(arr, 6);
        printArr(brr, 5);

        System.out.println();
    }
}
