public class TSome {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7, 8, 9 };
        int length = 7;
        int sum = 16;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == sum) {
                        System.out.println("matched");
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    } else {
                        System.out.println("Not matched");
                    }
                }
            }
        }
    }
}
