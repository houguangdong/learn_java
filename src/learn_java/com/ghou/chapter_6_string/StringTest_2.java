package learn_java.com.ghou.chapter_6_string;

/***
 * 2 一个字串在整串中出现的次数
 * @author houguangdong
 * 思路:
 * 1 要找的字串是否存在，如果存在获取其出现的位置。这个可以使用indexOf完成
 * 2 如果找到了，那么就记录出现的位置并在剩余的字符串中继续查找该字串
 * 而剩余字符串的起始位置是出现位置+字符串的长度。
 * 3 以此类推，通过循环完成查找，如果找不到就是-1，并对每次找到用计数器记录
 */

public class StringTest_2 {

	public static void main(String[] args) {
		String str = "ghdasdaadsadsagagdadadsagddg";
		String key = "g";
		int count = getKeyStringCount(str, key);
		System.out.println("count="+count);
		
		int count1 = getKeyStringCount_2(str, key);
		System.out.println("count=1"+count1);
	}
	
	public static int getKeyStringCount_2(String str, String key) {
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key, index))!=1){
			index=index+key.length();
			count++;
		}
		return count;
	}

	/**
	 * 获取子串在整串中出现的次数
	 * @param str
	 * @param key
	 * @return
	 */
	public static int getKeyStringCount(String str, String key) {
		// 1 定义计数器
		int count = 0;
		// 2 定义变量记录key出现的位置
		int index = 0;
		while((index = str.indexOf(key)) != -1){
			str = str.substring(index+key.length());
			count++;
		}
		return count;
	}

}
