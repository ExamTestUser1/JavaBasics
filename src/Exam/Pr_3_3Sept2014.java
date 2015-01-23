package Exam;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pr_3_3Sept2014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] inputArray = input.split("\\D+");
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i < inputArray.length; i++) {
            nums.add(Integer.parseInt(inputArray[i]));
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) <= 1) {
                nums.remove(i);
                i--;
            } else if (nums.get(i) != 2){
                for (int j = 2; j <= Math.sqrt(nums.get(i)); j++) {
                    if (nums.get(i)%j == 0 && nums.get(i)/j != 0) {
                        nums.remove(i);
                        i--;
                        break;
                    }
                }
            }
        }
        Collections.sort(nums, Collections.reverseOrder());

        for (int i = 0; i < nums.size()- 1; i++) {
            if (nums.get(i) == nums.get(i+1)){
                nums.remove(nums.get(i));
                i--;
            }
        }

        if ((nums.size() < 3) || (nums.get(0) == null)) {
            System.out.println("No");
        }else {
            int sum = nums.get(0) + nums.get(1) + nums.get(2);
            System.out.println(sum);
        }
    }
}
