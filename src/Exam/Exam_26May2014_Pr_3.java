package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_26May2014_Pr_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split("\\D+");
        Long maxSum = Long.valueOf(0);
        Long sum = Long.valueOf(0);

        ArrayList<Long> sides = new ArrayList<Long>();
        ArrayList<Long> areas = new ArrayList<Long>();

        for (int i = 1; i < str.length; i++) {
            sides.add(Long.parseLong(str[i]));
        }

        for (int i = 0; i < sides.size()- 1; i+=2) {
            areas.add(sides.get(i) * sides.get(i+1));
        }

        for (int i = 0; i < areas.size()-2; i++) {
            sum = areas.get(i) + areas.get(i+1) + areas.get(i+2);
            if (sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
