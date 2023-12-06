
public class ArrayDeclarations {
    static void ArrayPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // direct declaration with size;
        int str[] = new int[5];

        // #2nd Way(Giving the size later)
        int str2[];
        str2 = new int[5];

        // #3rd Way(Declaration with elements and not Size)
        int str3[];
        str = new int[] { 2, 3, 4, 5, 6 };

        // #4th Way(Directly giving with elements)
        int str4[] = { 2, 3, 4, 5, 6 };

        System.out.println("Printing a string:");
        str[0] = 2;
        System.out.println(str[0]);
    }
}
