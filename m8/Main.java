import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> lst = new ArrayList<>();
        ShapeUtils utils = new ShapeUtils();

        utils.createArray(lst);
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(i+1  + ") ");lst.get(i).outputClassName();
        }
    }
}