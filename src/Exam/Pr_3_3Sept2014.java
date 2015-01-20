package Exam;

import java.util.Scanner;

public class Pr_3_3Sept2014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] inputArray = input.split("\\D+");
        //int[] nums = new int[inputArray.length];



        for (int i = 0; i < inputArray.length; i++) {
            //nums[i] = Integer.parseInt(inputArray[i]);
            System.out.println(inputArray[i]);
        }
    }
}
