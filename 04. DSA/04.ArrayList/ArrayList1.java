import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 1, 2, 3 };
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            newArr.add(i); // to add element
        }
        newArr.add(3, 15); // add at particular index(rest element will shift right)
        for (int i = 0; i < newArr.size(); i++) {
            System.out.println(newArr.get(i));
        }
        System.out.println();
    }
}