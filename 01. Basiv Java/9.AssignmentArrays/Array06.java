// increment array element by function
public class Array06 {
    public static void arrayincrement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 3, 4, 5 };
        arrayincrement(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
