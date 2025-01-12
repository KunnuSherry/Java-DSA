public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(8);
        list.insertLast(17);
        list.insertRec(24, 4, list.head);
        list.insert(89, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(3);
        list.display();
        list.size();

//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(7);
//        list.insertLast(1);
//        list.insert(12, 2);
//        list.display();
//        list.displayRev();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(23);
//        list.insert(34);
//        list.insert(67);
//        list.delete(34);
//        list.display();
    }
}
