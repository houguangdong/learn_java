package learn_java.com.ghou.chapter_8;

public class chapter_8_extend {
	public static void main(String[] args){
		Chicken chicken1 = new Chicken("小克","红色小鸡冠");
        Chicken chicken2 = new Chicken();
 
        System.out.printf("小鸡1 -名称%s,鸡冠是%s。\n", chicken1.getName(), chicken1.getCrest());
        chicken1.wu();
        chicken1.getCopid();
        System.out.printf("小鸡2 -名称%s,鸡冠是%s。\n", chicken2.getName(), chicken2.getCrest());
        chicken2.wu();
        
        Cubic cubic = new Cubic();
        System.out.println(cubic.getVolumn());
        SimpleArray simpleArray = new SafeArray(0);
        simpleArray.setElement(0, 0);
        AbstractGuessGame guessGame = new TextModeGame();
        guessGame.setNumer(50);
        guessGame.start();
        
        for(int i = 0; i < 10; i++){
			int n = (int) (Math.random() * 10) % 2;	
			switch(n) {
				case 0:
					doRequest(new HelloRequest("良葛格"));
				case 1:
					doRequest(new WelcomeRequest("Wiki网站"));
			}
		}
        
        
	}
	
	private static void doRequest(IRequest request) {
		// TODO Auto-generated method stub
		request.execute();
	}
}
