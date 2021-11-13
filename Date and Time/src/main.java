import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.LocalDate;

class Result {

	/* Calendar */    
//    public static String findDay(int month, int day, int year) {
//    	Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.MONTH, month-1);
//        cal.set(Calendar.DAY_OF_MONTH, day);
//        cal.set(Calendar.YEAR, year);
//        
//        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
//    }
//
//}
	
	/* Local date */
	public static String findDay(int month, int day, int year) {
		
		return LocalDate.of(year, month, day).getDayOfWeek().name();
	}
}


public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] firstMultipleInput = in.nextLine().split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        
        System.out.println(res);
        
        in.close();
        
    }
}

