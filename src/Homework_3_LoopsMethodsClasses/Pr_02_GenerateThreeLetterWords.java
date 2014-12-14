package Homework_3_LoopsMethodsClasses;

import java.util.Scanner;

public class Pr_02_GenerateThreeLetterWords {

	public static void main(String[] args) {
		System.out.print("Enter one, two or three no repeating characters, as string: ");
        Scanner scan = new Scanner(System.in);
        String chars = scan.next();
        String[] letters = chars.split("");

        for (int i = 0; i < chars.length(); i++) {
            for (int j = 0; j < chars.length(); j++) {
                for (int k = 0; k < chars.length(); k++) {
                    System.out.print(letters[i] + letters[j] + letters[k] + " ");
                }
            }
        }
        
        scan.close();
	}
}
