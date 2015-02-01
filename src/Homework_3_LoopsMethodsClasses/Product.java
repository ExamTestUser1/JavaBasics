package Homework_3_LoopsMethodsClasses;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Product {

    private String name;
    private double price;

    public Product(String prodName, double prodPrice) {     //constructor - creates the object
        name = prodName;
        price = prodPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static String[] priceSort(Product[] products, int arraySize) {

        int size = arraySize;
        String[] menu = new String[size];
        String[] sortedMenu = new String[size];
        for (int i = 0; i < size; i++) {
            menu[i] = products[i].getPrice() + " " + products[i].getName();
        }

        double[] prices = new double[size];
        for (int i = 0; i < 4; i++) {
            prices[i] = products[i].getPrice();
        }

        Arrays.sort(prices);

        for (int i = 0; i < size; i++) {
            for (String item : menu) {
                StringTokenizer str = new StringTokenizer(item);
                double a = Double.parseDouble(str.nextToken());
                if (prices[i] == a) {
                    sortedMenu[i] = item;
                }
            }
        }

        return sortedMenu;
    }   //sorts the array and saves in String array, formatted as requested
}
