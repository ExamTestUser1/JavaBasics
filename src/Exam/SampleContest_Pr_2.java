package Exam;

import java.math.BigInteger;
import java.util.Scanner;

public class SampleContest_Pr_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger firstNum = scan.nextBigInteger();
        BigInteger secondNum = scan.nextBigInteger();
        BigInteger thirdNum = scan.nextBigInteger();
        int N = scan.nextInt();
        BigInteger sum = BigInteger.valueOf(0);
        sum = sum.add(firstNum);
        sum = sum.add(secondNum);
        sum = sum.add(thirdNum);
        BigInteger fin = BigInteger.valueOf(0);

        if (N == 1)
            fin = fin.add(firstNum);
        else if (N == 2)
            fin = fin.add(secondNum);
        else if (N == 3)
            fin = fin.add(thirdNum);
        else {
            for (int i = 4; i <= N; i++) {
                fin = BigInteger.valueOf(0);
                fin = fin.add(sum);
                sum = BigInteger.valueOf(0);
                firstNum = secondNum;
                secondNum = thirdNum;
                thirdNum = fin;
                sum = sum.add(firstNum);
                sum = sum.add(secondNum);
                sum = sum.add(thirdNum);
            }
        }
        System.out.println(fin);
    }
}
