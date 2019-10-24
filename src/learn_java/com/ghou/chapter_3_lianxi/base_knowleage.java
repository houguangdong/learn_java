package learn_java.com.ghou.chapter_3_lianxi;

public class base_knowleage {
	public static void main(String[] args) {
		//算数运算符 +(连接符) %(取余，模运算)
		// ++(自增：就在原有数据基础上+1, 在赋给原有数据)
		int x = 6370;
		x = x / 1000 * 1000;
		System.out.println(x);
		System.out.println(5 % 2);
		System.out.println(3+"2");
		System.out.println("5+5="+(5+5)); //"5+5=5"+5  "5+5=55"
		//int a = 4, b = 5;
		//System.out.println("a="+a+",b="+b);
		int a = 3, b;
		// a++;
		b = a++;
		b = (a++)+(++a)+(a++)+a;
		System.out.println("a="+a+",b="+b);
		
		int i = 3;
		i = i++;
		System.out.println("i="+i);
		
		//赋值运算符
		int d, e, f;
		d = e = f = 4;
		//int d = 4;
		a+=2;
		short s = 3;
		s+=4;
		System.out.println(s);
		s = (short)(s+4);
		System.out.println("s="+s);
		
		//数据类型 变量名 = 初始化值;
		byte k = 3;
		short j = 4000;
		int h = 12;
		long l = 123l;
		float ff = 2.3f;
		double dd = 3.4;
		char ch = 'c';
		boolean bl = true;
		{
			int z = 9;
			System.out.println(z);
		}
		
		int xx = 3;
		byte bb = 5;
		xx = xx + bb;
		byte bbb = 3;
		bb = (byte)(bbb + 200); //强制类型转换
		System.out.println((char)('a'+1));
		System.out.println('你'+0); // unicode国际标准码表
		
	}
}
