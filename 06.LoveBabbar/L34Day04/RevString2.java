
public class RevString2 {

    public static void Test() {
        String str = "Lipun";
        str = str.substring(1) + str.charAt(0);
        System.out.println(str);
    }

    public static String reverse(String str) {
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        // Calling the test function for demonstration purpose
        Test();
        // The actual rever function
        String str = "Hello World";
        System.out.println(reverse(str));
    }
}
