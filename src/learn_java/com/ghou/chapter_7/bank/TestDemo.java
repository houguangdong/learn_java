package learn_java.com.ghou.chapter_7.bank;

import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		Test t = new Test();
		t.ok(new Integer(1));
		t.ok(2);
		t.ok(2.3);
		t.ok("dssds");
		int s = t.sum(1,2,3,4,32,43,4,345,345);
		System.out.println(s);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = scan.nextInt();
		System.out.println("请再输入一个整数");
		int b = scan.nextInt();
		/*
		while(a%b!=0){
			int c=a%b;
			a=b;
			b=c;
		}
		System.out.println(b);
		*/
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	
}

