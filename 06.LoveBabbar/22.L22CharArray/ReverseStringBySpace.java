public class ReverseStringBySpace {
    public static void main(String[] args) {
        String real = "my name is joe";
        StringBuilder reversedWord = new StringBuilder();
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < real.length(); i++) {
            if (!Character.isWhitespace(real.charAt(i))) {
                reversedWord.insert(0, real.charAt(i));
            } else {
                newString.append(reversedWord).append(" ");
                reversedWord.setLength(0); // Clear the StringBuilder for the next word
            }
        }
        // Append the last word
        newString.append(reversedWord);

        System.out.println("New String is: " + newString);
    }
}
