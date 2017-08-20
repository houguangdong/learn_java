package learn_java.com.ghou.chapter_3;

import java.util.Scanner;

public class Lx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scan.nextInt();
		System.out.println("请输入月份");
		int month = scan.nextInt();
		System.out.println("请输入日期");
		int day = scan.nextInt();
		int sum = 0;
		/*
		for(int i = 0; i< month; i++){
			switch(i){
				case 1:
					sum+=31;
					break;
				case 2:
					if(((year%4==0)&&(year%100!=0))||(year%400==0)){
						sum += 29;
					}else{
						sum += 28;
					}
					break;
				case 3:
					sum+=31;
					break;
				case 4:
					sum+=30;
					break;
				case 5:
					sum+=31;
					break;
				case 6:
					sum+=30;
					break;
				case 7:
					sum+=31;
					break;
				case 8:
					sum+=31;
					break;
				case 9:
					sum+=30;
					break;
				case 10:
					sum+=31;
					break;
				case 11:
					sum+=30;
					break;
			}
		}
		*/
		switch(month-1){
			case 11:
				sum+=30;
			case 10:
				sum+=31;
			case 9:
				sum+=30;
			case 8:
				sum+=31;
			case 7:
				sum+=31;
			case 6:
				sum+=30;
			case 5:
				sum+=31;
			case 4:
				sum+=30;
			case 3:
				sum+=31;
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					sum += 29;
				}else{
					sum += 28;
				}
			case 1:
				sum+=31;
				break;
		}
		sum += day;
		System.out.printf("%d年%d月%d日是该年的第%d天\n", year, month, day, sum);
	}
}
