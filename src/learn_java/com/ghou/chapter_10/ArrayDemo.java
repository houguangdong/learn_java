package learn_java.com.ghou.chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		try{
//			int[] arr=new int[10];
//			Arrays.fill(arr, 5);
//			System.out.println("请输入你要获得的元素索引");
//			Scanner scan = new Scanner(System.in);
//			int index = scan.nextInt();
//			System.out.println("====(1)======");
//			System.out.println(arr[index]);
//			System.out.println("====(2)=====");
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("数组越界");
//			System.out.println("====(3)=====");
//			return;
//		}catch(InputMismatchException e){
//			System.out.println("数字错误");
//			System.out.println("====(3)=====");
//			return;
//		}finally{
//			System.out.println("谢谢");
//			System.out.println("=====(4)====");
//		}
//		System.out.println("====(5)=====");

//		try {
//			System.out.println("请输入你的名字");
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			String name = reader.readLine();
//			System.out.println(name);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("出错了");
//		}
		
//		double a=100.0;
//		int b=0;
//		if(String.valueOf(a/b).equals("Infinity")){
//			throw new ArithmeticException("除零异常");
//		}else{
//			System.out.println("正确");
//		}
		
		
//		String name = null;
//		try {
//			name = GetName.getName();
//			throw new IOException("错误");
//		} catch (IOException e) {
////			System.out.println(e.getLocalizedMessage());
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println(name);
		
		try{
			Scanner scan1 = new Scanner(System.in);
			int i = scan1.nextInt();
			int[] arr = new int[5];
			System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(InputMismatchException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
