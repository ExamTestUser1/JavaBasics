package DebuggingLab;

import java.util.ArrayList;
import java.util.Scanner;

public class Pr_3_BePositive {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        int countSequences = Integer.parseInt(scn.nextLine());//parsing

        for (int i = 0; i < countSequences; i++) {
            String[] input = scn.nextLine().trim().split(" ");

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int j = 0; j < input.length; j++) {
                if (!input[j].equals("") ) {
                    int num = Integer.parseInt(input[j]);
                    numbers.add(num);
                }
            }

            boolean found = false;

            for (int j = 0; j < numbers.size(); j++) {
                int currentNum = numbers.get(j);

                if (currentNum >= 0) {//>=0
                    System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");//changing positions ot " " and "\n"
                    found = true;
                } else {
                    if (j + 1 < numbers.size()) { //j+1 < numbers.size
                        currentNum += numbers.get(j + 1);

                        if (currentNum >= 0) {//>=0
                            System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");//changing positions ot " " and "\n"
                            found = true;
                            j++;//eliminate repeating the same number
                        }
                    }
                }
            }

            if (!found) {
                System.out.println("(empty)");
            }
        }
    }
}
