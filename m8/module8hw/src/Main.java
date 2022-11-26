import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> lst = new ArrayList<>(); // масив об'єктів
        ShapeUtils utils = new ShapeUtils(); // об'єкт утиліт методів

        utils.createArray(lst); // створення масиву об'єктів
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(i+1  + ") ");lst.get(i).outputClassName(); // вивід назви об'єкту
        }
    }
}