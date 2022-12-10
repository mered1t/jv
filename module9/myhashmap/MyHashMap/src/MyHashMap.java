public class MyHashMap<E, T> {

    private int size;
    private Node<E, T> head, tail;

    public MyHashMap() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void put(E key, T value){
        Node<E, T> node = new Node<>(key, value);
        if(head == null){
            head = node;
        }
        else{
            Node<E, T> temp = head;
            while(temp != null){
                if(temp.key == key){
                    return;
                }
                temp = temp.nextNode;
            }
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

        Node<E, T> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.nextNode;
        }

        Node<E, T> next = temp.nextNode.nextNode;
        temp.nextNode = next;
        size--;
    }

    private void removeLast(){
        Node<E, T> temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.nextNode;
        }
        temp.nextNode = null;
        tail = temp;
        size--;
    }


    public void print(){
        Node<E, T> temp = head;
        while(temp != null){
            System.out.print(temp.key + " -> " + temp.value + "; ");
            temp = temp.nextNode;
        }
        System.out.println();
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public T get(E key){
        Node<E, T> temp = head;
        while(temp.key != key){
            temp = temp.nextNode;
        }
        return temp.value;
    }

    private static class Node<E, T>{

        private E key;
        private T value;
        private Node<E, T> nextNode;

        public Node(E key, T value) {
            this.key = key;
            this.value = value;
            this.nextNode = null;
        }
    }
}
