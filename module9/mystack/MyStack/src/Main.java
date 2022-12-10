public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 35; i+=4) {
            stack.push(i);
        }
        stack.print();
        stack.remove(stack.size() - 1);
        System.out.println();
        stack.print();
        System.out.println();
        System.out.println("peek: " + stack.peek());
        System.out.println("size: " + stack.size());
        System.out.println("pop: " + stack.pop());
        stack.print();
    }
}