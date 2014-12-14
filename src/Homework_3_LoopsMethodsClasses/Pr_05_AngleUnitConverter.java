package Homework_3_LoopsMethodsClasses;

import java.util.Scanner;

public class Pr_05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            double angle = scan.nextDouble();
            String measure = scan.next();

            if (measure.equals("deg")){
                double rad = (angle * Math.PI) / 180;
                System.out.printf("%.6f rad", rad);
            }
            else{
                double deg = (angle * 180) / Math.PI;
                System.out.printf("%.6f deg", deg);
            }
        }
        //test
        scan.close();
	}
}
