public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    private int size = 0;

    //constructors
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    //isFull() and isEmpty()
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

    //functionalities
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");

        }
        int removed = data[front];
        data[front++] = -1000;
        front = front%data.length;
        size++;
        return removed;
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
