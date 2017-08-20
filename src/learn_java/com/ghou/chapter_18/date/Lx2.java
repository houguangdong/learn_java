package learn_java.com.ghou.chapter_18.date;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Lx2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年");
		int year=scan.nextInt();
		System.out.println("请输入周");
		int weeks=scan.nextInt();
		
		Calendar cal= Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.WEEK_OF_YEAR, weeks);
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(cal.getTime()));
	}
}
