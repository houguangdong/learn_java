package learn_java.com.ghou.chapter_7.lianxi;

public class Demo {

	public static void main(String[] args) {
		YiShuJia ysj=new YiShuJia();
		I_Sound i=new GangQin();
		ysj.play(i);
		i=new XiaoTiQin();
		ysj.play(i);
		i=new Table();
		ysj.play(i);
	}
}
