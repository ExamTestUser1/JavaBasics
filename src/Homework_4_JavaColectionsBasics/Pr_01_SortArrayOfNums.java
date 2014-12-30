package Homework_4_JavaColectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Pr_01_SortArrayOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number n = ");
        int n = Integer.parseInt(scan.nextLine());
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);

        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
