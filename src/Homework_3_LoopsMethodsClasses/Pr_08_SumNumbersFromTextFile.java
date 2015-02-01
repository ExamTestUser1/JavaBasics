package Homework_3_LoopsMethodsClasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pr_08_SumNumbersFromTextFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/Homework_3_LoopsMethodsClasses/input.txt"));
        long sum = 0;

        try {
            String line = br.readLine();

            while (line != null) {
                sum += Long.parseLong(line);
                line = br.readLine();
            }

            System.out.println(sum);
            br.close();
        }

        catch (IOException ex) {
        System.out.println("Error");
        }
    }
}
