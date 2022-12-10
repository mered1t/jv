import java.util.Arrays;

public class MyArrayList<T> {

    private T[] list;
    private int size;
    private final int DEFAULT_SIZE = 10;

    public MyArrayList(int capacity) {
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity <= 0");
        }
        else{
            list = (T[]) new Object[capacity];
        }
    }

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T item){
        if(size + 1 > list.length){
            list = Arrays.copyOf(this.list, size + 1);
        }
        list[size++] = item;
    }

    public void remove(int index){
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list = Arrays.copyOf(this.list, size - 1);
    }

    public void display(){
        for (T elem: list) {
            System.out.print(elem + " ");
        }
    }

    public int size(){
        return list.length;
    }

    public void clear(){
        list = (T[]) new Object[0];
    }

    public T get(int index){

        return list[index];
    }
}
