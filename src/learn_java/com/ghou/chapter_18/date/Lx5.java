package learn_java.com.ghou.chapter_18.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lx5 {

	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date.toString());
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		System.out.println(df.format(date));
		DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日 kk时mm分ss秒");
		System.out.println(df2.format(date));

		String str="2009/09/07";
		DateFormat df3=new SimpleDateFormat("yyyy/MM/dd");
		try{
			@SuppressWarnings("unused")
			Date date1=df3.parse(str);
		}catch(ParseException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
