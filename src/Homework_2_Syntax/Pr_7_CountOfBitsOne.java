package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.next());
        int count = 0;
        String binaryNum = Integer.toBinaryString(num);

        for (int i = 0; i < binaryNum.length(); i++) {
            if ((num >> i & 1) == 1)
                count++;
        }

        System.out.println(count);
	}
}
