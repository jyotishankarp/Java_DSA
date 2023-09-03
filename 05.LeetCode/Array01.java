public class Array01 {
    public static int[] twoSum(int[] arr, int target) {
        int output[] = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        int target = 6;
        twoSum(arr, target);
        // System.out.println(output[0]);
        System.out.println();
    }
}
