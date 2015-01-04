package Homework_4_JavaColectionsBasics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr_08_ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        Pattern textPattern = Pattern.compile("[a-zA-Z\\d]+[[\\.\\_\\-]{1}[a-zA-Z]+]*@[a-zA-Z]+[[\\-]{0,1}[a-zA-Z]+]*.[a-zA-Z]+[\\.]{1}[a-zA-Z]+]*");
        Matcher matcher = textPattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
