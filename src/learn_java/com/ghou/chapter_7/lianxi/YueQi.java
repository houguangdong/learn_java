package learn_java.com.ghou.chapter_7.lianxi;

public abstract class YueQi {
	private String name;

	public YueQi() {
		super();
	}

	public YueQi(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void sound();
		
}
