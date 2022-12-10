public class MyQueue<E> {
    private int size;
    private Node<E> head, tail;

    public MyQueue() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(E data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }else {
            tail.nextNode = node;
        }
        tail = node;
        size++;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public E peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return head.data;
    }

    public E poll() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        E result = head.data;
        head = head.nextNode;
        size--;
        if(isEmpty()){
            tail = null;
        }
        return result;
    }

    public void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }


    private static class Node<E>{
        private E data;
        private Node<E> nextNode;

        public Node(E data) {
            this.data = data;
        }
    }
}
