public class ReverseString {
    public static void main(String[] args) {
        String str = "Jyoti";
        System.out.println("Original string: " + str);
        int s = 0;
        int e = str.length() - 1;
        char[] charArray = str.toCharArray();
        while (s < e) {
            char temp = charArray[s];
            charArray[s] = charArray[e];
            charArray[e] = temp;
            s++;
            e--;
        }

        // Convert char array back to string
        String swappedString = new String(charArray);
        System.out.println("Swapped string: " + swappedString);
    }
}
