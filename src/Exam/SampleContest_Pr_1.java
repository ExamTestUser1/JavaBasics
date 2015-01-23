package Exam;

import java.util.Scanner;

public class SampleContest_Pr_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double x = Double.parseDouble(scan.nextLine());
        Double y = Double.parseDouble(scan.nextLine());

        if (x == 0 && y == 0)
            System.out.println("0");
        else if (x == 0)
            System.out.println("5");
        else if (y == 0)
            System.out.println("6");
        else if (x > 0 && y > 0)
            System.out.println("1");
        else if (x < 0 && y > 0)
            System.out.println("2");
        else if (x < 0 && y < 0)
            System.out.println("3");
        else if (x > 0 && y < 0)
            System.out.println("4");

    }
}
