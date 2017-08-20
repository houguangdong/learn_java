package learn_java.com.ghou.chapter_13.learn_list;

public class StackDemo {
	public static void main(String[] args) {
		FooStack<String> fooStack = new FooStack<String>();
		fooStack.add("a");
		fooStack.add("b");
		fooStack.add("c");
		fooStack.add("d");
		System.out.println(fooStack.remove());
		System.out.println(fooStack.remove());
		System.out.println(fooStack.remove());
		System.out.println(fooStack.get());
	}
}
