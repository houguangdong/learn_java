package learn_java.com.ghou.chapter_8;

public class WelcomeRequest implements IRequest{

	private String place;
	
    public WelcomeRequest(String place) {
        this.place = place;
    }
    
    public void execute() {
        System.out.printf("欢迎来到%s！%n", place);
    }
	
}
