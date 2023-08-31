public class String01 {
    public static void main(String[] args) {
        String str = "abcdef";
        // System.out.println(str(1)); Wrong
        System.out.println(str.charAt(1));
        System.out.println(str.length());
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(3));
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,6));
        System.out.println(str.substring(str.length())); // Nothing wil comes after 6
        // System.out.println(str.substring(str.length()+1)); //Range [7, 6) out of bounds for length 6
        // System.out.println(str.charAt(9)); 
        System.out.println(str.contains("c"));
        // System.out.println(str.contains('c')); //incompatible types: char cannot be converted to CharSequence


        System.out.println();
    }
}
