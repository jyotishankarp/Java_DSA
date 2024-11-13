public class Revise {
    public static int BinSer(int value, int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int cont[] = { 1, 2, 3, 5, 7, 8, 11, 14, 17, 34, 56, 78 };
        for (int i : cont) {
            System.out.println(i);
        }
        System.out.println("Binary search");
        System.out.println(BinSer(7, cont));
    }
}
