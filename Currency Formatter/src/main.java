import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.*;

public class main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        /* Create custom Locale for India. 
        I used the "IANA Language Subtag Registry" to find India's country code 
        */
        Locale indiaLocale = new Locale("en", "IN");

      /* Create NumberFormats using Locales */
	      NumberFormat us_     = NumberFormat.getCurrencyInstance(Locale.US);
	      NumberFormat india_  = NumberFormat.getCurrencyInstance(indiaLocale);
	      NumberFormat china_  = NumberFormat.getCurrencyInstance(Locale.CHINA);
	      NumberFormat france_ = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
	      String us=us_.format(payment);
	      String in=india_.format(payment);
	      String ch=china_.format(payment) ;
	      String fr=france_.format(payment); 
	     
        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
