package learn_java.com.ghou.chapter_8;

public abstract class AbstractCircle {
	protected double radius;
	public void setRadius(double redius){
		this.radius = redius;
	}
	public double getRadius(){
		return radius;
	}
	public abstract void render();
}
