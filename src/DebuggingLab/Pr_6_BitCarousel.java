package DebuggingLab;

import java.util.Scanner;

public class Pr_6_BitCarousel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();

            if (direction.equals("right")) {  //== doesn't works with strings
                int rightMostBit = number & 1;
                number >>= 1;
                number |= rightMostBit << 5;  //5 not 6
            } else if (direction.equals("left")) { //== doesn't works with strings
                int leftMostBit = (number >> 5) & 1;
                number <<= 1;
                number |= leftMostBit; //5 not 6
            }
        }

        System.out.println(number);
    }
}
