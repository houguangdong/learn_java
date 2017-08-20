package learn_java.com.ghou.chapter_7.bank;

public class Boo {
	private String name;
	public Boo(){
		this("无名");
	}
	public Boo(String name){
		this.name = name;
	}
	public void finalize(){
		System.out.printf("%s被回收了\n", name);
	}
}
