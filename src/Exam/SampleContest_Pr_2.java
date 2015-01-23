package Exam;

import java.math.BigInteger;
import java.util.Scanner;

public class SampleContest_Pr_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());
        int N = Integer.parseInt(scan.nextLine());
        int sum = firstNum + secondNum + thirdNum;
        BigInteger fin = BigInteger.valueOf(0);


        for (int i = 4; i < N; i++) {
            fin = BigInteger.valueOf(0);
            fin = fin.add(BigInteger.valueOf(sum));
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = sum;
            sum = firstNum + secondNum + thirdNum;

        }
        System.out.println(fin);
    }
}
