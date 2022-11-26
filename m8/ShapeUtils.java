import java.util.List;
import java.util.Scanner;

public class ShapeUtils {
    public List createArray(List<Shape> lst){
        int amountOfObj = askForObjectsAmount();
        createTriangle(amountOfObj, lst);
        createCircle(amountOfObj, lst);
        createSquare(amountOfObj, lst);
        createOval(amountOfObj, lst);
        createQuad(amountOfObj, lst);
        return lst;
    }

    private List createTriangle(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Triangle());
        }
        return lst;
    }

    private List createCircle(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Circle());
        }
        return lst;
    }

    private List createQuad(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Quad());
        }
        return lst;
    }

    private List createSquare(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Square());
        }
        return lst;
    }

    private List createOval(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Oval());
        }
        return lst;
    }

    private int askForObjectsAmount(){
        System.out.print("Enter how much objects of each class do you want: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
