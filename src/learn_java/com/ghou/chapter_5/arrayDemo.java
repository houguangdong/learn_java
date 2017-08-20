package learn_java.com.ghou.chapter_5;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDemo {
	public static void main(String[] args) {
//		int[] arr1 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("第%d个学生的成绩是%d\n", i+1, arr1[i]);
//		}
		
//		int[] arr = {0, 0, 0, 0, 0}
//		int[] arr = new int[5]; 
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("第%d个学生的成绩是%d\n", i+1, arr1[i]);
//		}
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("请输入学生的成绩");
//			int score = scan.nextInt();
//			arr[i] = score;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("第%d个学生的成绩是%d\n", i+1, arr[i]);
//		}
//		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
//		int[] arr3 = new int[5];
//		arr[0]=23.3;
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入你希望的数组长度");
//		int a = scan.nextInt();
//		int[] arr4 = new int[a];
//		System.out.println(arr4.length);
		
//		Scanner scan = new Scanner(System.in);
//		scan = null;
		
//		int arr5[] = new int[5];
//		int[] arr5 = new int[5]; 
//		arr5[2] = 40;
//		arr5[2] = null;
//		arr5=null;
		
//		int[][] arr6 = {
//				{1, 2, 3, 4},
//				{5, 6, 7, 8},
//				{9, 10}
//		};
//		System.out.println(arr6.length);
//		for (int i = 0; i < arr6.length; i++) {
//			for (int j = 0; j < arr6[i].length; j++) {
//				System.out.println(arr6[i][j]);
//			}
//		}
//		
//		int[][] arr7 = new int[2][3];
//		arr7 = null;
//		arr7[0] = null;
//		arr7[1] = null;
//		arr7[0][1] = null;
		
//		int[] arr8 = {1, 2, 3, 4, 5};
//		int[] arr9 = new int[5];
//		arr9 = arr8;
/*
		for (int i = 0; i < arr8.length; i++) {
			arr9[i] = arr8[i];
		}
*/
//		System.arraycopy(arr8, 2, arr9, 2, 3);
//		arr9[0] = 100;
//		System.out.println("arr8中的元素");
//		for (int i = 0; i < arr8.length; i++) {
//			System.out.printf("%d\t", arr8[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < arr9.length; i++) {
//			System.out.printf("%d\t", arr9[i]);
//		}
		
//		int[] c = new int[10];
//		Arrays.fill(c, 55);
//		System.out.println("c中的元素");
//		for (int i = 0; i < c.length; i++) {
//			System.out.printf("%d\t", c[i]);
//		}
		
//		int[] f = {1,8,9,3,4};
//		Arrays.sort(f); //先对数组排序
//		int index = Arrays.binarySearch(f, 9);
//		System.out.println(index);
//		for (int i = 0; i < f.length; i++) {
//			System.out.printf("%d\t", f[i]);
//		}
		
		int[] z={1, 2, 4, 3};
		int[] l={1, 2, 3, 4};
		for (int i = 0; i < l.length; i=i+2) {
			System.out.println(l[i]);
		}
		for (int i=l.length-1; i >= 0; i--) {
			System.out.println(l[i]);
		}
		for(int a: z){
			System.out.println(a);
		}
		System.out.println(Arrays.equals(z, l));
	}
}
