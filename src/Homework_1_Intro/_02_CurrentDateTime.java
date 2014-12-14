package Homework_1_Intro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class _02_CurrentDateTime {

	public static void main(String[] args) {
		/*pyrvi nachin*/
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getDefault());
        System.out.println("Current date and time is: " + df.format(date));

        System.out.println();
        /*vtori nachin*/
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Current date and time is: " + today);

	}

}
