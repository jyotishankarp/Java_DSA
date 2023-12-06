
public class linearSearch {
    static boolean search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 7, 5, 8, 6, 4, 9, 8, 5, 12, 458, 9, 4, 6, 5, 5, 5, 6, 5, 45, 254, 0, 1, 2, 4, 5 };
        boolean ans = search(arr, 99);
        System.out.println(arr.length);
        System.out.println(ans);

    }
}
