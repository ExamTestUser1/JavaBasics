package Homework_1_Intro;

import java.util.Arrays;
import java.util.Scanner;

public class _4_SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length ; i++) {
            str[i] = input.next("\\w+");
        }

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        
        input.close();

	}

}
