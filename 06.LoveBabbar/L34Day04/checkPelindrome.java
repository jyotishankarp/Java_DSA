public class checkPelindrome {
    public static boolean checkPel(String str, int i, int j) {
        if (i > j)
            return true;
        if (str.charAt(i) != str.charAt(j))
            return false;
        else {
            return checkPel(str, i + 1, j - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPel("lalalal", 0, 4));
    }
}
