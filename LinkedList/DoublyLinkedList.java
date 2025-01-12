public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        size++;
    }
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        node.prev = temp;
        size++;
    }
    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node node = new Node(value, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
        size++;

    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            System.out.print("->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp=temp.next;
        }
        while(last!=null){
            System.out.print(last.value);
            System.out.print("<-");
            last=last.prev;
        }
        System.out.println("HEAD");


    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
            this.next = null;
            this.prev = null;
        }
        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next = next;
            this.prev = prev;
        }

    }
}
