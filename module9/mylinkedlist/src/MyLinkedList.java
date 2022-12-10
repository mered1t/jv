public class MyLinkedList<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedList() {
        tail = null;
        head = null;
    }

    public void add(E value){
        Node<E> temp = new Node<>(value);
        if(head == null){
            head = temp;
        }
        else{
            tail.nextElement = temp;
        }

        temp.prevElement = tail;
        tail = temp;
        size++;
    }

    private void removeFirst(){
        if(head.nextElement == null){
            tail = null;
        }
        else{
            head.nextElement.prevElement = null;
        }
        head = head.nextElement;
    }

    private void removeLast(){
        if(head.nextElement == null){
            head = null;
        }
        else{
            tail.prevElement.nextElement = null;
        }
        tail = tail.prevElement;
    }

    public void remove(int index){
        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.nextElement;

            if (current == null) {
                return;
            }
        }
        if(current == head){
            removeFirst();
        }
        else{current.prevElement.nextElement = current.nextElement;}

        if(current == tail){
            removeLast();
        }
        else{
            current.nextElement.prevElement = current.prevElement;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public void print(){
        Node<E> temp = head;
        while(temp!= null){
            System.out.print(temp.value + " ");
            temp = temp.nextElement;
        }
    }

    public void clear(){
        head = null;
        tail = null;
    }

    public E get(int index){

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.nextElement;
        }
        return current.value;
    }

    private static class Node<E>{
        private E value;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E value) {
            this.value = value;
        }
    }
}