
public class CharArr {
    static void PrintArr(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        char ch[] = new char[10];
        char ch2[] = { 'a', 'b', 'c', 'g', 'v' };

        PrintArr(ch2);

        System.out.println();
    }

}
