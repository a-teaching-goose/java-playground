public class Node<T> {
    T val;
    Node<T> next;

    public Node(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
