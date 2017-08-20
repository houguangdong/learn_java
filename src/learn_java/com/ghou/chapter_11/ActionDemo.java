package learn_java.com.ghou.chapter_11;

import java.util.Scanner;

public class ActionDemo {
	private enum Action{TURN_LEFT, TURN_RIGHT,SHOT};
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("请按键");
		int input = scann.nextInt();
		doAction(input);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入枚举类型，按键的内容必须是");
		for(Action element: Action.values()){
			System.out.println(element);
		}
		String action = scan.next();
		doAction1(Action.valueOf(action));
		doAction2(Action.valueOf(action));
	}

	public static void doAction(int action) {
		switch(action){
			case IAction.TURN_LEFT:
				System.out.println("向左转");
				break;
			case IAction.TURN_RIGHT:
				System.out.println("向右转");
				break;
			case IAction.SHOT:
				System.out.println("射击");
				break;
		}
	}

	public static void doAction1(Action action) {
		switch(action){
			case TURN_LEFT:
				System.out.println("向左转");
				break;
			case TURN_RIGHT:
				System.out.println("向右转");
				break;
			case SHOT:
				System.out.println("射击");
				break;
		}
	}
	
	public static void doAction2(Action action) {
		switch(action){
			case TURN_LEFT:
				System.out.println(action);
				break;
			case TURN_RIGHT:
				System.out.println(action);
				break;
			case SHOT:
				System.out.println(action);
				break;
		}
	}
}
