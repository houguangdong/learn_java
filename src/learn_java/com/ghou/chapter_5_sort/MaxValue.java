package learn_java.com.ghou.chapter_5_sort;

import java.util.Arrays;

public class MaxValue {

	int y = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3, -4, -14, -19, -109};
		int max = getMax(arr);
		System.out.println("max="+max);
		int max2 = getMax2(arr);
		System.out.println("max="+max2);
		
		int[] arr1 = {34, 19, 11, 109, 3, 56};
//		selectSort(arr1);
		bubbleSort1(arr1);
//		selectSort_2(arr1);
//		Arrays.sort(arr1);
		printArray(arr1);
		forPrint();
		
		int[] arr2 = {3, 5, 12, 14, 19, 109};
		System.out.println(halfSearch_3(arr2, 500));
		int index1 = Arrays.binarySearch(arr2, 12);  //如果存在返回的具体的角标位置，不存在返回的是 -插入点-1
		System.out.println("index1="+index1);
		toHex(26);
		toBinary(-6);
		toOctal(26);
		System.out.println(Integer.toBinaryString(-6));
		
		int x = 3;
		show(x);
		System.out.println("x="+x);
	}
	
	//遍历数组的功能
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0; x<arr.length; x++){
			if (x!=arr.length-1){
				System.out.print(arr[x]+", ");
			}else{
				System.out.println(arr[x]+"]");
			}
		}
	}
	
	public static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/**
	 * 冒泡排序
	 * 内循环:
	 * -1: 为了避免角标越界
	 * -x: 为了让外循环增加一次, 内循环参数与比较的元素个数递减
	 */
	public static void bubbleSort(int[] arr){
		for(int x=0; x<arr.length-1; x++){
			for(int y=0; y<arr.length-1-x; y++){
				if (arr[y]>arr[y+1]){
					swap(arr, y, y+1);
				}
			}
		}
	}
	
	public static void bubbleSort1(int[] arr){
		for(int x=arr.length-1; x>0; x--){
			for(int y=0; y<x; y++){
				if (arr[y]>arr[y+1]){
					swap(arr, y, y+1);
				}
			}
			for(int z=0; z < arr.length; z++){
				System.out.print(arr[z]+" ");
			}
			System.out.println(" ");
		}
	}
	
	/**
	 * 选择排序
	 * @param arr
	 * @return
	 */
	public static void selectSort(int[] arr){
		for(int x = 0; x < arr.length; x++){
			for(int y = x + 1; y < arr.length; y++){
				if (arr[x] > arr[y]){
					swap(arr, y, y+1);
				}
			}
		}
	}
	
	public static void selectSort_2(int[] arr){
		for(int x=0; x<arr.length - 1; x++){
			int num = arr[x];
			int index = x;
			for(int y=x+1; y<arr.length; y++){
				if (num>arr[y]){
					num = arr[y];
					index = y;
				}
			}
			if (index != x)
				swap(arr, x, index);
		}
	}
	
	public static int getMax(int[] arr){
		// 定义变量记录较大的值
		int maxElement = arr[0];
		for(int x = 1; x < arr.length; x++){
			if (arr[x] > maxElement){
				maxElement = arr[x];
			}
		}
		return maxElement;
	}
	
	public static int getMax2(int[] arr){
		// 初始化一个角标
		int maxIndex = 0;
		for(int x = 1; x < arr.length; x++){
			if (arr[x] > arr[maxIndex]){
				maxIndex = x;
			}
		}
		return arr[maxIndex];
	}

	
	public static void forPrint(){
//		int x = 1;
//		for(System.out.println("a"); x<3; System.out.println("c")){
//			System.out.println("d");
//			x++;
//		}
//		
//		for(int a=0, b=0; a<3; a++, b--){
//			System.out.println("f");
//		}
		
		//无限循环最简单的形式
//		while(true){
//			System.out.println("dd");
//		}
		
//		for(;;){
//			System.out.println("nn");
//		}
		
		for(int x=1; x<=5; x++){
			for(int y=1; y<x; y++){
				System.out.print("-");
			}
			
			for(int z=x; z<=5; z++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int x=0; x<3; x++){
			for(int y=0; y<4; y++){
				System.out.println("x="+x);
				break;
			}
		}
		
		// 循环标记
		xiaoqiang:for(int x=0; x<3; x++){
			wangcai:for(int y=0; y<4; y++){
				System.out.println("x="+x);
				break xiaoqiang;
			}
		}
		
		// 循环标记
		xiaoqiang:for(int x=0; x<3; x++){
			wangcai:for(int y=0; y<4; y++){
				System.out.println("x="+x);
				continue xiaoqiang;
			}
		}
	}
	
	/**
	 * 二分查找法
	 */
	public static int halfSearch(int[] arr, int key){
		int max, min, mid;
		min = 0;
		max = arr.length - 1;
		mid = (max+min)/2;
		while(arr[mid]!=key)
		{
			if (key>arr[mid])
				min = mid + 1;
			else if (key < arr[mid])
				max = mid - 1;
			if (max < min)
				return -1;
			mid = (max+min)/2;
		}
		return mid;
	}
	
	public static int halfSearch_2(int[] arr, int key){
		int max, min, mid;
		min = 0;
		max = arr.length - 1;
		
		while(min<=max)
		{
			mid = (max+min)>>1;
			if (key>arr[mid])
				min = mid + 1;
			else if (key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return -1;
	}
	
	// 有序插入数据
	public static int halfSearch_3(int[] arr, int key){
		int max, min, mid;
		min = 0;
		max = arr.length - 1;
		
		while(min<=max)
		{
			mid = (max+min)>>1;
			if (key>arr[mid])
				min = mid + 1;
			else if (key<arr[mid])
				max = mid - 1;
			else
				return mid;
		}
		return min; // -min-1 插入点
	}
	
	/**
	 * 获取一个整数的16进制表现形式
	 */
	public static void toHexOld(int num){
		for(int x=0; x<8; x++){
			int temp = num & 15;
			if (temp > 9)
				System.out.print((char)(temp - 10 + 'A'));
			else
				System.out.print(temp);
			num = num >>> 4;
		}
	}
	
	public static void toHex_1(int num){
		//定义一个对应关系表
		char[] chs = {
			'0', '1', '2', '3', 
			'4', '5', '6', '7',
			'8', '9', 'A', 'B',
			'C', 'D', 'E', 'F'
		};
		for(int x=0; x<8; x++){
			int temp = num & 15;
			System.out.print(chs[temp]);
			num = num >>> 4;
		}
	}
	
	public static void toHex_2(int num){
		if (num == 0){
			System.out.println("0");
			return;
		}
		//定义一个对应关系表
		char[] chs = {
			'0', '1', '2', '3', 
			'4', '5', '6', '7',
			'8', '9', 'A', 'B',
			'C', 'D', 'E', 'F'
		};
		char[] arr = new char[8];
		int pos = arr.length;
		while(num!=0){
			int temp = num & 15;
			arr[--pos] = chs[temp];
			num = num >>> 4;
		}
		
		System.out.println("pos="+pos);
		for(int x=pos; x<arr.length; x++){
			System.out.print(arr[x]);
		}
	}
	// 十进制 --> 十六进制
	public static void toHex(int num){
		trans(num, 15, 4);
	}
	// 十进制 --> 二进制
	public static void toBinary(int num){
		trans(num, 1, 1);
	}
	// 十进制 --> 十六进制
	public static void toOctal(int num){
		trans(num, 7, 3);
	}
	
	public static void trans(int num, int base, int offset){
		if (num == 0){
			System.out.println("0");
			return;
		}
		//定义一个对应关系表
		char[] chs = {
			'0', '1', '2', '3', 
			'4', '5', '6', '7',
			'8', '9', 'A', 'B',
			'C', 'D', 'E', 'F'
		};
		char[] arr = new char[32];
		int pos = arr.length;
		while(num!=0){
			int temp = num & base;
			arr[--pos] = chs[temp];
			num = num >>> offset;
		}
		
		System.out.println("pos="+pos);
		for(int x=pos; x<arr.length; x++){
			System.out.print(arr[x]);
		}
	}
	
	public static void show(int x){
		x = 4;
	}
}