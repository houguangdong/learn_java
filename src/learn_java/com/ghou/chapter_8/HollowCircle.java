package learn_java.com.ghou.chapter_8;

public class HollowCircle extends AbstractCircle {
	public HollowCircle(){
		
	}
	public HollowCircle(double radius){
		this.radius = radius;
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.printf("画一个半径%f的空心圆\n", getRadius());
	}

}
