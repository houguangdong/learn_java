package learn_java.com.ghou.chapter_8;
import java.util.Scanner;

public class TextModeGame extends AbstractGuessGame {
	
	private Scanner scanner;
	public TextModeGame(){
		scanner = new Scanner(System.in);
	}
	
	@Override
	protected void showMessage(String message) {
		// TODO Auto-generated method stub
		for(int i = 0; i < message.length()*2; i++){
			System.out.print("*");
		}
		System.out.println("\n" + message);
		for(int i=0; i < message.length()*2; i++){
			System.out.print("*");
		}
	}

	@Override
	protected int getUserInput() {
		// TODO Auto-generated method stub
		System.out.print("\n输入数字：");
		return scanner.nextInt();
	}

	@Override
	protected void setNumer(int number) {
		// TODO Auto-generated method stub
		this.number = number;
	}

}
