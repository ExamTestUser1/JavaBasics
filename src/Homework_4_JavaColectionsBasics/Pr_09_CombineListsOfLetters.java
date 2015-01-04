package Homework_4_JavaColectionsBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_09_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letters1 = scan.nextLine();
        String letters2 = scan.nextLine();

        String[] str1 = letters1.split(" ");
        String[] str2 = letters2.split(" ");

        ArrayList<Character> list1 = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();

        for (String ch : str1){
            list1.add(ch.charAt(0));
        }

        for (String ch : str2){
            list2.add(ch.charAt(0));
        }

        for (char ch : list1){
            System.out.print(ch + " ");
        }

        for (char ch : list2){
            if(!list1.contains(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}
