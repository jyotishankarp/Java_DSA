public class StringProb02 {
    public static void PrintPrefix(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }

    public static void Prefix(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i + 1));
        }
    }

    public static void main(String[] args) {
        String str = "abcde";
        // PrintPrefix(str);
        Prefix(str);
        System.out.println();
    }
}
