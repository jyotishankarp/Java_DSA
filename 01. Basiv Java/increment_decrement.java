public class increment_decrement {
    public static void main(String[] args) {
        int first = 5;
        first++;
        System.out.println(++first);
        int second = 54;
        // second += 25;
        System.out.println(second);
        second ^= 2;
        System.out.println(second);
        System.out.println(second *= 5);
        System.out.println(2+3*5); //27
        System.out.println(2+3^2); //7
        System.out.println(2*3/2); //3 as they are in same presidence so left to right

    }
}
