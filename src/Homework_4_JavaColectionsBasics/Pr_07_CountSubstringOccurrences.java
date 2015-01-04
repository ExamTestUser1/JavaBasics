package Homework_4_JavaColectionsBasics;

import java.util.Scanner;

public class Pr_07_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String word = scan.nextLine().toLowerCase();
        int index = text.indexOf(word);
        int count = 0;

        while (index != -1){
            count++;
            index = text.indexOf(word, index + 1);
        }
        System.out.println(count);
    }
}
