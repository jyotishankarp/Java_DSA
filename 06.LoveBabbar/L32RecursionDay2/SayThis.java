public class SayThis {
    static void SayNumber(int num, String arr[]) {
        // Base case
        if (num == 0)
            return;

        // processing(get last number)
        int num2 = num % 10;
        // recursive Function
        SayNumber(num / 10, arr);
        // say that number
        System.out.print(arr[num2] + " ");
    }

    public static void main(String[] args) {
        String items[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        SayNumber(3256, items);
    }
}
