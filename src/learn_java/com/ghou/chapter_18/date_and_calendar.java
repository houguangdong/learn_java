package learn_java.com.ghou.chapter_18;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date_and_calendar {
	public static void main(String[] args) {
		Calendar time = Calendar.getInstance();
		time.clear();
		time.set(Calendar.YEAR, 2016);//year为int
		time.set(Calendar.MONTH, 3);//注意 Calendar对象默认一月为0
		int day = time.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(day);
//		Calendar和Date的转化
//		(1) Calendar转化为Date
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
//		(2) Date转化为Calendar
		Date date1 = new Date();
		Calendar cal1 = Calendar.getInstance();
		cal.setTime(date1);
//		格式化输出日期时间 （这个用的比较多）
		Date date2 = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time1 = df.format(date2);
		System.out.println(time1);
//		计算某一天是一年中的第几星期
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2006);
		cal2.set(Calendar.MONTH, 8);
		cal2.set(Calendar.DAY_OF_MONTH, 3);
		int weekno = cal2.get(Calendar.WEEK_OF_YEAR);
//		计算一年中的第几星期是几号
		SimpleDateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal3=Calendar.getInstance();
		cal3.set(Calendar.YEAR, 2006);
		cal3.set(Calendar.WEEK_OF_YEAR, 1);
		cal3.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println(df1.format(cal3.getTime()));
//		add()方法
		SimpleDateFormat df2=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal4=Calendar.getInstance();
		cal4.set(Calendar.YEAR, 2006);
		cal4.set(Calendar.MONTH, 8);
		cal4.set(Calendar.DAY_OF_MONTH, 3);
		cal4.add(Calendar.DATE, -4);
		Date date3=cal4.getTime();
		System.out.println(df2.format(date3));
		cal4.add(Calendar.DATE, 4);
		Date date4=cal4.getTime();
		System.out.println(df2.format(date4));
//		计算两个任意时间中间的间隔天数（这个比较常用）
//		(1)传进Calendar对象
//		public int getIntervalDays(Calendar startday Calendar endday){ 
//			if(startday.after(endday)){
//				Calendar cal=startday;
//				startday=endday;
//				endday=cal;
//			} 
//			long sl=startday.getTimeInMillis();
//			long el=endday.getTimeInMillis();
//			long ei=el-sl; 
//			return (int)(ei/(1000*60*60*24));
//		}
		
//		(2)传进Date对象
//		public int getIntervalDays(Date startday,Date endday)...{
//			if(startday.after(endday))...{
//				Date cal=startday;
//				startday=endday;
//				endday=cal;
//			}
//			long sl=startday.getTime();
//			long el=endday.getTime(); 
//			long ei=el-sl; 
//			return (int)(ei/(1000*60*60*24));
//		}
		
//		(3)改进精确计算相隔天数的方法
//		public int getDaysBetween (Calendar d1, Calendar d2) ...{
//			if (d1.after(d2)) ...{ 
//				java.util.Calendar swap = d1;
//				d1 = d2;
//				d2 = swap;
//			}
//			int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
//			int y2 = d2.get(Calendar.YEAR);
//			if (d1.get(Calendar.YEAR) != y2) ...{
//				d1 = (Calendar) d1.clone();
//				do ...{
//					days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);//得到当年的实际天数
//					d1.add(Calendar.YEAR, 1);
//					} while (d1.get(Calendar.YEAR) != y2);
//			}
//			return days;
//		}
		
//		String 和 Date ，Long 之间相互转换 （最常用）
//		字符串转化成时间类型（字符串可以是任意类型，只要和
//		SimpleDateFormat中的格式一致即可）通常我们取时间跨度的
//		时候，会substring出具体时间－－long－比较
//		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("M/dd/yyyy hh:mm:ss a",java.util.Locale.US);
//		java.util.Date d = sdf.parse("5/13/2003 10:31:37 AM");
//		long dvalue=d.getTime();
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String mDateTime1=formatter.format(d);
	}
}
