package learn_java.com.ghou.chapter_3;

public class Lx2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 101; i <= 200; i++) {
			boolean flag = true; //flag如果为true 就为素数
			for (int j = 2; j < i; j++) {
				if(i%j == 0){
					//不是素数
					flag = false; //flag为false, 不是素数
					break;
				}
			}
			if(flag == true){
				System.out.println(i);
				sum++;
			}
		}
		System.out.println("共"+sum+"个素数");
	}
}
