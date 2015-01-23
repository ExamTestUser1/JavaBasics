package Exam;

import java.util.Scanner;
import java.util.TreeMap;

public class Pr_4_3Sept2014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<Byte, TreeMap<String, Integer>> activity = new TreeMap<>();

        String[] input;
        for (int i = 0; i < n; i++) {
            input = scan.nextLine().split("[/, ]+");
            String tracker = input[3];
            Float metersInput = Float.parseFloat(input[4]);
            int meters = (int) Math.floor(metersInput);
            byte month = Byte.parseByte(input[1]);



            if (!activity.containsKey(month)){
                activity.put(month, new TreeMap<String, Integer>());
            }

            int metersCount = 0;
            TreeMap<String, Integer> info = activity.get(month);
            if (info.containsKey(tracker)){
                metersCount = info.get(tracker);
            }
            info.put(tracker, (metersCount + meters));
        }

        for (Byte item : activity.keySet()){
            System.out.print(item + ": ");
            System.out.println(activity.get(item)
                                        .toString()
                                        .replace("{", "")
                                        .replace("}", ")")
                                        .replace("=", "(")
                                        .replace(",", "),"));
        }
    }
}
