
public class SumArray {

    static int sumArray(int arr[], int l) {
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 4, 5, 7, 9, 6, 15, 4, 7, 8 };
        int sum = sumArray(arr, 11);
        System.out.println(sum);
    }
}
