package learn_java.com.ghou.chapter_12;

public class FooDemo {
	public static void main(String[] args) {
//		BooleanFoo boolFoo = new BooleanFoo();
//		boolFoo.setFlag(new Boolean(false));
//		System.out.println(boolFoo.getFlag());
//		
//		ObjectFoo objFoo1 = new ObjectFoo();
//		objFoo1.setFlag(new Boolean(true));
//		System.out.println(objFoo1.getFlag());
//		
//		objFoo1.setFlag(new Double(5.2));
//		System.out.println(objFoo1.getFlag());
//		
//		objFoo1.setFlag(new Cat());
//		System.out.println(objFoo1.getFlag());
//		if (objFoo1.getFlag() instanceof Cat){
//			Cat cat = (Cat)objFoo1.getFlag();
//			System.out.println(cat.getName());
//		}
//		
//		ObjectFoo objFoo2 = new ObjectFoo();
//		objFoo2.setFlag(new Integer(5));
//		System.out.println(objFoo2.getFlag());
		
//		TFoo<Cat> tFoo = new TFoo<Cat>();
//		tFoo.setFlag(new Cat());
//		Cat cat = tFoo.getFlag();
//		System.out.println(cat.getName());
		
//		用?不能往里放置
//		TFoo<? extends Cat> tFoo = new TFoo<Cat>();
//		tFoo.setFlag(new Cat());
		
		TFoo<? extends Cat> tFoo=null;
		TFoo<Cat> tFoo2 = new TFoo<Cat>();
		tFoo2.setFlag(new Cat());
		tFoo=tFoo2;
		Cat cat = tFoo.getFlag();
		System.out.println(cat.getName());
	}
}
