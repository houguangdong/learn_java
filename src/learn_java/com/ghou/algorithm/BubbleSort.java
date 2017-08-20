package learn_java.com.ghou.algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		// 1 首先写一个数组，数组里放一些无规律的数
		int[] arr = {5, 7, 4, 3, 2, 8, 9};
		// 2 对这个数组进行排序
		int count=0;
		// 2.1 控制比较的轮数
		for(int i=0; i<arr.length; i++){
			// 2.2 取得当前比较的元素和这个元素的上一个元素
			// j>i的目的是为了每轮比较时不用对上一次排出来的那个数在比了1
			boolean flag=false; //表示没有发生顺序改变
			for(int j=arr.length-1; j>i; j--){
				count++;
				int a=arr[j];
				int b=arr[j-1];
				int temp;
				//2.3 比较两个元素，小的放在大的前面
				if(a<b){
					flag=true; //改变顺序
					temp=b;
					b=a;
					a=temp;
				}
				//放回数组
				arr[j]=a;
				arr[j-1]=b;
			}//2.4 循环比较
			
			if (flag == false){
				//从来没有改变过
				break;
			}
		}
		for(int element: arr){
			System.out.println(element);
		}
		System.out.printf("====一共比较了%d次=====", count);
	}
}
