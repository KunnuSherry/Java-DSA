import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(45);
        stack.push(2);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.peek();
        queue.remove();
        System.out.println(queue);




    }
}
