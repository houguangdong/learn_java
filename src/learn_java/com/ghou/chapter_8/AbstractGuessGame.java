package learn_java.com.ghou.chapter_8;

public abstract class AbstractGuessGame {
	protected int number;
	public AbstractGuessGame(){
		
	}
	public void start(){
		showMessage("欢迎");
		int guess = 0;
		do{
			guess = getUserInput();
			if (guess > number){
				showMessage("输入的数字较大");
			} else if(guess < number){
				showMessage("输入的数字较小");
			} else {
				showMessage("猜中了");
			}
		} while (guess != number);
	}
	protected abstract void showMessage(String message);
	protected abstract int getUserInput();
	protected abstract void setNumer(int number);
}
