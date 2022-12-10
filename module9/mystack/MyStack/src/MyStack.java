public class MyStack<E> {
    private int size;
    private Node<E> head, tail;

    public MyStack() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void push(E value){
        Node<E> node = new Node<>(value);
        if(this.head == null){
            head = node;
        }
        else{
            tail.nextNode = node;
        }
        tail = node;
        size++;
    }

    public void remove(int index){
        if(size == 0){
            throw new NullPointerException("Array is empty");
        }
        if(index == 0){head = head.nextNode; return;}
        if(index == size - 1){removeLast(); return;}

        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.nextNode;
        }

        Node<E> next = temp.nextNode.nextNode;
        temp.nextNode = next;
        size--;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public E peek(){
        if(size == 0){
            throw new NullPointerException("Array is empty");
        }
        return tail.value;
    }

    public E pop(){
        if(size == 0){
            throw new NullPointerException("Array is empty");
        }
        E result = tail.value;
        removeLast();
        return result;
    }

    private void removeLast(){
        Node<E> temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.nextNode;
        }
        temp.nextNode = null;
        tail = temp;
        size--;
    }
    public void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.nextNode;
        }
    }

    private static class Node<E>{
        
        private E value;
        private Node<E> nextNode;

        public Node(E value) {
            this.value = value;
            this.nextNode = null;
        }
    }
}
