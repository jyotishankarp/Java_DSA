import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        // int arr[] = new int[10]; // Array
        // int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 1, 2, 3 }; // Array
        ArrayList<Integer> newArr = new ArrayList<>(); // default capacity is 10
        // ArrayList<Integer> newArr2 = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            newArr.add(i); // to add element
        }
        newArr.add(3, 15); // add at particular index(rest element will shift right)
        for (int i = 0; i < newArr.size(); i++) {
            System.out.print(newArr.get(i) + (" "));
        }

        System.out.println();
        // Remove element from Arraylist
        newArr.remove(3);
        for (int i = 0; i < newArr.size(); i++) {
            System.out.print(newArr.get(i) + (" "));
        }

        System.out.println();
        // replace in ArrayList
        newArr.set(3, 100);
        for (int i = 0; i < newArr.size(); i++) {
            System.out.print(newArr.get(i) + (" "));
        }

        // Array Out OF bound
        System.out.println(newArr.get(15));
    }
}