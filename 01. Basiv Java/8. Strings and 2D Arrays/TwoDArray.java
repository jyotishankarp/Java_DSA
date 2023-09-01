public class TwoDArray {
    public static void main(String[] args) {
        int arr2D[][] = new int[4][5]; // row,col
        System.out.println(arr2D[1][2]);
        System.out.println(arr2D[1][10]); // OutOfBoundsException: Index 10 out of bounds for length 5
    }
}
