
public class forLoop {
    public static void main(String[] args) {
        for (int num = 5; num < 10; num++) {
            System.out.println(num);
        }
        for (int num2 = 5, num3 = 8; num2 < num3; num2++) {
            System.out.println("hello");
        }
        for (int num2 = 5, num3 = 8; num2 < num3 && num2 / 2 >= 0; num2++) {
            System.out.println("hello");
        }
        System.out.println();
    }
}
