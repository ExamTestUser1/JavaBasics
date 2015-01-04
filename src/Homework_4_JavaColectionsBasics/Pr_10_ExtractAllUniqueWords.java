package Homework_4_JavaColectionsBasics;

import java.util.*;

public class Pr_10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        String[] arr = input.split("\\W+");
        Set<String> words = new TreeSet<String>();

        for (String word : arr) {
            words.add(word);
        }

        for (String word : words){
            System.out.print(word + " ");
        }
    }
}
