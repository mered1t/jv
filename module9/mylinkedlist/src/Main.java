public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(4);
        list.add(15);
        System.out.println(list.get(1));
        list.add(8);
        list.print();
        System.out.println("\n" + list.size());
        list.remove(2);
        list.print();
        list.clear();
        System.out.println();
        list.print();
    }
}