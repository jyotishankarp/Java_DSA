public class SortZeroOne {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 1, 0 };
        int len = arr.length;
        int left = 0, right = len - 1;
        while (left < right) {
            while (arr[left] == 0) {
                left++;
            }
            while (arr[right] == 1) {
                right--;
            }
            // reached here means both number are altername i.e 1 & 0
            if (arr[left] == 1 && arr[right] == 0 && left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            //or
            // while (left < right) {
            // while (arr[left] == 0 && left < right) {
            //     left++;
            // }
            // while (arr[right] == 1 && left < right) {
            //     right--;
            // }
            // if (left < right) {
            //     int temp = arr[left];
            //     arr[left] = arr[right];
            //     arr[right] = temp;
            //     left++;
            //     right--;
            // }

        }

        // printing the array
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
