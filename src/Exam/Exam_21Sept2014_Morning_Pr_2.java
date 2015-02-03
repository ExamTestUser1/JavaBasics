package Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_21Sept2014_Morning_Pr_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> maxNums = new ArrayList<>();
        int maxSum = -31000;
        int minPos = 0;
        boolean found = false;

        while (!input.equals("End")){
            int number = Integer.parseInt(input);
            nums.add(number);
            input = scan.nextLine();
        }

        for (int a = 0; a < nums.size()- 2; a++) {
            for (int b = a + 1; b < nums.size() - 1; b++) {
                for (int c = b + 1; c < nums.size(); c++) {
                    int sum = nums.get(a) + nums.get(b) + nums.get(c);
                    int pos = a + b + c;
                    if (sum % D == 0 && sum > maxSum ){
                        maxSum = sum;
                        minPos = pos;
                        maxNums.clear();
                        maxNums.add(nums.get(a));
                        maxNums.add(nums.get(b));
                        maxNums.add(nums.get(c));
                        found = true;
                    }else if (sum % D == 0 && sum == maxSum && pos < minPos){
                        minPos = pos;
                        maxNums.clear();
                        maxNums.add(nums.get(a));
                        maxNums.add(nums.get(b));
                        maxNums.add(nums.get(c));
                        found = true;
                    }else if (sum == 0 && sum > maxSum){
                        maxSum = sum;
                        minPos = pos;
                        maxNums.clear();
                        maxNums.add(nums.get(a));
                        maxNums.add(nums.get(b));
                        maxNums.add(nums.get(c));
                        found = true;
                    }else if (sum == 0 && sum == maxSum && pos > minPos) {
                        minPos = pos;
                        maxNums.clear();
                        maxNums.add(nums.get(a));
                        maxNums.add(nums.get(b));
                        maxNums.add(nums.get(c));
                        found = true;
                    }
                }
            }
        }

         if(!found){
             System.out.println("No");
         }else{
             System.out.println("(" + maxNums.get(0) + " + " + maxNums.get(1) + " + " + maxNums.get(2) + ") % " + D + " = 0");
         }
    }
}
