package Homework_3_LoopsMethodsClasses;

public class Pr_03_FullHouse {

	public static void main(String[] args) {
		String[] cardFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        char[] cardSuits = {'\u2660', '\u2665', '\u2663', '\u2666'};
        int count = 0;

        for (int a = 0; a < cardFaces.length; a++) {
            for (int b = 0; b < cardFaces.length; b++) {
                for (int a1 = 0; a1 < cardSuits.length; a1++) {
                    for (int a2 = a1 + 1; a2 < cardSuits.length; a2++) {
                        for (int a3 = a2 + 1; a3 < cardSuits.length; a3++) {
                            for (int b1 = 0; b1 < cardSuits.length; b1++) {
                                for (int b2 = b1 + 1; b2 < cardSuits.length; b2++) {
                                    if (a != b){
                                        count++;
                                        System.out.print("(" + cardFaces[a] + cardSuits[a1] + " " + cardFaces[a] + cardSuits[a2] +
                                                " " + cardFaces[a] + cardSuits[a3] + " " + cardFaces[b] + cardSuits[b1] + " "
                                                + cardFaces[b] + cardSuits[b2] + ")  ");
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        //test
        System.out.println();
        System.out.println(count + " full houses");
	}

}
