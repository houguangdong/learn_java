package learn_java.com.ghou.chapter_18.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lx4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个日期，格式为yyyy—MM-dd");
		String str1=scan.next();
		System.out.println("请在输入一个日期，格式为yyyy—MM-dd");
		String str2=scan.next();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date date1=df.parse(str1);
			Date date2=df.parse(str2);
			long begin=date1.getTime();
			long end=date2.getTime();
			long days =(end-begin)/(1*24*60*60*1000);
			System.out.println(days);
		}catch(ParseException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
