
public class LinkedList01 {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        System.out.println(node1.data);
        System.out.println(node1.next);

        // Another Node
        Node<Integer> node2 = new Node<Integer>(20);
        node1.next = node2;
        System.out.println(node1.next);
        System.out.println(node2);

        System.out.pr intln();
    }
}
