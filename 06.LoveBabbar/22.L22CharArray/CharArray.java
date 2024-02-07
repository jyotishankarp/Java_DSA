import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char arr[] = { 'l' };
        // System.out.println(arr[0]);

        char name[] = new char[2];
        System.out.println("Input");
        String input = sc.nextLine();
        name = input.toCharArray();

        System.out.println(input);
        System.out.println(name);
        System.out.println(name.length);

    }

}
