package learn_java.com.ghou.chapter_18.date;

import java.util.Calendar;
import java.util.Date;

public class Lx6 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.toString());
		//Date====>Calendar
	     cal.setTime(date);
		//Calendar====>date
	     @SuppressWarnings("unused")
		Date date2=cal.getTime();

	}

}
