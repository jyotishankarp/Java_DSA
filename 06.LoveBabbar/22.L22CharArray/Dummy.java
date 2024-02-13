import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] name = new char[20];
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        input.getChars(0, input.length(), name, 0);
        System.out.println("Your name is:");
        System.out.println(name);
        scanner.close();
    }
}
