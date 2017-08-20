package learn_java.com.ghou.chapter_8;

public class SafeArray extends SimpleArray {

	public SafeArray(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	//重新定义setElement()
	public void setElement(int i, int data) {
        if(i < array.length)
            super.setElement(i, data);
        System.out.println("方法重写");
    }
}
