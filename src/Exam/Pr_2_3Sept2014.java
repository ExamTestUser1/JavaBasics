package Exam;

import java.util.Scanner;

public class Pr_2_3Sept2014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] angle = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            angle[i] = scan.nextInt();
        }

        for (int i = 0; i < angle.length - 2; i++) {
            for (int j = i + 1; j < angle.length - 1; j++) {
                for (int k = i + 2; k < angle.length; k++) {
                    int sum = angle[i] + angle[j] + angle[k];
                    if (sum % 360 == 0 && i < j && j < k){
                        System.out.println(angle[i] + " + " + angle[j] + " + " + angle[k] + " = " + sum + " degrees");
                        count++;
                    }
                }
            }
        }
        if (count == 0)
            System.out.println("No");
    }
}
