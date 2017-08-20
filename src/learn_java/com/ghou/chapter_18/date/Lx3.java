package learn_java.com.ghou.chapter_18.date;

import java.util.Calendar;
import java.util.Scanner;

public class Lx3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入年");
		int year=scan.nextInt();
		System.out.println("请输入月");
		int month=scan.nextInt();
		System.out.println("请输入日");
		int day=scan.nextInt();
		//创建Calendar对象
		Calendar cal=Calendar.getInstance();
		//以防万一 最好清空原有信息
		cal.clear();
		//设置年
		cal.set(Calendar.YEAR, year);
		//设置月
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		//求第几天
		int days=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(days);
		//int maxdays=cal.get(Calendar.DAY_OF_YEAR);
		//intln(maxdays);
	}

}
