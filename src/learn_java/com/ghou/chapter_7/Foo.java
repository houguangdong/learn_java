package learn_java.com.ghou.chapter_7;

public class Foo {
	
	private static Foo foo = new Foo();
	
	private Foo(){
		
	}
	public static Foo getFoo(){
		return foo;
	}
}
