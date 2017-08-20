package learn_java.com.ghou.chapter_4;
import java.util.Date;
import java.util.Scanner;

public class autoboxing_unboxing {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		String str1 = new String("ok");
		System.out.println(str1.toUpperCase());
		Integer a = new Integer(56);
		Integer b = 56; //Integer b = new Integer(56);
		int c = 56;
		Integer d = new Integer(100);
		int f = d.intValue();
		int e = c; // int e = c.intValue();
		
		
		int data = 10;
		Integer dataW = new Integer(data);
		System.out.println(data/3);
		System.out.println(dataW.intValue()/3);
		System.out.println((double)data/3);
		System.out.println(dataW.doubleValue()/3);
		
		
		Integer h = new Integer(100); //=引用
		Integer hh = new Integer(100);
//		Integer h = 500;
//		Integer hh = 500;
//		java有个池子
//		Integer h = 100;
//		Integer hh = 100;
		int g = 500; //=赋值
		int gg = 500;
		System.out.println(h==hh);
		System.out.println(g==gg);
		System.out.println(h.intValue() == hh.intValue());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入a,b或c");
		String str = scan.next();
//		if(str == "a"){
//			System.out.println("你选了a");
//		}else if(str == "b"){
//			System.out.println("你选了b");
//		}else{
//			System.out.println("你选了c");
//		}
		
		if(str.equals("a")){
			System.out.println("你选了a");
		}else if(str.equals("b")){
			System.out.println("你选了b");
		}else{
			System.out.println("你选了c");
		}
	}
}
