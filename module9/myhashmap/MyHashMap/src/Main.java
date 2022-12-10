public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<>();

        hashMap.put(1, "Denis");
        hashMap.put(5, "Wednesday");
        hashMap.put(2, "Monday");
        hashMap.put(2, "man");
        hashMap.put(54, "Friday");
        hashMap.print();
        System.out.println("get(5): " + hashMap.get(5));
        System.out.println("size: " + hashMap.size());
        hashMap.remove(1);
        hashMap.print();
        hashMap.clear();
        hashMap.print();
    }
}