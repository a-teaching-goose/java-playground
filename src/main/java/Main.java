public class Main {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);

        head.next = new Node<>(2);
        head.next.next = new Node<>(3);

        // print out all nodes
        // only head is available for use
        printList(head);

        // print it again
        printList(head);

        /*
        add a new node
         */
        Node<Integer> ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = new Node<>(4);
        printList(head);

        /*
        delete a node
         */
        ptr = head;
        while (ptr.next != null) {
            if (ptr.next.val == 2) {
                ptr.next = ptr.next.next;
                break;
            }
            ptr = ptr.next;
        }

        printList(head);
    }

    private static void printList(Node<Integer> ptr) {
        System.out.println("\nlittle printer:\n");
        while (ptr != null) {
            System.out.println(ptr);
            ptr = ptr.next;
        }
    }
}
