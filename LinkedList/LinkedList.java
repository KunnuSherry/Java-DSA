public class LinkedList {
    public Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val = temp.next.value;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int delete(int index){
        if (index == 0) {
            deleteFirst();
            return 0;
        }
        if(index==size){
            deleteLast();
            return 0;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
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
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }
    public Node insertRec(int val, int index, Node node){
        if(index==1){
            Node n = new Node(val);
            n.next = node.next;
            size++;
            return n;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    public void revRec(Node node){
        if(node==tail){
            head=tail;
        }
        revRec(node.next);
        tail.next=node;
        tail = node;
        tail.next = null;
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
    public void size(){
        System.out.println(size);
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;

        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
