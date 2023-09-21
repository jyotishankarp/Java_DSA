import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add(i);
        }
        // ole method
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }

        System.out.println();
        // new loop method (for each)
        for (int ele : newList) {
            System.out.print(newList.get(ele) + " ");
        }

        System.out.println();
        // new loop method (for each):Quick Traversal,Edit in array not possible
        for (Integer ele : newList) {
            System.out.print(newList.get(ele) + " ");
        }

        System.out.println();
    }
}
