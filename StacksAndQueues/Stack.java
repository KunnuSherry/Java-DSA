public class Stack {
    //Taking parameters
    int top = -1;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    //Constructors
    public Stack(int size){
        this.data = new int[size];
    }
    public Stack(){
        this(DEFAULT_SIZE);
    }

    //functions
    public boolean isFull(){
        return top == data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    //push and pop functions
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow !");
            return;
        }
        top++;
        data[top]=value;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack UnderFlow");
        }
        int val = data[top];
        top--;
        return val;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack UnderFlow");
        }
        return data[top];
    }

    //display function
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty! ");
            return;
        }
        for(int i=0; i<=top; i++){
            System.out.print(data[top]+" ");
        }
    }


}
