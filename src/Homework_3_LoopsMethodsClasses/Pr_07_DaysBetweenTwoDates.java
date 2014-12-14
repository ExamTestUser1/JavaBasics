package Homework_3_LoopsMethodsClasses;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Pr_07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String[] firstDateInput = scan.nextLine().split("-");
        String[] secondDateInput = scan.nextLine().split("-");

        //creates new dates from the split Strings entered from the console in format "yyyy-MM-dd HH:mm"
        LocalDateTime firstDate = LocalDateTime.of(Integer.parseInt(firstDateInput[2]), Integer.parseInt(firstDateInput[1]), Integer.parseInt(firstDateInput[0]), 00, 00);
        LocalDateTime secondDate = LocalDateTime.of(Integer.parseInt(secondDateInput[2]), Integer.parseInt(secondDateInput[1]), Integer.parseInt(secondDateInput[0]), 00, 00);

        Duration days = Duration.between(firstDate, secondDate);
        System.out.println(days.toDays());
        
        scan.close();
	}
}
