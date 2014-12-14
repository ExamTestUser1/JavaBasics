package Homework_2_Syntax;

import java.util.Arrays;
import java.util.Scanner;

public class Pr_4_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        float[] nums = new float[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextFloat();
        }
        Arrays.sort(nums);
        System.out.println(nums[0]);
        
        scan.close();

	}

}
