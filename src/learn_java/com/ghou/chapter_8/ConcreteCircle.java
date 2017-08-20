package learn_java.com.ghou.chapter_8;

public class ConcreteCircle extends AbstractCircle {

	public ConcreteCircle(){
		
	}
	public ConcreteCircle(double redius){
		this.radius = redius;
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.printf("画一个半径%f的实心圆\n", getRadius());
	}

}
