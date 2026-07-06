
public class SinglyLinkedList {

    class Node {

        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            next = null;
        }
    }
    Node head;

    public SinglyLinkedList insert(SinglyLinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void print(SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.println("\nLinkedList: ");
        while (currNode != null) {
            System.out.println(currNode.data + "");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println(key + "not found");
            return;
        }
        Node currNode = head;
        Node prev = null;
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println(key + " not found");
            return;
        }
        if (prev == null) {
            head = currNode.next;
        } else {
            prev.next = currNode.next;
        }
        currNode.next = null;
        System.out.println(key + " found and deleted");
    }
}
