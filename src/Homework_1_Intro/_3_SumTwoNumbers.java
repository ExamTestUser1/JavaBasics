package Homework_1_Intro;

import java.util.Scanner;

public class _3_SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number a = ");
	    int a = input.nextInt();
	    System.out.print("Enter a number b = ");
	    int b = input.nextInt();
	    int sum = a + b;
	    System.out.println("The sum is: " + sum);
	    input.close();

	}

}
