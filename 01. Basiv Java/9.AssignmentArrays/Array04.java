
// max element in an array
import java.util.Scanner;

public class Array04 {
    public static int LargestEmement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] takeinput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // int [2,5,4,8,7,9,6,4,2,5,1]
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void print(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        int arr[] = takeinput();
        print(arr);
        int Largest = LargestEmement(arr);
        System.out.println();
        System.out.println("Largest is:" + Largest);
    }
}
