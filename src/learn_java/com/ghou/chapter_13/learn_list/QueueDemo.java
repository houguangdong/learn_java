package learn_java.com.ghou.chapter_13.learn_list;

public class QueueDemo {
	public static void main(String[] args) {
		FooQueue<String> fooQueue = new FooQueue<String>();
		fooQueue.add("a");
		fooQueue.add("b");
		fooQueue.add("c");
		fooQueue.add("d");
		System.out.println(fooQueue.remove());
		System.out.println(fooQueue.remove());
		System.out.println(fooQueue.remove());
		System.out.println(fooQueue.get());
	}
}
