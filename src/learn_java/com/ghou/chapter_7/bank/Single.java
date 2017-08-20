package learn_java.com.ghou.chapter_7.bank;

public class Single {
	// 提供静态的域引用并创建对象
	private static Single single = new Single();
	//任何人都不能私自创建对象  构造器私有化
	private Single(){
		
	}
	// 提供静态的方法返回静态域所引用的对象
	public static Single getSingle(){
		return single;
	}
}
