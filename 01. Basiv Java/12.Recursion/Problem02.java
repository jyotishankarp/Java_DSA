public class Problem02 {
    public static boolean CheckSorted(int arr[]) {
        if (arr.length <= 1) {
            return true;
        }
        int smallArr[] = new int[arr.length - 1];
        for (int i = 0; i < smallArr.length; i++) {
            smallArr[i] = arr[i + 1];
        }
        boolean smallAns = CheckSorted(smallArr);
        if (!smallAns) {
            return false;
        }
        if (arr[0] <= arr[1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7, 9, 1 };
        System.out.println(CheckSorted(arr));
    }
}
