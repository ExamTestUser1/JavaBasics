package Homework_3_LoopsMethodsClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pr_06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
		String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        char[] suit = {'\u2660', '\u2665', '\u2666', '\u2663'};
        ArrayList<String> cards = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int numOfHands = scan.nextInt();

        for (int i = 0; i < face.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                cards.add(face[i] + suit[j]);
            }
        }

        for (int i = 0; i < numOfHands; i++) {
            Collections.shuffle(cards);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%s ", cards.get(j));
                }
            System.out.println();
        }
        
        scan.close();
	}
}
