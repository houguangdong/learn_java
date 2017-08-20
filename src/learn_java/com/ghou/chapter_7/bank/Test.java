package learn_java.com.ghou.chapter_7.bank;

public class Test {
	public void ok(int i){
		System.out.printf("你输入的是int类型，值为%d\n", i);
	}
	public void ok(Integer i){
		System.out.printf("你输入的是Integer类型，值为%d\n", i);
	}
	public void ok(double d){
		System.out.printf("你输入的是double类型，值为%f\n", d);
	}
	public void ok(String str){
		System.out.printf("你输入的是String类型，值为%s\n", str);
	}
	public int sum(int... arr){
		int sum = 0;
		for(int element: arr){
			sum+=element;
		}
		return sum;
	}
}
