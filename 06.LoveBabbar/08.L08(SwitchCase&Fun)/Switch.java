
public class Switch {
    public static void main(String[] args) {
        int num = 55;
        char ch = 'a';
        // 1st one
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 55:
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }

        // 2nd One
        switch (ch) {
            case 1:
                System.out.println("One");
                break;
            case 'a':
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }

        // 3rd one
        switch (ch) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
        // 4th one(Brain Storm)
        switch (ch) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
        // nested switch
        switch (ch) {
            case 1:
                System.out.println("One");
                break;
            case 'a':
                switch (ch) {
                    case 'a':
                        System.out.println("Nested Loop");
                        break;

                }
                System.out.println("Two");
                break;
            default:
                System.out.println("Default");
        }
    }
}
