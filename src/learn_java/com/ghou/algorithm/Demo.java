package learn_java.com.ghou.algorithm;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		//1 声明一个长度为100的数组
		int[] arr1=new int[100];
		for(int i=0;i<arr1.length;i++){
			//2随机生成1-100之间的随机整数
			int x=(int)(Math.random()*100+1);
			//3将这个随机数放到数组中
			arr1[i]=x;
		}
		
		//4对数组排序
		Arrays.sort(arr1);
		int n=88;
		while(n<=100){
			//5查找有没有n这个数，n=88
			int index=Arrays.binarySearch(arr1, n);
			if(index>=0){//6如果找到了,获得n所在的索引index
				//6-1再创建一个数组，长度为index+1
				int[] arr2=new int[index+1];
				//6-2将0到index位置的元素copy到新数组中
				System.arraycopy(arr1, 0, arr2, 0, arr2.length);
				//6-3输出数组
				for(int i=0; i<arr2.length; i++){
					System.out.println(arr2[i]);
				}
				break;//结束查找
			}else{//7如果找不到,对n++
				n++;
			}
		}
		
		if(n==101){
			System.out.println("对不起，真的没找到");
		}
	}

}
