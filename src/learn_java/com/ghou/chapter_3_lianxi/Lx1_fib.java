package learn_java.com.ghou.chapter_3_lianxi;

import java.util.Scanner;

public class Lx1_fib {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月数");
		
		int month = scan.nextInt();
		if(month <= 2){
			System.out.println("1对兔子");
		}else{
			int xtz = 0; //2月份小兔子为0对
			int ztz = 1; //2月份中兔子为1对
			int dtz = 0; //2月份大兔子为0对
			for(int i=3; i<=month; i++){
				dtz = ztz+dtz; //本月大兔子数=上月中兔子数+上月大兔子数
				ztz=xtz; //本月中兔子数=上月小兔子数
				xtz=dtz; //本月小兔子=本月大兔子数
			}
			System.out.println("共有"+(xtz+ztz+dtz)+"对兔子");
		}
	}
}
