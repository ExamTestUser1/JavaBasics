package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_21Sept2014_Morning_Pr_3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String input = scan.nextLine();
        String[] words;
        int weight = 0;
        int tempWeight = 0;

        input = input.replace("\\", "");
        input = input.replace("/", "");
        input = input.replace("(", "");
        input = input.replace(")", "");
        input = input.replace("|", "");
        input = input.replace(" ", "");

        words = input.trim().split("\\W+");

        ArrayList<String> maxWords = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < words.length - 1; i++) {
            temp.add(words[i]);
            temp.add(words[i + 1]);

            for (int j = 0; j < temp.get(0).length(); j++){
                tempWeight += temp.get(0).charAt(j) - 64;
            }
            for (int k = 0; k < temp.get(1).length(); k++) {
                tempWeight += temp.get(1).charAt(k) - 64;
            }

            if (i == 0) {
                sum += temp2;
                maxWords[0] = tempWord;
            }else if (i == 1){
                sum += temp2;
                temp1 = temp2;
            }else if (temp1 + temp2 >= sum){
                sum = temp1 + temp2;
                temp1 = temp2;
                word1 = word2;
                word2 = tempWord;
            }
            temp2 = 0;
        }
        System.out.println(word1);
        System.out.println(word2);
    }
}
