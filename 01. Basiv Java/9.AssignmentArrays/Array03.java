import java.util.Scanner;

public class Array03 {

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

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter array size");
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // // int [2,5,4,8,7,9,6,4,2,5,1]
        // for (int i = 0; i < size; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // Same thing doing with function
        System.out.println();
        // sc.close();

        int arr[] = takeinput();
        print(arr);
    }
}
