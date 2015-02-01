package Homework_4_JavaColectionsBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_04_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] inputArray = input.split(" ");
        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }

        ArrayList<Integer> maxSequence = new ArrayList<Integer>();
        ArrayList<Integer> sequences = new ArrayList<Integer>();

        maxSequence.add(nums[0]);
        sequences.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sequences.add(nums[i]);
            } else {
                for (int num : sequences) {
                    System.out.print(num + " ");
                }
                System.out.println();
                sequences.clear();
                sequences.add(nums[i]);
            } if (sequences.size() > maxSequence.size()) {
                maxSequence = new ArrayList<Integer>(sequences);
            }
        }

        for (int num : sequences) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Longest: ");

        for (int num : maxSequence) {
            System.out.print(num + " ");
        }
    }
}
