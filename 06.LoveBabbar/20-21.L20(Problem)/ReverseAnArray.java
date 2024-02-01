public class ReverseAnArray {
    static void SwapArr(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 7, 8, 9 };
        int arr2[] = { 11, 25, 47, 63, 12, 5 };
        SwapArr(arr);
        SwapArr(arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
    }
}
