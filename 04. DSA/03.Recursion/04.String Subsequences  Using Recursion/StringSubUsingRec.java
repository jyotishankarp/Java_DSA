public class StringSubUsingRec {
    public static String[] findSubsequent(String Str) {
        // Base Case
        if (Str.length() == 0) {
            String ans[] = { "" };
            return ans;
        }
        String smallAns[] = findSubsequent(Str.substring(1));
        String ans[] = new String[2 * smallAns.length];
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = smallAns[i];
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[i + smallAns.length] = Str.charAt(0) + smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        // String str = "xyz";
        String str = "abcde";
        String ans[] = findSubsequent(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        System.out.println();
    }
}
