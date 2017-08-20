package learn_java.com.ghou.chapter_13.learn_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import learn_java.com.ghou.chapter_12.Cat;

public class MapDemo {
	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("key1", "tom1");
//		map.put("key2", "tom2");
//		map.put("key3", "tom3");
//		map.put(null, null);
//		System.out.println(map.containsKey("key1"));
//		System.out.println(map.get("key1"));
//		System.out.println(map.get("key2"));
//		System.out.println(map.get("key3"));
//		
//		Set<String> keys = map.keySet();
//		for(String key: keys){
//			System.out.println(key);
//		}
		
		Map<String, Cat> map = new HashMap<String, Cat>();
//		Map<String, Cat> map = new TreeMap<String, Cat>();
//		Map<String, Cat> map = new LinkedHashMap<String, Cat>();
		map.put("cat1", new Cat("tom1", 20));
		map.put("cat2", new Cat("tom2", 30));
		map.put("cat3", new Cat("tom3", 30));
		System.out.println(map.get("cat1"));
		System.out.println(map.get("cat2"));
		Collection<Cat> cats = map.values();
		Iterator<Cat> it = cats.iterator();
		while(it.hasNext()){
			Cat cat = it.next();
			System.out.println(cat);
		}
	}
}

//HashTable中的key不能为null
