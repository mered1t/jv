package jv;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
public class FileSolve {

    private StringBuilder correctNumbers = new StringBuilder();

    public void printSolution(){
        findCorrectNumbers();
        System.out.print("\nSuitable phones:\n" + correctNumbers.toString());
    }

    private void findCorrectNumbers(){
        Pattern p = Pattern.compile("\\(\\d{3}\\) \\d{3}-?\\d{4}|(?:\\d{3}-){2}\\d{4}");
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(p.matcher(line).matches()){
                    correctNumbers.append(line + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createFile(){
        File file = new File("file.txt");
        StringBuilder text = new StringBuilder();
        int linesAmount = askForLinesAmount();

        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Enter phone numbers:");
            for (int i = 0; i < linesAmount; i++) {
                Scanner scanner = new Scanner(System.in);
                text.append(scanner.nextLine() + "\n");
            }
            writer.write(text + "\n");
            writer.flush();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());}
    }

    private int askForLinesAmount(){
        System.out.print("Enter phones amount: ");
        Scanner scanner = new Scanner(System.in);

        String linesAmount = scanner.nextLine();
        while(!isDigit(linesAmount) || Integer.parseInt(linesAmount) <= 0){
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
