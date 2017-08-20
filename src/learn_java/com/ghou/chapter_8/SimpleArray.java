package learn_java.com.ghou.chapter_8;

public class SimpleArray {
	protected int[] array;
	public SimpleArray(int i){
		array = new int[i];
	}
	public void setElement(int i, int data){
		array[i] = data;
	}
}
