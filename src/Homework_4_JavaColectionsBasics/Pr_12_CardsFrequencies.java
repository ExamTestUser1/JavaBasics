package Homework_4_JavaColectionsBasics;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr_12_CardsFrequencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        Map<String, Integer> faces = new TreeMap<String, Integer>();
        float frequencyPerOne = (float)100 / input.length;
        int index;

        for (String face : input) {
            Integer count = faces.get(face);
            if (count == null) {
                count = 0;
            }
            faces.put(face, count + 1);
        }

        HashSet<String> temp = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            if (!temp.contains(input[i])){
                temp.add(input[i]);

                index = faces.get(input[i]);
                float frequency = index*frequencyPerOne;
                System.out.printf("%1$s -> %2$.2f", input[i], frequency);
                System.out.print("% \n");
            }
        }
    }
}
