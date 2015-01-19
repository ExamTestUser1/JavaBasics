package Homework_4_JavaColectionsBasics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr_03_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] elements = input.nextLine().split(" ");
        Map<String, Integer> sequences = new TreeMap<String, Integer>();

        for (String element : elements) {
            Integer count = sequences.get(element);
            if (count == null) {
                count = 0;
            }
            sequences.put(element, count + 1);
        }

        Map.Entry<String, Integer> maxSequence = null;
        for (Map.Entry<String, Integer> sequence : sequences.entrySet()) {
            if (maxSequence == null || sequence.getValue() > maxSequence.getValue()) {
                maxSequence = sequence;
            }
        }

        for (int i = 0; i <maxSequence.getValue() ; i++) {
            System.out.print(maxSequence.getKey() + " ");
        }
    }
}


