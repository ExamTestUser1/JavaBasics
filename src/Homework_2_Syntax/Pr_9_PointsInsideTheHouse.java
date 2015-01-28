package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_9_PointsInsideTheHouse {
    public static void main(String[] args) {
        System.out.print("Enter a pair of two floating-point numbers, x and y, separated by a space: ");
        Scanner input = new Scanner(System.in);
        float x = Float.parseFloat(input.next());
        float y = Float.parseFloat(input.next());
        boolean firstCondition = ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) ? true : false;
        boolean secondCondition = ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) ? true : false;
        boolean thirdCondition = ((17.5 - 12.5) * (y - 8.5) - (3.5 - 8.5) * (x - 12.5) >= 0 &&
                (17.5 - 22.5) * (y - 8.5) - (3.5 - 8.5)*(x - 22.5) <= 0 && y <= 8.5);

        if (firstCondition || secondCondition || thirdCondition) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }

        input.close();
    }
}
