import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();

        System.out.println(arr.size());
        for (int i = 0; i < 11; i++) {
            arr.add(i);
        }
        arr.display();
        System.out.println("\nsize " + arr.size());
        arr.remove(1);
        System.out.println();
        arr.display();
        System.out.print("\nsize " + arr.size());
        System.out.println("\nget elem " + arr.get(3));
        arr.clear();
        arr.display();
    }
}