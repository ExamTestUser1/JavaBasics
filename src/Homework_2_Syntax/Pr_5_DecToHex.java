package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_5_DecToHex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int decNum = Integer.parseInt(scan.next());
        String hexNum = Integer.toHexString(decNum).toUpperCase();
        System.out.println(hexNum);
        
        scan.close();
	}

}
