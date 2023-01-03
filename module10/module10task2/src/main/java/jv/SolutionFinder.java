package jv;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.List;
import java.util.Random;

public class SolutionFinder {
    public void createFile(String fileName){
        File file = new File(fileName);
        try {
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("name age\n");
            fileWriter.write(fillFile());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());}
    }

    private String fillFile(){
        StringBuilder text = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < rand.nextInt(20-5); i++)
        {
            text.append(createRandomWord(rand.nextInt(10))).append(" ")
                    .append(rand.nextInt(99)).append("\n");
        }
        return text.toString();
    }

    private String createRandomWord(int len){
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int v = 1 + (int) (Math.random() * 26);
            char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
            name.append(c);
        }
        return name.toString();
    }

    public void readFile(List<User> list, String fileName){
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.equals("name age")){continue;}
                String[] userData = line.split("\\s+");
                list.add(new User(userData[0], Integer.parseInt(userData[1])));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());}
    }

    public void toJsonList(List<User> list, String fileName){
        File file = new File(fileName);
        try {
            FileWriter fileWriter = new FileWriter(file);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = gson.toJson(list);
            fileWriter.write(jsonString);

            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());}
    }
}