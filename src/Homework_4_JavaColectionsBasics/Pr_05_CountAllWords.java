package Homework_4_JavaColectionsBasics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr_05_CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int count = 0;

        Pattern textPattern = Pattern.compile("\\w+");
        Matcher matcher = textPattern.matcher(text);

        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
