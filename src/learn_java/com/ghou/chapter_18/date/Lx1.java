package learn_java.com.ghou.chapter_18.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Lx1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年");
		int year=scan.nextInt();
		System.out.println("请输入月");
		int month=scan.nextInt();
		System.out.println("请输入日");
		int day=scan.nextInt();
		System.out.println("请输入多少天前或多少天后");
		int days=scan.nextInt();
		Calendar cal=Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_YEAR, day);
		cal.add(Calendar.DATE, days);
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(cal.getTime()));
	}
}
