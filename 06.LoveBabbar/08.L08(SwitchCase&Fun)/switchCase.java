public class switchCase {
    static int SumNum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num = 5;
        int num2 = 7;
        int ans = SumNum(num, num2);
        System.out.println("The sum of " + num + " and " + num2 + " is " + ans);
        // switchCase: System.out.println("Hello");
    }
}