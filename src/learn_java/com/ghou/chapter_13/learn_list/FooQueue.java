package learn_java.com.ghou.chapter_13.learn_list;

import java.util.LinkedList;

public class FooQueue<T> {
	private LinkedList<T> list = new LinkedList<T>();
	//向容器尾部添加元素
	public void add(T o){
		list.addLast(o);
	}
	//获得容器中的元素
	public T get(){
		return list.getFirst();
	}
	//获得容器中的元素，并删除改元素
	public T remove(){
		return list.removeFirst();
	}
}
