package Homework_4_JavaColectionsBasics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr_12_CardsFrequencies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\W+");
        Map<String, Integer> faces = new TreeMap<String, Integer>();
        int faceCount = 0;
        int index;

        for (String face : input) {
            Integer count = faces.get(face);
            if (count == null) {
                count = 0;
            }
            faces.put(face, count + 1);
        }

        for (int i = 0; i < input.length; i++) {
            if (i == faces.size())
                break;
            for (String face : faces.keySet()) {
                if (face.equals(input[i]) && faceCount == 0) {
                    index = faces.get(face);
                    float num = index*(float)(10);
                    System.out.printf("%1$s -> %2$.2f", face, num);
                    System.out.print("% \n");
                    faceCount = 1;
                }
            }
            faceCount = 0;
        }
    }
}
