package learn_java.com.ghou.chapter_9;

import learn_java.com.ghou.chapter_8.Bird;
import learn_java.com.ghou.chapter_8.Chicken;

public class OuterClass {
	private String name;
	// public protected private default
	// 外部类的类名$内部类的类名.class
	// 成员内部类可以声明成static
	private class InnerClass{
		private int age;
		public void setAge(int age){
			name="张三";
			ok();
			this.age = age;
		}
		public int getAge(){
			return age;
		}
	}

	public void getName(){
		System.out.println(name);
	}

	public void ok(){
		System.out.println("============");
	}
	
	public void foo(int a){
		//不是成员
		int b=5;
		//区域内部类 
		//外部类的类名$1(序号)区域内部类的类名.class
		class Inner2Class{
			public void inner2Test(){
				System.out.println("区域内部类的test()"+a+b);
			}
		}
		Inner2Class inner2 = new Inner2Class();
		inner2.inner2Test();
	}

//	public void test(){
//		InnerClass inner = new InnerClass();
//		inner.setAge(100);
//		System.out.println(inner.getAge());
//		getName();
//	}
	
	public static void test(){
		OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		inner.setAge(100);
		System.out.println(inner.getAge());
	}

	public static void main(String[] args) {
//		OuterClass outer = new OuterClass();
//		outer.test();
		test();
		OuterClass outer = new OuterClass();
		// 匿名内部类 外部类的类名$1(序号)
		outer.boo(new Bird(){
			private int age;
			final int x = 10; //声明final
			public void walk(){
				System.out.println("孔雀东南飞");
			}
		});
		outer.foo(100);
	}
	
	public void boo(Bird bird){
		bird.walk();
	}
}
