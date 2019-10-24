package learn_java.com.ghou.algorithm;

/*
 * 如何保证对象的唯一性呢
 * 1 不允许其他程序用new创建该类对象
 * 2 在该类创建一个本类实例
 * 3 对外提供一个方法让其他程序可以获取该对象
 * 
 * 步骤:
 * 1 私有化该类构造函数
 * 2 通过new在本类中创建一个本类对象
 * 3 定义一个共有的方法 将创建的对象返回
 */

//饿汉式
class Single 	// 类一加载 对象就已经存在了
{ 

	private static Single s = new Single();
	
	private Single(){}
	
	public static Single getInstance(){
		return s;
	}
}

//懒汉式
class Single2	//类加载进来 没有对象 只有调用了getInstance方法时 才会创建对象
 				//延迟加载形式
{
	private static Single2 s = null;
	
	private Single2(){}
	
	public static Single2 getInstance(){
		if (s == null)
			s = new Single2();
		return s;
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);
		
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		t1.setNum(10);
		t2.setNum(20);
		System.out.println(t1.getNum());
		System.out.println(t2.getNum());
		
	}

}


class Test
{
	private int num;
	
	private static Test t = new Test();
	public static Test getInstance()
	{
		return t;
	}
	private Test(){}
	public void setNum(int num)
	{
		this.num = num;
	}
	
	public int getNum()
	{
		return num;
	}
}
