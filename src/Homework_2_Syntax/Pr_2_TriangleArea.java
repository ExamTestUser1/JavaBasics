package Homework_2_Syntax;

import java.util.Scanner;

public class Pr_2_TriangleArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        float ax, ay, bx, by, cx, cy;
        ax = scan.nextFloat();
        ay = scan.nextFloat();
        bx = scan.nextFloat();
        by = scan.nextFloat();
        cx = scan.nextFloat();
        cy = scan.nextFloat();
        float area = Math.abs((ax*(by - cy) + bx*(cy - ay) + cx*(ay -by)) / 2);

        if (area == 0)
            System.out.println("0");

        else
            System.out.println("The area of the triangle is: " + area);
        
        scan.close();

	}

}
