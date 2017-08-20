package learn_java.com.ghou.chapter_13.learn_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list.size());
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		String arr[] = list.toArray(new String[1]); //3 list.size() 30
		for(String element: arr){
			System.out.println(element);
		}
		System.out.println(arr.length);
		System.out.println(list.size());
		System.out.printf("是否为空%b\n", list.isEmpty());
		System.out.printf("是否包含集合list2%b\n", list.containsAll(list2));
		list2.add("wer");
		System.out.printf("是否包含集合list2%b\n", list.containsAll(list2));
//		list.addAll(list2);
//		list.removeAll(list2);
//		list.retainAll(list2);
//		list.clear();
		System.out.printf("是否包含元素\"f\"%b\n", list.contains("f"));
		list.remove("a");
		System.out.printf("是否包含元素\"a\"%b\n", list.contains("a"));
		
		//(1)通过索引取元素
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		List list3 = list.subList(0, 3);
		for(int i=0; i<list3.size(); i++){
			System.out.println(list3.get(i));
		}
		
		
		System.out.println("=================");
		//(2)通过foreach语法
		for(String element: list){
			System.out.println(element);
		}
		System.out.println("=================");
		//(3)通过迭代器
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String element = it.next();
			System.out.println(element);
			it.remove();
		}
		System.out.println(list.size());
	}

}
