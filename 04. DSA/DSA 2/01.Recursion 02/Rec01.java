// Q: I have an string with multiple character and i have to remove the given character from the string ?
public class Rec01 {
    public static String RemoveX(String str) {
        if (str.length() == 0) {
            return "";
        }
        String ans = "";
        if (str.charAt(0) != 'x') {
            ans += str.charAt(0);
        }
        String smallAns = RemoveX(str.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        String str = "xabdxzjx";
        System.out.println(RemoveX(str));
    }
}
