package Homework_4_JavaColectionsBasics;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pr_11_MostFrequentWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().toLowerCase().split("\\W+");
        Map<String, Integer> words = new TreeMap<String, Integer>();

        for (String word : input) {
            Integer count = words.get(word);
            if (count == null) {
                count = 0;
            }
            words.put(word, count + 1);
        }

        for (String word : words.keySet()){
            if(words.get(word)  >1){
                System.out.println(word + " -> " + words.get(word) + " times");
            }
        }
    }
}
