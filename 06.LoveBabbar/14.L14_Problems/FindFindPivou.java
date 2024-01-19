
public class FindFindPivou {
    static int FindPivotElement(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s < e) {
            if (arr[mid] > arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            mid = s + (e - s) / 2;
        }
        // for top most pivot
        return s;
        // for least value pivot
        // return e;
    }

    public static void main(String[] args) {
        // int mainArray[] = { 1, 2, 4, 6, 7, 9, 11 };
        int arr[] = { 4, 6, 7, 9, 11, 1, 2 };
        System.out.println(FindPivotElement(arr));
    }
}
