public class SumOfArray {

    public static int sumArray(int arr[], int size) {
        if (size <= 0)
            return 0;
        if (size == 1)
            return arr[0]; // no need of this just writing

        int[] newArr = new int[size - 1];
        System.arraycopy(arr, 1, newArr, 0, size - 1);

        int sum = 0;
        sum = sum + arr[0];
        return sum + sumArray(newArr, size - 1);
    }

    // Better Approach anc clean code
    public int sumArray2(int arr[], int size) {
        if (size <= 0)
            return 0;
        return arr[size - 1] + sumArray(arr, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 6 };
        System.out.println(sumArray(arr, arr.length));
    }
}
