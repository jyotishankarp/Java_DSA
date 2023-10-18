
import java.util.Arrays;
import java.util.Scanner;

public class Maxmin {

    static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ");
            System.out.print(arr[i]);

        }
    }

    static int getMax1(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMin1(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int getMin2(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    static int getMin3(int arr[]) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = 10; //Bad Practice
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        PrintArr(num);
        System.out.println();
        System.out.println("Minimum value is " + getMin3(num));
    }

}
