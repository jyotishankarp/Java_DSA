import java.util.Scanner;

public class LinkedListInput {

    public static Node<Integer> takeInput() {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void Print(Node<Integer> head) {
        System.out.println();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();

        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2 = new Node<Integer>(20);
        // Node<Integer> node3 = new Node<Integer>(30);
        // node1.next = node2;
        // node2.next = node3;
        // Node<Integer> head = node1;

        // System.out.print(head.data + " ");
        Print(head);
        System.out.println();

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

}
