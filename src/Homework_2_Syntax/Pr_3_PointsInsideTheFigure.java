package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_3_PointsInsideTheFigure {

	public static void main(String[] args) {
		System.out.print("Enter a pair of two floating-point numbers, x and y, separated by a space: ");
        Scanner input = new Scanner(System.in);
        float x = Float.parseFloat(input.next());
        float y = Float.parseFloat(input.next());
        boolean firstCondition = ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 8.5)) ? true : false;
        boolean secondCondition = ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) ? true : false;
        boolean thirdCondition = ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) ? true : false;

        if (firstCondition || secondCondition || thirdCondition) {
           System.out.println("Inside");
        } else {
        	System.out.println("Outside");
        }
           
        input.close();

	}

}
