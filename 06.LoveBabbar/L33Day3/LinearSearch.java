
public class LinearSearch {
    public static boolean LinearCheck(int arr[], int start, int key) {
        if (start == arr.length)
            return false;
        if (arr[start] == key)
            return true;
        return LinearCheck(arr, start + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 6 };
        System.out.println(LinearCheck(arr, 0, 5));
        System.out.println(LinearCheck(arr, 0, 11));
        // many other ways possible also(rev,array trim 0th index)
    }
}
