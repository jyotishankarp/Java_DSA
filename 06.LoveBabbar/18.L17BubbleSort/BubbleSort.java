public class BubbleSort {
    static void Bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 54 };
        Bubble(arr);
        System.out.println();
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}