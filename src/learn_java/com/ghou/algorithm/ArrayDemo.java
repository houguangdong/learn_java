package learn_java.com.ghou.algorithm;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// 1 生成一个数组，大小为100
		int[] arr=new int[100];
		// 2 生成1-100之间的随机整数，放到数组里
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100+1);
		}
		// 2.1对数组排序
		Arrays.sort(arr);
		// 3 查找有没有12这个数
		int number=100;
		//定义一个标志，表示没有找到
		boolean flag=false; //表示没有找到
		while(number<=100){
			int index=Arrays.binarySearch(arr, number);
			// 3.1 如何找到了
			if(index>=0){
				System.out.printf("找到了%d\n",number);
				// 3.1.1 如果找到了，我们就获得这个数所在的索引
				//index就是索引
				// 3.1.2 拷贝数组，放到了一个新的数组里
				int[] arr2=new int[index+1];
				System.arraycopy(arr, 0, arr2, 0, index+1);
				for(int element: arr2){
					System.out.printf("%d\t", element);
				}
				//将标志设为找到了
				flag=true;
				break;
			}else{
				System.out.printf("没找到%d\n", number);
				// 3.2 如何没找到
				// 3.2.1 就将查找的数加一
				number++;
			}
		}
		// 3.2.2 如果加到100，还没找到，就打印没有找到
		if(flag==false){
			System.out.println("对不起，都找到了100了，还没找到");
		}
	}
}
