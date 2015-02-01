package Exam;

import java.util.Scanner;

public class Exam_21Sept2014_Morning_Pr_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstInput = scan.nextLine();
        String secondInput = scan.nextLine();
        String[] str1 = firstInput.split("[:]+");
        String[] str2 = secondInput.split("[:]+");

        int[] time1 = new int[3];
        int[] time2 = new int[3];

        for (int i = 0; i < 3; i++) {
            time1[i] = Integer.parseInt(str1[i]);
            time2[i] = Integer.parseInt(str2[i]);
        }

        long diff = (long)(time1[0] *  3600 + time1[1] * 60 + time1[2]) - (time2[0] * 3600 + time2[1] * 60 + time2[2]);

        long hour = diff/3600;
        long minutes = (diff % 3600) / 60;
        long sec =  (diff % 3600) % 60;

        System.out.printf("%1$d:%2$02d:%3$02d", hour, minutes, sec);
    }
}
