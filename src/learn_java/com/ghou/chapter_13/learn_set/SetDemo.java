package learn_java.com.ghou.chapter_13.learn_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import learn_java.com.ghou.chapter_12.Cat;

public class SetDemo {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
//		set.add("a");
//		set.add("b");
//		set.add("c");
//		set.add("d");
//		set.add("d");
//		set.add("d");
//		for(String element: set){
//			System.out.println(element);
//		}
//		Iterator<String> it=set.iterator();
//		while(it.hasNext()){
//			String element = it.next();
//			System.out.println(element);
//		}
		
		Set<Cat> set = new HashSet<Cat>();
		set.add(new Cat("tom1", 20));
		set.add(new Cat("tom1", 20));
		set.add(new Cat("tom2", 40));
		for(Cat element: set){
			System.out.println(element);
		}
		
//		Set<Cat> set = new LinkedHashSet<Cat>();
//		set.add(new Cat("tom1", 20));
//		set.add(new Cat("tom2", 20));
//		set.add(new Cat("tom3", 40));
//		for(Cat element: set){
//			System.out.println(element);
//		}
		
//		Set<Cat> set = new TreeSet<Cat>();
//		set.add(new Cat("tom1", 40));
//		set.add(new Cat("tom2", 30));
//		set.add(new Cat("tom3", 30));
//		for(Cat element: set){
//			System.out.println(element);
//		}
		
//		Set<String> set = new TreeSet<String>();
//		set.add("b");
//		set.add("a");
//		set.add("c");
//		set.add("d");
//		for(String element: set){
//			System.out.println(element);
//		}
	}
}
