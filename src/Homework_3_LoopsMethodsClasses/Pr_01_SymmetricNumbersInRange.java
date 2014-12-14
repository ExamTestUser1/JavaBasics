package Homework_3_LoopsMethodsClasses;

import java.util.Scanner;

public class Pr_01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = Integer.parseInt(scan.next());
        System.out.print("Enter the end number: ");
        int end = Integer.parseInt(scan.next());

        for (int i = start; i <= end; i++) {
            String num = Integer.toString(i);

            if (num.length() == 1)
                System.out.print(num + " ");

            else if (num.length() > 1 && num.charAt(0) == num.charAt(num.length() - 1))
                    System.out.print(num + " ");
        }
        
        scan.close();
	}

}
