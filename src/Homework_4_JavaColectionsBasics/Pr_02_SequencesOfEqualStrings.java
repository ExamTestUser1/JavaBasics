package Homework_4_JavaColectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Pr_02_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] inputArray = input.split(" ");

        if (inputArray.length == 1)
            System.out.println(inputArray[0]);
        else {
            for (int i = 0; i < inputArray.length - 1; i++) {
                int j = i + 1;

                if (inputArray[i].equals(inputArray[j])) {
                    if (j == inputArray.length - 1)
                        System.out.print(inputArray[i] + " " + inputArray[j]);
                    else
                        System.out.print(inputArray[i] + " ");
                } else if (!inputArray[i].equals(inputArray[j])) {
                    if (j == inputArray.length - 1) {
                        System.out.println(inputArray[i]);
                        System.out.println(inputArray[j]);
                    } else {
                        System.out.print(inputArray[i]);
                        System.out.println();
                    }
                }
            }
        }
    }
}
