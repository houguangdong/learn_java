package learn_java.com.ghou.chapter_3;

public class Lx4 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i < 999; i++) {
			int bw = i/100;    	//求百位
			int sw = (i/10)%10; //求十位
			int gw=(i%10); 		//求个位
			int sum =bw*bw*bw+sw*sw*sw+gw*gw*gw;
			if(i==sum){
				System.out.printf("%d为水仙花数\n",i);
				count++;
			}
		}
		System.out.println("共"+count+"个水仙花数");
	}
}
