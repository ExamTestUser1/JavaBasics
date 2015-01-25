package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_26May2014_Pr_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> hours = new ArrayList<>();
        ArrayList<Integer> minutes = new ArrayList<>();
        while (scan.hasNext()){
            String inputString = scan.nextLine();
            if (inputString.equals("End")) {
                break;
            }else {
                String[] input = inputString.split("[:]+");
                hours.add(Integer.parseInt(input[0]));
                minutes.add(Integer.parseInt(input[1]));
            }
        }

        int durationHours = 0;
        int durationMinutes = 0;

        for (int i = 0; i < hours.size(); i++) {
            durationHours += hours.get(i);
            durationMinutes += minutes.get(i);
        }

        if (durationMinutes >= 60){
            durationHours += durationMinutes / 60;
            durationMinutes = durationMinutes % 60;
        }

        if (durationMinutes < 10){
            System.out.println(durationHours + ":0" + durationMinutes);
        }else {
            System.out.println(durationHours + ":" + durationMinutes);
        }

    }
}
