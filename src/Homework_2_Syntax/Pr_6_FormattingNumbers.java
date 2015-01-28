package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        float b = Float.parseFloat(scan.next());
        float c = Float.parseFloat(scan.next());

        String hexA = Integer.toHexString(a).toUpperCase();
        String binaryA = "0000000000".substring(Integer.toBinaryString(a).length()) + Integer.toBinaryString(a);

        System.out.printf("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|", hexA, binaryA, b, c);

        scan.close();
	}

}
