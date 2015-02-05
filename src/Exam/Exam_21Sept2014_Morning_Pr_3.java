package Exam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam_21Sept2014_Morning_Pr_3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String input = scan.nextLine();
        ArrayList<String> words = new ArrayList<>();
        long weight = 0;
        long tempWeight = 0;

        input = input.replace("\\", "");
        input = input.replace("/", "");
        input = input.replace("(", "");
        input = input.replace(")", "");
        input = input.replace("|", "");
        input = input.replace(" ", "");
        Pattern textPattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = textPattern.matcher(input);

        while (matcher.find()){
            words.add(matcher.group());
        }

        ArrayList<String> maxWords = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < words.size() - 1; i++) {
            temp.add(words.get(i));
            temp.add(words.get(i + 1));

            for (int j = 0; j < temp.get(0).length(); j++){
                tempWeight += temp.get(0).toUpperCase().charAt(j) - 64;
            }
            for (int k = 0; k < temp.get(1).length(); k++) {
                tempWeight += temp.get(1).toUpperCase().charAt(k) - 64;
            }

            if (i == 0) {
                weight = tempWeight;
                maxWords.add(words.get(i));
                maxWords.add(words.get(i + 1));
            }else if (tempWeight >= weight){
                weight = tempWeight;
                maxWords.clear();
                maxWords.add(words.get(i));
                maxWords.add(words.get(i + 1));
            }
            tempWeight = 0;
            temp.clear();
        }
        System.out.println(maxWords.get(0));
        System.out.println(maxWords.get(1));
    }
}
