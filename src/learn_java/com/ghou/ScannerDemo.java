package learn_java.com.ghou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入你的名字");
//		String name = scan.next();
//		System.out.println("请输入你的年龄");
//		int age = scan.nextInt();
//		System.out.println("请输入你的存款");
//		double money = scan.nextDouble();
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(money);
//		
//		System.err.print("标准的错误输出:"+ name);
//		System.out.println("d");
//		System.out.print("c");
		System.out.printf("%o%n", 19);
//		a = "你a" 两个字符
//		final int age1 = 25; //常量
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for(String item : items){
			System.out.println(item);
		}
	}

}
