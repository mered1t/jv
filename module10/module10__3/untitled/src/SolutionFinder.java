import java.io.*;
import java.util.*;

public class SolutionFinder {

    private StringBuilder textFromFile = new StringBuilder();

    public void processMethods(HashMap result){
        createFile();
        readFile();
        findSolution(result);
        sortResult(result);
        printHashMap(result);
    }

    private void sortResult(HashMap<String, Integer> result){
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(result.entrySet());

        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<String, Integer> int1,
                               Map.Entry<String, Integer> int2) {
                return (int2.getValue()).compareTo(int1.getValue());
            }
        });

        result.clear();
        for (Map.Entry<String, Integer> integer : list) {
            result.put(integer.getKey(), integer.getValue());
        }
    }

    private void printHashMap(HashMap<String, Integer> hm1){
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println(en.getKey() +
                    " " + en.getValue());
        }
    }

    private void findSolution(HashMap<String, Integer> wordCounter){
        String[] splitText = textFromFile.toString().split(" ");

        for (String word : splitText) {
            Integer integer = wordCounter.get(word);

            if(integer == null){
                wordCounter.put(word, 1);}
            else{
                wordCounter.put(word, integer + 1);
            }
        }
    }

    private void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                textFromFile.append(line + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());}
    }

    private void createFile(){
        File file = new File("words.txt");
        int linesAmount = askForLinesAmount();

        try (FileWriter writer = new FileWriter(file)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter lines:");
            for (int i = 0; i < linesAmount; i++)
            {
                writer.write(scanner.nextLine() + "\n");
            }
            writer.flush();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());}
    }

    private int askForLinesAmount(){
        System.out.print("Enter lines amount: ");
        Scanner scanner = new Scanner(System.in);

        String linesAmount = scanner.nextLine();
        while(linesAmount.isBlank() || !isDigit(linesAmount) || Integer.parseInt(linesAmount) <= 0){
            System.out.print("Enter correct number: ");
            linesAmount = scanner.nextLine();
        }
        return Integer.parseInt(linesAmount);
    }

    private boolean isDigit(String numbers){
        for (char number: numbers.toCharArray()) {
            if(!Character.isDigit(number)){
                return false;
            }
        }
        return true;
    }
}