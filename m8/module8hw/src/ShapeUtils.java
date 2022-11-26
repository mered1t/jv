import java.util.List;
import java.util.Scanner;

public class ShapeUtils {
    public List createArray(List<Shape> lst){ // функція ініціалізації масиву об'єктів
        int amountOfObj = askForObjectsAmount();
        createTriangle(amountOfObj, lst); // створення трикутників
        createCircle(amountOfObj, lst); // створення кругів
        createSquare(amountOfObj, lst); // створення квадратів
        createOval(amountOfObj, lst); // створення овалів
        createQuad(amountOfObj, lst); // створення прямокутників
        return lst;
    }

    private List createTriangle(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Triangle()); // створення трикутників
        }
        return lst;
    }

    private List createCircle(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Circle()); // створення кругів
        }
        return lst;
    }

    private List createQuad(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Quad()); // створення квадратів
        }
        return lst;
    }

    private List createSquare(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Square()); // створення овалів
        }
        return lst;
    }

    private List createOval(int counter, List<Shape> lst){
        for (int i = 0; i < counter; i++){
            lst.add(new Oval()); // створення прямокутників
        }
        return lst;
    }

    private int askForObjectsAmount(){
        System.out.print("Enter how much objects of each class do you want: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt(); // запит числа об'єктів кожного класу
    }
}
