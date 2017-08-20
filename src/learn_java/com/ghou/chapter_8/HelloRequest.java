package learn_java.com.ghou.chapter_8;

public class HelloRequest implements IRequest{

	private String name;
	
	public HelloRequest(String name){
		this.name = name;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		System.out.printf("哈啰%s！%n", name);
	}
}
