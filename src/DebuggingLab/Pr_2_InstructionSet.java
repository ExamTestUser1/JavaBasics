package DebuggingLab;

import java.util.Scanner;


public class Pr_2_InstructionSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();

        while (!opCode.equals("END")) {
            String[] codeArgs = opCode.split(" ");

            long result = 0;
            switch (codeArgs[0]) {
                case "INC": {
                    long operandOne = Long.parseLong(codeArgs[1]);//int into long
                    result = operandOne + 1;//invalid expression
                    break;
                }
                case "DEC": {
                    long operandOne = Long.parseLong(codeArgs[1]);//int into long
                    result = operandOne - 1;//invalid expression
                    break;
                }
                case "ADD": {
                    long operandOne = Long.parseLong(codeArgs[1]);//int into long
                    long operandTwo = Long.parseLong(codeArgs[2]);//int into long
                    result = operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    long operandOne = Long.parseLong(codeArgs[1]);//int into long
                    long operandTwo = Long.parseLong(codeArgs[2]);//int into long
                    result = operandOne * operandTwo;
                    break;
                }
                default:
                    break;
            }
            System.out.println(result);
            opCode = input.nextLine();//next line
        }
    }
}