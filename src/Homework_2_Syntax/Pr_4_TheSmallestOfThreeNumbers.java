package Homework_2_Syntax;

import java.util.Arrays;
import java.util.Scanner;

public class Pr_4_TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        float[] nums = new float[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Float.parseFloat(scan.next());
        }
        Arrays.sort(nums);

        if ((nums[0]) % 1 == 0) {
            System.out.println((int)(nums[0]));
        } else {
            System.out.println(nums[0]);
        }
	}
}
