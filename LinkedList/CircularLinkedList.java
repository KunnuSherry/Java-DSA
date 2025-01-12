public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList(){
        this.size=0;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail=node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail=node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp.next!=head){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print(temp.val+"->");
        System.out.println("HEAD");

    }
    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }


    private class Node{
        int val;
        Node next;
        public Node(int value){
            this.val = value;
            this.next = null;
        }

    }
}
