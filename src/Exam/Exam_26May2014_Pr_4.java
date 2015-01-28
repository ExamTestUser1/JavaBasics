package Exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exam_26May2014_Pr_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\D+");
        ArrayList<String> couples = new ArrayList<String>();
        TreeMap<String, Integer> strings = new TreeMap<String, Integer>();


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

        TreeSet<String> printedCouples = new TreeSet<>();
        for (int i = 0; i < couples.size(); i++) {
            if (! printedCouples.contains(couples.get(i))){
                float frequency = (float) strings.get(couples.get(i)) / (couples.size());
                System.out.printf("%1$s -> %2$.2f%%\n", couples.get(i), frequency*100);
            }
            printedCouples.add(couples.get(i));
        }
    }
}
