public class ReverseStringBy {

    public static void main(String[] args) {
        String blank = "";
        String real = "my name is joe";
        String NewString = "";
        int startPoint = 0;
        System.out.println(blank.length());
        for (int i = 0; i < real.length(); i++) {
            if (Character.isWhitespace(real.charAt(i)) && (blank.length() > 0)) {
                // reverce kariki add kariba
                for (int j = i - 1; j >= startPoint; j--) {
                    // change the main string value
                    NewString += Character.toString(real.charAt(j));
                }
                NewString = NewString + ' ';
                startPoint = i + 1;
                blank = "";
            } else {
                blank = blank + real.charAt(i);
            }
        }
        // add the last substring
        for (int k = blank.length() - 1; k >= 0; k--) {
            NewString = NewString + blank.charAt(k);
        }
        System.out.println("New String is: " + NewString);
    }
}