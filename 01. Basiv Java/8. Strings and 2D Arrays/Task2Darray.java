public class Task2Darray {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 } };
        int largeCol = Integer.MIN_VALUE;
        int largeSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if (sum > largeSum) {
                largeSum = sum;
            }
        }

        System.out.println();
        // Pending due to no understanding question;
    }
}
