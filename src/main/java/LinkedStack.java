public class LinkedStack<T> implements Stack<T> {
    ListNode<T> head;

    int size;

    @Override
    public void push(T val) {
        // O(1) operation
        // add new node to the front or tail
        size++;
        if (head == null) {
            // insert the first node
            head = new ListNode<>(val);
            return;
        }

        // insert the node at the front
        ListNode<T> newNode = new ListNode<>(val);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        // O(1) operation
        // remove and return the first node
        T ret = head.val;
        head = head.next;
        size--;
        return ret;
    }

    @Override
    public boolean isEmpty() {
        /* O(1) operation */
        return size == 0;
    }
}
