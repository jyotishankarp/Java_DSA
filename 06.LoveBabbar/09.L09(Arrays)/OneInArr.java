import java.util.Arrays;

public class OneInArr {

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[10];
        Arrays.fill(arr, 1);
        printArr(arr);
    }

}
