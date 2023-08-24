
public class PassByValue {
    public static void increment(int n) {
        n = n + 1;
    }

    public static void main(String[] args) {
        int a = 10;
        increment(a);
        System.out.println(a); // will return 10 bcz(we are passing value)(mostly all are pass by value in java)
    }
}
