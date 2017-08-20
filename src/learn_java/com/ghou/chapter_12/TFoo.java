package learn_java.com.ghou.chapter_12;


//public class TFoo<T, F> {
//public class TFoo<T extends Cat> {
//public class TFoo<T extends Cat> { //Cat 可以是接口
//public class TFoo<T super Cat> { //Cat 可以是接口
public class TFoo<T extends Cat> {
	private T flag;
	public void setFlag(T flag){
		this.flag = flag;
	}
	public T getFlag(){
		return flag;
	}
}
