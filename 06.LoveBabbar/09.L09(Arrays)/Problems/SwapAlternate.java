
public class SwapAlternate {

    static void Print(int arr[], int l) {
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void SwapAlternate2(int arr[], int l) {
        for (int i = 0; i < l; i += 2) {
            if (i + 1 < l) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 6, 4, 8, 9 };
        int arr2[] = { 2, 5, 6, 4, 8, 9, 11, 5, 2 };
        SwapAlternate2(arr, 6);
        Print(arr, 6);
        SwapAlternate2(arr2, 9);
        Print(arr2, 9);

        System.out.println();
    }
}
