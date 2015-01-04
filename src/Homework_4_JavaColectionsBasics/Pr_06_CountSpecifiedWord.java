package Homework_4_JavaColectionsBasics;

import java.util.Scanner;

public class Pr_06_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] words = text.split("\\W+");
        String word = scan.nextLine();
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (word.equalsIgnoreCase(words[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
