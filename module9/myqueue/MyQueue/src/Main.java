import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue<Integer> queue = new MyQueue<>();

        for (int i = 0; i < 15; i+=2) {
            queue.add(i);
        }
        queue.print();
        System.out.println();
        System.out.println("poll " + queue.poll());
        queue.print();
        System.out.println("\npeek " + queue.peek());
        System.out.println("size " + queue.size());
        queue.clear();
        System.out.print("clear: ");
        queue.print();
    }
}