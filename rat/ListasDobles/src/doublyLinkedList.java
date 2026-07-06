
public class doublyLinkedList {

    class Node {

        int data;
        Node prev;
        Node next;
        Node head, tail = null;

        public Node(int data) {
            this.data = data;
        }

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                head.prev = null;
                tail.next = null;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        public void delete(int key) {
            if (head == null) {
                System.out.println(key + "not found");
                return;
            }
            Node current = head;
            while (current != null && current.data != key) {
                current = current.next;
            }
            if (current == null) {
                System.out.println(key + "not found");
                return;
            }
            if (current == head) {
                head = current.next;
            } else {
                current.prev.next = current.next;
            }
            if (current == tail) {
                tail = current.prev;
            } else {
                current.next.prev = current.prev;
            }
            current.next = null;
            current.prev = null;
            System.out.println(key + "found and deleted");
        }
    }
}
