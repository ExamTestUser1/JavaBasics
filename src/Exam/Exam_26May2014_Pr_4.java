package Exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Exam_26May2014_Pr_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\D+");
        ArrayList<String> couples = new ArrayList<String>();
        TreeMap<String, Integer> strings = new TreeMap<String, Integer>();
        ArrayList<String> unique = new ArrayList<>();

        int uniqueCount = 0;

        for (int i = 0; i < input.length - 1; i++) {
            String temp = input[i] + " " + input[i + 1];
            couples.add(temp);
        }
        Float percentPerOne = Float.valueOf(100)/couples.size();

        for (String couple : couples) {
            Integer count = strings.get(couple);
            if (count == null) {
                count = 0;
            }
            strings.put(couple, count + 1);
        }

        for (int i = 0; i < couples.size(); i++) {
            for (String item : strings.keySet()) {
                if (couples.get(i).equals(item)) {
                    for (String uni : unique) {
                        if (item.equals(uni))
                            uniqueCount++;
                    }
                    if (uniqueCount == 0)
                        unique.add(item);
                }
                uniqueCount = 0;
            }
        }
//test//test1
        for (int i = 0; i < unique.size(); i++) {
            for (String item : strings.keySet()){
                if (unique.get(i).equals(item)) {
                    System.out.printf("%1$s -> %2$.2f", item, (strings.get(item) * percentPerOne));
                    System.out.print("% \n");
                }
            }
        }
    }
}
