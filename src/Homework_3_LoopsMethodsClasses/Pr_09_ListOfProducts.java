package Homework_3_LoopsMethodsClasses;

import java.io.*;
import java.util.StringTokenizer;

public class Pr_09_ListOfProducts {
    public static void main(String[] args) {

        try {
            int n = readLinesNumber();
            Product[] menu = readInputFile(n);

            printInput(menu);

            String [] output = Product.priceSort(menu, n);

            writeToFile(output);
        }

        catch (IOException err) {
            System.err.println(err.getMessage());
        }

    }

    public static int readLinesNumber() throws IOException {

        int numberOfLines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Homework_3_LoopsMethodsClasses/input9.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                numberOfLines++;
            }
            br.close();
        }

        catch (IOException err) {
            System.err.println("File not found " + err.getMessage());
        }

        return numberOfLines;
    }   //reads how many lines are in the file (this int is used to create arrays)

    public static Product[] readInputFile(int lines) throws IOException {

        int n = lines;
        Product[] menu = new Product[n];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Homework_3_LoopsMethodsClasses/input9.txt"));

            for (int i = 0; i < menu.length; i++) {
                String line = reader.readLine();
                StringTokenizer tokenizer = new StringTokenizer(line);
                String name = tokenizer.nextToken();
                double price = Double.parseDouble(tokenizer.nextToken());
                menu[i] = new Product(name, price);
            }

            reader.close();

        }

        catch (FileNotFoundException err) {
            System.err.println("File not found");
        }

        return menu;
    }   //reads the data from the file and creates Product[]

    public static void printInput(Product[] objectArray) throws IOException{

        System.out.println("The input data from the file is: \n");
        for (Product item : objectArray) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }   //(optional) - displays what was read from the input file

    public static void writeToFile(String[] output) {

        BufferedWriter out;
        String[] outputData = output;
        try {
            out = new BufferedWriter(new FileWriter("src/Homework_3_LoopsMethodsClasses/output9.txt"));
            for (String item : outputData) {
                out.write(item + "\n");
            }
            out.close();
        }

        catch (IOException err) {
            System.err.println("Error" + err.getMessage());
        }
    }   //writes the sorted data to output.txt
}
