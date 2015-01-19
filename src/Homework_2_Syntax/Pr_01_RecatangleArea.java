package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_01_RecatangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the both sides,a and b:  ");
        float a = Float.parseFloat(scan.next("\\w+"));
        float b = Float.parseFloat(scan.next("\\w+"));

        float c = a * b;
        System.out.printf("The area of a rectangle is %f ", c);

        scan.close();
	}

}
