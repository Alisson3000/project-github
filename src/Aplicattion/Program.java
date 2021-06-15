package Aplicattion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		       SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy"); 
		       SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		       SimpleDateFormat sdf3 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		       sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));		       
		       Date y1 = sdf1.parse("09/06/2021");
		       Date y2 =  sdf2.parse("09/06/2021 20:02:50");
		       Date d1 =  new Date();
		       Date y3 = Date.from(Instant.parse("2021-06-09T20:10:50Z"));
		       
		       System.out.println(sdf3.format(y3));  
		       
		       Calendar cal =  Calendar.getInstance();
		       cal.setTime(y3);
		       cal.add(Calendar.HOUR_OF_DAY, 2);
		       y3 = cal.getTime();       
		       int minutes = cal.get(Calendar.MINUTE);
		       int month = 1 + cal.get(Calendar.MONTH);	  
		       
		       System.out.println(sdf3.format(y3));
		       System.out.println(minutes);
		       System.out.println(month);
		     
		sc.close();
	}
}
