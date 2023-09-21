
// public class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         next = null;
//     }
// }

// For Multiple Datatype We use Generics:
public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}
