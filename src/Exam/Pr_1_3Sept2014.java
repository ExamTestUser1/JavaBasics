package Exam;

import java.util.Scanner;

public class Pr_1_3Sept2014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsCount = 0;
        int dozensCount = 0;

        for (int i = 0; i < 7 ; i++) {
            String input = scan.nextLine();
            String[] inputArray = input.split(" ");
            int num = Integer.parseInt(inputArray[0]);
            if (inputArray[1].equals("eggs")) {
                eggsCount += num;
            } else {
                dozensCount += num;
            }
        }
        if (eggsCount >= 12) {
            dozensCount += (eggsCount/ 12);
            eggsCount = eggsCount%12;
        }

        System.out.println(dozensCount + " dozens + " + eggsCount + " eggs");
    }
}
