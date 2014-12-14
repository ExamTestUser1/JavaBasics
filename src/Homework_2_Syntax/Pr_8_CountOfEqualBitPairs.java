package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_8_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.next());
        int count = 0;
        String binaryNum = Integer.toBinaryString(num);

        for (int i = 0; i < binaryNum.length()- 1; i++) {
            if ((num >> i & 3) == 3 || (num >> i & 3) == 0)
                count++;
        }

        System.out.println(count);

        scan.close();
	}

}
