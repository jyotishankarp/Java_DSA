
public class RevString {
    public static void RevStr(char[] str, int leftPtr, int RightPtr) {
        // Base case
        if (leftPtr >= RightPtr)
            return;
        char temp = str[leftPtr];
        str[leftPtr] = str[RightPtr];
        str[RightPtr] = temp;
        // Recursive Call
        RevStr(str, leftPtr + 1, RightPtr - 1);
    }

    public static String ConvertCharArray(String str) {
        // convert to char array
        char charArray[] = str.toCharArray();

        // Call the helper method to swap characters
        RevStr(charArray, 0, charArray.length - 1);

        // Convert the character array back to a string and return
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        String newString = ConvertCharArray(str);
        System.out.println(newString);
    }
}
