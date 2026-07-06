
public class ejemplo {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list = list.insert(list, 8);
        list = list.insert(list, 5);
        list = list.insert(list, 3);
        list = list.insert(list, 7);
        list = list.insert(list, 2);
        list.print(list);
        list.delete(8);
        list.delete(3);
        list.delete(2);
        list.print(list);
    }
}
