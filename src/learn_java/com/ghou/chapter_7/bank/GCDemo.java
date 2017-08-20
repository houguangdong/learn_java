package learn_java.com.ghou.chapter_7.bank;

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Boo b1 = new Boo("b1");
//		Boo b2 = new Boo("b2");
//		Boo b3 = b2;
//		b2 = null;
//		b1 = null;
//		b3 = null;
		
		Boo[] arr = {new Boo("a"), new Boo("b")}; //(1)
		Boo b1 = arr[0]; //(2) 
		b1 = null; //(3)
		arr[0]=null; //(4)
//		arr=null; //(5)
		
		
		System.gc(); //建议回收
		while(true); //不断执行程序
	}

}
