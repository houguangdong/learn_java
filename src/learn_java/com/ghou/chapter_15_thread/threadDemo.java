package learn_java.com.ghou.chapter_15_thread;

import java.io.Console;
import java.util.Scanner;

public class threadDemo {

	public static void main(String[] args) {
		//启动Eraser线程
		EraserThread eraserThread = new EraserThread('#');
		eraserThread.setActive(true);
		eraserThread.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("ghou");
		}
		
		//Eraser实现Runnable接口
		Eraser eraser = new Eraser('$');
        //启动Eraser线程
        Thread eraserThread1 = new Thread(eraser);
        eraser.setActive(true);
        eraserThread1.start();
	}

}
