
public class scope {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);
        int j = 2;
        if (j == 2) {
            // int i = 25; //Duplicate local variable i
            int joe = 25;
            System.out.println(joe);
        }
        // System.out.println(joe); //error
        int joe = 25;
        System.out.println(joe); // possible
    }
}
