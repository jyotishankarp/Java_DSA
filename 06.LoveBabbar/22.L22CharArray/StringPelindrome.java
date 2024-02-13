public class StringPelindrome {

    static char[] Reverse(String str) {
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
        return charArray;
    }

    static boolean CheckPelin(char a[], int n) {
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            // check and skip special characters
            if (!isLetterOrDigit(a[s])) {
                ++s;
            }
            if (!isLetterOrDigit(a[e])) {
                --e;
            }
            // convert to lowercase
            // if (a[s] != a[e]) {
            if (toLowerCase(a[s]) != toLowerCase(a[e])) {
                return false;
            } else {
                s++;
                e--;
            }
        }
        return true;

    }

    static char toLowerCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        } else {
            return (char) (ch - ('A' - 'a'));
        }
    }

    static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        String str = "c1 O$d@eeD o1c";
        System.out.println("Original string: " + str);
        // Convert char array back to string
        String swappedString = new String(Reverse(str));
        System.out.println("Swapped string: " + swappedString);

        // check Pelindrome
        char[] newArr = str.toCharArray();
        int length = newArr.length;
        System.out.println("The array is pelindrome?: " + CheckPelin(newArr, length));
    }
}
