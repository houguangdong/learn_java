package learn_java.com.ghou.chapter_9;
import learn_java.com.ghou.chapter_9.package_1.Foo;
public class PackageA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("包的应用");
		learn_java.com.ghou.chapter_9.package_1.Foo foo = new learn_java.com.ghou.chapter_9.package_1.Foo("learn_java.com.ghou.chapter_9.package_1.Foo");
		System.out.println(foo);
		learn_java.com.ghou.chapter_9.Foo foo2 = new learn_java.com.ghou.chapter_9.Foo("learn_java.com.ghou.chapter_9.Foo");
		System.out.println(foo2);
		Boo boo = new Boo("learn_java.com.ghou.chapter_9.package_1.Boo");
		System.out.println(boo);
		
	}

}
