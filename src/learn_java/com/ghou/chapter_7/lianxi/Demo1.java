package learn_java.com.ghou.chapter_7.lianxi;

public class Demo1 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("123456789");
		sb.reverse();
		String str=sb.toString();
		System.out.println(str);
	}
}
