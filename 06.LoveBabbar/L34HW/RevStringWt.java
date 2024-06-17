public class RevStringWt {
    public static String RevString(String Str, int i) {
        char[] arr = Str.toCharArray();
        int j = Str.length() - i - 1;
        if (i >= j)
            return new String(arr);
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return RevString(new String(arr), i + 1);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        str = RevString(str, 0); // Update str with the result of RevString
        System.out.println(str); // Print the reversed string
    }
}
