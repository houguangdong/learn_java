package learn_java.com.ghou.chapter_15;

public class EraserThread extends Thread{
	private boolean active;
	private String mask;
	public EraserThread(char maskChar){
		mask = "\010"+maskChar;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	//重新定义run()方法
	public void run(){
		while(isActive()){
			System.out.print(mask);
			//暂停目前的线程50毫秒
//				Thread.currentThread().sleep(50);
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
			break;
		}
	}
}
