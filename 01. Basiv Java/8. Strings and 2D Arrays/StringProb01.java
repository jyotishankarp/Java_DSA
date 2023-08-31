public class StringProb01 {
    public static void PrintString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // Strings are immutable
        // cant change the char in string
        String str = "abcdef";
        PrintString(str);
    }
}
