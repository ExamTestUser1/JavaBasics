package Exam;

import java.util.Scanner;

public class Exam_26May2014_Pr_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] == 0){
                count++;
                System.out.println(arr[i] + "*" + arr[i] + " + " + arr[i] + "*" + arr[i] + " = " + arr[i] + "*" + arr[i]);
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if ((arr[i]*arr[i] + arr[j]*arr[j]) == arr[k]*arr[k]){
                        count++;
                        if (arr[i] < arr[j]) {
                            System.out.println(arr[i] + "*" + arr[i] + " + " + arr[j] + "*" + arr[j] + " = " + arr[k] + "*" + arr[k]);
                        }else{
                            System.out.println(arr[j] + "*" + arr[j] + " + " + arr[i] + "*" + arr[i] + " = " + arr[k] + "*" + arr[k]);
                        }
                    }
                }
            }
        }
        if (count == 0)
            System.out.println("No");
    }
}
