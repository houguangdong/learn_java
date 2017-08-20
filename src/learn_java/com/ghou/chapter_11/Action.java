package learn_java.com.ghou.chapter_11;

public enum Action {
	TURN_LEFT,TURN_RIGHT("hehe"),SHOT;
	private String name;
	private Action(){
		
	}
	private Action(String name){
		this.name=name;
	}
	// public static final TURN_LEFT;
	public String toString(){
		switch(this.ordinal()){
			case 0:
				return "向左转";
			case 1:
				return "向右转";
			case 2:
				return "射击";
			default:
				return null;
		}
	}
}
