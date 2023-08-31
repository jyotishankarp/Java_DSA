public class String02 {
    public static void main(String[] args) {
        String str = "abc";
        str = str + "abc";
        str = str + "def";
        System.out.println(str);
        System.out.println(str.concat("xyz"));
        System.out.println(str);
        // Ex:1
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };
        if (arr1 == arr2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");//
        }
        // Ex:2
        int arr3[] = { 1, 2, 3 };
        int arr4[] = arr3;
        if (arr3 == arr4) {
            System.out.println("Equal");//
        } else {
            System.out.println("Not equal");
        }
        // Now coming to string
        String str1 = "abc", str2 = "abc";
        String str3 = str1;

        if (str1 == str2) {
            System.out.println("Equal");//
        } else {
            System.out.println("Not equal");
        }
        // .equals
        if (str1.equals(str3)) {
            System.out.println("Equal");//
        } else {
            System.out.println("Not equal");
        }

    }
}
