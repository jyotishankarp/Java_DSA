public class JaggedArray01 {
    public static void main(String[] args) {
        int arr[][] = new int[4][2];
        System.out.println(arr[0]); // [I@2c7b84de
        int arr2[][] = new int[4][];
        System.out.println(arr2); // [[I@2c7b84de
        System.out.println(arr2[0]); // null(for all row)
        System.out.println(arr2[0][0]); // null pointer excp
    }
}
