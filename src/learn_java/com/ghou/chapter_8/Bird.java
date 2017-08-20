package learn_java.com.ghou.chapter_8;

public class Bird {

//	private String name;
	protected String name;
	public Bird() {
	}
	public Bird(String name) {
		this.name = name;
	}
	public Bird getCopid(){
		System.out.print("父类的方法");
		return new Bird(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void walk(){
		System.out.println("走路");
	}
	
}