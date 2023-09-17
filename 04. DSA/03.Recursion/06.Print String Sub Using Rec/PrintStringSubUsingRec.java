public class PrintStringSubUsingRec {
    // here function name same but arg is diff so fun overloading will work
    public static void PrintSubsequences(String input, String outputSoFar) {
        if (input.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }
        // we choose not to includse first character
        PrintSubsequences(input.substring(1), outputSoFar);
        // we choose to includse first character
        PrintSubsequences(input.substring(1), outputSoFar + input.charAt(0));
    }

    public static void PrintSubsequences(String input) {
        PrintSubsequences(input, "");
    }

    public static void main(String[] args) {
        PrintSubsequences("xyz");
    }
}
