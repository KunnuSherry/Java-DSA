public class Main {
    public static void main(String[] args) throws Exception {
//        Queue queue = new Queue();
//        queue.insert(12);
//        queue.insert(13);
//        queue.insert(16);
//        queue.insert(11);
//        queue.display();
//        System.out.println();
//        queue.remove();
//        queue.remove();
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.remove();
        queue.display();

    }
}

