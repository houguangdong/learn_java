package learn_java.com.ghou.chapter_6;

public class chapter_6_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg = "Hello!";
//		msg = msg + "Java";
//		System.out.println(msg);
//		System.out.printf("字符串的字符长度%d\n", msg.length());
//		String tmpMsg = "Hello!Java";
//		System.out.println(tmpMsg.equals(msg));
//		String tmpMsg1 = "hello!java";
//		System.out.println(tmpMsg1.equalsIgnoreCase(msg));
//		System.out.println(msg.toLowerCase());
//		System.out.println(msg.toUpperCase());
//		String zhu = "123"; 
//		System.out.println(Byte.parseByte(zhu));
//		System.out.println(Short.parseShort(zhu));
//		System.out.println(Integer.parseInt(zhu));
//		System.out.println(Long.parseLong(zhu));
//		System.out.println(Float.parseFloat(zhu));
//		System.out.println(Double.parseDouble(zhu));
//		System.out.println(String.valueOf(1));
//		System.out.println(String.valueOf(1.0));
//		String str = new String("houguangdong");
//		System.out.println(str);
//		System.out.println(str.charAt(3));
//		System.out.println(str.indexOf('u'));
//		System.out.println(str.indexOf("on"));
//		System.out.println(str.lastIndexOf('o'));
//		System.out.println(str.lastIndexOf("o"));
//		System.out.println(str.substring(2));
//		System.out.println(str.substring(2, 5));
//		System.out.println(str.toCharArray());
//		System.out.println(str.startsWith("hou"));
//		System.out.println(str.endsWith("dong"));
//		System.out.println(str.replace('h', 'f'));
//		System.out.println(str.replace("hou", "g"));
//		System.out.println(str.compareTo("ff"));
//		System.out.println(str.trim());
//		String str1 = "houguangdong";
//		String str2 = "houguangdong";
//		System.out.println(str1 == str2);
//		String s1 = "1234";
//		String s2 = "12";
//		String s3 = (s2+"34").intern();
//		System.out.println(s1 == s3);
//		String s4 = s2+"34";
//		System.out.println(s1 == s4);
//		String str3 = new String("caterpillar");
//		String str4 = new String("caterpillar");
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4));
//		String text = "";
//		long beginTime = System.currentTimeMillis();
//		for(int i=0; i<10000; i++){
//			text = text + i;
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("运行时间：" + (endTime - beginTime));
//		StringBuilder和StringBuffer的区别在于，StringBuffer会处理同步问题，是线程安全的。StringBuilder没有处理同步问题。
//		StringBuilder builder = new StringBuilder("");
//		beginTime = System.currentTimeMillis();
//		for(int i=0; i<10000; i++){
//			builder.append(String.valueOf(i));
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("运行时间："+(endTime - beginTime));
//		在main()的参数列编写String[]args，目的就是用来接受一个字符串数组
//		System.out.print("读入的变量：");
//		for(int i=0; i<args.length; i++){
//			System.out.print(args[i]+"");
//			System.out.println();
//		}
//		使用String的split()
		String[] fakeFileData = {"justin\t64/5/26\t0939002302\t5433343", "momor\t68/7/23\t0939100391\t5432343" };
        for(String data : fakeFileData) {
            String[] tokens = data.split("\t");
             for(String token : tokens) {
                System.out.print(token + "\t| ");
            }
            System.out.println();
        }
        
//        正则表达式
        String text = "abcdebcadxbc";
        String[] tokens = text.split(".bc");
        for(String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
        tokens = text.split("..cd");
        for(String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
	}

}
