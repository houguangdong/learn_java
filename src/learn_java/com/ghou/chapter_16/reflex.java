package learn_java.com.ghou.chapter_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;


public class reflex {
	public static void main(String[] args) {
		String name = "ghou";
		Class stringClass = String.class;
//		Class stringClass = name.getClass();
		System.out.println("类名称：" + stringClass.getName());
		System.out.println("是否为接口：" + stringClass.isInterface());
		System.out.println("是否为基本型态：" + stringClass.isPrimitive());
		System.out.println("是否为数组对象：" + stringClass.isArray());
		System.out.println("父类名称："+ stringClass.getSuperclass().getName());
		System.out.println(boolean.class);
		System.out.println(void.class);
		int[] iarr = new int[10];
		System.out.println(iarr.getClass().toString());
		double[] darr = new double[10];
		System.out.println(darr.getClass().toString());
		
		try{
			String reflexFoo = "learn_java.com.ghou.chapter_16.ReflexFoo";
			// 取得套件代表对象
			Class c = Class.forName(reflexFoo);
			Package p = c.getPackage();
			System.out.println(p.getName());
			// 取得型态修饰 像是class  interface
			int m = c.getModifiers();
			System.out.printf(Modifier.toString(m) + "---");
			//如果是接口
			if(Modifier.isInterface(m)){
				System.out.println("interface");
			}else{
				System.out.println("class");
			}
			System.out.println(c.getName());
			// 取得宣告的数据成员代表对象
			Field[] fields = c.getDeclaredFields();
			for(Field field: fields){
				//显示权限修饰，像是public protected private
				System.out.printf(Modifier.toString(field.getModifiers()));
				// 显示型态名称
				System.out.printf("===="+field.getType().getName() + "===\n");
				// 显示数据成员名称
				System.out.printf(field.getName() + ";");
				// 取得宣告的构建方法代表对象
				Constructor[] constructors = c.getDeclaredConstructors();
				for(Constructor constructor: constructors){
					//显示权限修饰 像是public protected private
					System.out.printf("+++"+Modifier.toString(constructor.getModifiers())+"+++\n");
					// 显示构建方法名称
					System.out.printf("+++"+constructor.getName());
				}
				
				// 取得宣告的方法成员代表对象
				Method[] methods = c.getDeclaredMethods();
				for(Method method: methods){
					// 显示权限修饰，像是public protected private
					System.out.printf(Modifier.toString(method.getModifiers()));
					// 显示返回值型态名称
					System.out.printf(""+method.getReturnType().getName());
					// 显示方法名称
					System.out.println(method.getName());
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("没有指定类");
		}catch(ClassNotFoundException e){
			System.out.println("找不到指定类");
		}
		// 建立SomeClass实例
		ReflexFoo some = new ReflexFoo();
		// 取得SomeClass的Class实例
		Class c = some.getClass();
		//取得ClassLoader
		ClassLoader loader = c.getClassLoader();
		System.out.println(loader);
		//获取父ClassLoader
		System.out.println(loader.getParent());
		// 再取得父ClassLoader
		System.out.println(loader.getParent().getParent());
		
		try{
			System.out.println("载入TestClass2");
			ClassLoader loader1 = ReflexFoo.class.getClassLoader();
			Class<ReflexFoo> c1 = (Class<ReflexFoo>) loader1.loadClass("learn_java.com.ghou.chapter_16.ReflexFoo");
			System.out.println(c1);
			System.out.println("使用ReflexFoo宣告参考名称");
			ReflexFoo test = null;
			System.out.println("使用ReflexFoo建立对象");
			test = new ReflexFoo();
			System.out.println("1111111"+test.ghou(3));
		}catch(ClassNotFoundException e){
			System.out.println("找不到指定的类");
		}
		
		
		URL url;
		try {
			url = new URL("file:/User/houguangdong/workspace");
			ClassLoader urlClassLoader = new URLClassLoader(new URL[]{url});
			Class c2 = urlClassLoader.loadClass("SomeClass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			// 测试路径
			String classPath = "test1";
			// 测试类
			String className = "testClass";
			URL url1 = new URL(classPath);
			//建立ClassLoader
			ClassLoader loader1 = new URLClassLoader(new URL[] {url1});
			//加载指定类
			Class c3 = loader1.loadClass(className);
			//显示类描述
			System.out.println(c3);
			URL url2 = new URL(classPath);
			ClassLoader loader2 = new URLClassLoader(new URL[] {url2});
			Class c4 = loader2.loadClass(className);
			System.out.println(c4);
			System.out.println("c3与c4为同一实例？"+(c3==c4));
		}catch(Exception e){
			
		}
		
//		Class c6 = Class.forName("aaa");
//		List list = (List)c6.newInstance();
//		for (int i = 0; i < 5; i++) {
//			list.add("element " + i);
//		}
//		for (Object o: list.toArray()) {
//			System.out.println(o);
//		}
		
//		Class c7 = Class.forName("bbb");
//		//指定参数型态
//		Class[] params = new Class[2];
//		//第一个参数是String
//		params[0] = String.class;
//		//第二个参数是int
//		params[1] = Integer.TYPE;
//		//取得对应参数列的构造方法
//		Constructor constructor1 = c7.getConstructor(params);
//		// 指定自变量内容
//		Object[] argObjs = new Object[2];
//		argObjs[0] = "cccc";
//		argObjs[1] = new Integer(90);
//		//给定自变量并实例化
//		Object obj = constructor1.newInstance(argObjs);
		
//		Class c = Class.forName(args[0]);
//        //使用无参数建构方法建立对象
//        Object targetObj = c.newInstance();
//        //设定参数型态
//        Class[] param1 = {String.class};
//        //根据参数型态取回方法对象
//        Method setNameMethod = c.getMethod("setName", param1);
//        //设定自变量值
//        Object[] argObjs1 = {"caterpillar"};
//        //给定自变量调用指定对象之方法
//        setNameMethod.invoke(targetObj, argObjs1);
//        
//        Class[] param2 = {Integer.TYPE};
//        Method setScoreMethod =
//                 c.getMethod("setScore", param2);
//        
//        Object[] argObjs2 = {new Integer(90)};
//        setScoreMethod.invoke(targetObj, argObjs2);
//        //显示对象描述
//        System.out.println(targetObj);
		
//		一个存取私有方法的例子
//		Method privateMethod = c.getDeclaredMethod("somePrivateMethod", new Class[0]);
//		privateMethod.setAccessible(true);
//		privateMethod.invoke(targetObj, argObjs);
		
//		Class c = Class.forName(args[0]);
//      Object targetObj = c.newInstance();
//      Field testInt = c.getField("testInt");
//      testInt.setInt(targetObj, 99);
//      Field testString = c.getField("testString");
//      testString.set(targetObj, "caterpillar");
//      System.out.println(targetObj);
		
//		Field privateField = c.getDeclaredField("privateField");
//		privateField.setAccessible(true);
//		privateField.setInt(targetObj, 99);
		
//		System.out.println("short数组类：" + sArr.getClass());
//        System.out.println("int数组类：" + iArr.getClass());
//        System.out.println("long数组类：" + lArr.getClass());
//        System.out.println("float数组类：" + fArr.getClass());
//        System.out.println("double数组类：" + dArr.getClass());
//        System.out.println("byte数组类：" + bArr.getClass());
//        System.out.println("boolean数组类：" + zArr.getClass());
//        System.out.println("String数组类：" + strArr.getClass());
		
//		使用反射机制动态生成数组
//		Class c = String.class;
//        Object objArr = Array.newInstance(c, 5);
//        
//        for(int i = 0; i < 5; i++) {
//            Array.set(objArr, i, i+"");
//        }
//        
//        for(int i = 0; i < 5; i++) {
//            System.out.print(Array.get(objArr, i) + " ");
//        }
//        System.out.println();
//        String[] strs = (String[]) objArr;
//        for(String s : strs) {
//            System.out.print(s + " ");
//        }
		
//		Class c = String.class;
//        //打算建立一个3*4数组
//        int[] dim = new int[]{3, 4};
//        Object objArr = Array.newInstance(c, dim);
//        for(int i = 0; i < 3; i++) {
//            Object row = Array.get(objArr, i);
//            for(int j = 0; j < 4; j++) {
//                Array.set(row, j, "" + (i+1)*(j+1));
//            }
//        }
//        
//        for(int i = 0; i < 3; i++) {
//            Object row = Array.get(objArr, i);
//            for(int j = 0; j < 4; j++) {
//                System.out.print(Array.get(row, j) + " ");
//            }
//            System.out.println();
//        }
	}
	
}
